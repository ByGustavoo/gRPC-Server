package br.com.grpc.server.service.grpc;

import br.com.grpc.server.model.dto.EstoqueDTO;
import br.com.grpc.server.model.proto.estoque.ConsultarEstoqueRequest;
import br.com.grpc.server.model.proto.estoque.ConsultarEstoqueResponse;
import br.com.grpc.server.model.proto.estoque.EstoqueServiceGrpc.EstoqueServiceImplBase;
import br.com.grpc.server.service.EstoqueService;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.grpc.server.service.GrpcService;

@Slf4j
@GrpcService
@RequiredArgsConstructor
public class EstoqueGrpcService extends EstoqueServiceImplBase {

    private final EstoqueService estoqueService;

    @Override
    public void consultarEstoque(ConsultarEstoqueRequest request, StreamObserver<ConsultarEstoqueResponse> responseObserver) {
        log.info("Requisição gRPC recebida: ConsultarEstoque - ID Produto: [{}]", request.getIdProduto());

        try {
            var estoque = buscarEstoque(request);

            var response = ConsultarEstoqueResponse.newBuilder()
                    .setIdProduto(estoque.produtoId())
                    .setDescricao(estoque.descricao())
                    .setQuantidade(estoque.quantidade())
                    .setDisponivel(estoque.disponivel())
                    .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();

            log.info("Estoque do Produto enviado com sucesso! - ID: [{}] - Quantidade: [{}] - Disponível: [{}]",
                    estoque.produtoId(), estoque.quantidade(), estoque.disponivel());
        } catch (StatusRuntimeException ex) {
            log.warn("O Produto solicitado não foi encontrado! - ID: [{}]", request.getIdProduto());
            responseObserver.onError(ex);
        }
    }

    private EstoqueDTO buscarEstoque(ConsultarEstoqueRequest request) {
        return estoqueService.consultarEstoqueByProdutoId(request.getIdProduto())
                .orElseThrow(() -> Status.NOT_FOUND
                        .withDescription("O Produto solicitado não foi encontrado! ID: " + request.getIdProduto())
                        .asRuntimeException());
    }
}