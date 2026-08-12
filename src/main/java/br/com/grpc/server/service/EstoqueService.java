package br.com.grpc.server.service;

import br.com.grpc.server.model.dto.EstoqueDTO;
import br.com.grpc.server.repository.EstoqueRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EstoqueService {

    private final EstoqueRepository estoqueRepository;

    public Optional<EstoqueDTO> consultarEstoqueByProdutoId(Integer produtoId) {
        return estoqueRepository.findById(produtoId)
                .map(estoque -> new EstoqueDTO(
                        estoque.getProdutoId(),
                        estoque.getDescricao(),
                        estoque.getQuantidade(),
                        estoque.getDisponivel()));
    }
}