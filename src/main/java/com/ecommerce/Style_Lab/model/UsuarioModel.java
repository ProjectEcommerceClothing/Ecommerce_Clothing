package com.ecommerce.Style_Lab.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
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
    private String nuTelefone;
    private String dsEndereco;
    private String nuEndereco;
    private String flAtivo;

    /*GETTERS e SETTERS*/
    public String getNmClinte() {
        return nmClinte;
    }

    public void setNmClinte(String nmClinte) {
        this.nmClinte = nmClinte;
    }

    public String getNuCpf() {
        return nuCpf;
    }

    public void setNuCpf(String nuCpf) {
        this.nuCpf = nuCpf;
    }

    public String getNuRg() {
        return nuRg;
    }

    public void setNuRg(String nuRg) {
        this.nuRg = nuRg;
    }

    public String getNuTelefone() {
        return nuTelefone;
    }

    public void setNuTelefone(String nuTelefone) {
        this.nuTelefone = nuTelefone;
    }

    public String getDsEndereco() {
        return dsEndereco;
    }

    public void setDsEndereco(String dsEndereco) {
        this.dsEndereco = dsEndereco;
    }

    public String getNuEndereco() {
        return nuEndereco;
    }

    public void setNuEndereco(String nuEndereco) {
        this.nuEndereco = nuEndereco;
    }

    public String getFlAtivo() {
        return flAtivo;
    }

    public void setFlAtivo(String flAtivo) {
        this.flAtivo = flAtivo;
    }
}
