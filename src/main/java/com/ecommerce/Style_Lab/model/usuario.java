package com.ecommerce.Style_Lab.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UsuarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cdUsuario;

    private String nmClinte;

    private String nuCpf;

    private String nuRg;

    private Integer nuTelefone;

    private String dsEndereco;

    private String nuEndereco;

    private String flAtivo;


}
