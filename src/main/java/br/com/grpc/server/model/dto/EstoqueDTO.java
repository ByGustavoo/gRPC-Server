package br.com.grpc.server.model.dto;

public record EstoqueDTO(

        Integer produtoId,

        String descricao,

        Integer quantidade,

        Boolean disponivel

) {}