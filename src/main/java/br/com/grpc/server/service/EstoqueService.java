package br.com.grpc.server.service;

import br.com.grpc.server.estoque.ConsultarEstoqueRequest;
import br.com.grpc.server.estoque.ConsultarEstoqueResponse;
import br.com.grpc.server.estoque.EstoqueServiceGrpc.EstoqueServiceImplBase;
import io.grpc.stub.StreamObserver;
import org.springframework.stereotype.Service;

@Service
public class EstoqueService extends EstoqueServiceImplBase {

    @Override
    public void consultarEstoque(ConsultarEstoqueRequest request, StreamObserver<ConsultarEstoqueResponse> responseObserver) {
        var response = ConsultarEstoqueResponse.newBuilder()
                .setIdProduto(request.getIdProduto())
                .setDescricao("Produto teste")
                .setQuantidade(10)
                .setDisponivel(true)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}