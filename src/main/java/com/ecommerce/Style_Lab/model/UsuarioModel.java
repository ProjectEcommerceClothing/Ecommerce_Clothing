package com.ecommerce.Style_Lab.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "tb_usuario")
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cdUsuario;


    @Column(unique = true, nullable = false)
    private String nmClinte;


    @Column(unique = true, nullable = false)
    private String nuCpf;

    private String nuRg;

    private Integer nuTelefone;

    private String dsEndereco;

    private String nuEndereco;

    private String flAtivo;


}
