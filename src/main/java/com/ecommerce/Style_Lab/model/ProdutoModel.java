package com.ecommerce.Style_Lab.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "TBPRODUTOS")
public class ProdutoModel {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    private Integer cdproduto;
    @Column(nullable = false)
    private String nmProduto;
    @Column(nullable = false)
    private Double vlproduto;
    private String dsProduto;
    private String flAtivo;
}
