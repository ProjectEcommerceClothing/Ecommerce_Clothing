package com.ecommerce.Style_Lab.dto;


public record UsuarioDto(
        String nmCliente,
        String nuCpf,
        String nuRg,
        Integer nuTelefone,
        String dsEndereco,
        String nuEndereco,
        String flAtivo
) {
}
