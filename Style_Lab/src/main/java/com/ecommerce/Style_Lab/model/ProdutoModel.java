package com.ecommerce.Style_Lab.model;

import jakarta.persistence.*;

@Entity
@Table(name = "TBPRODUTO")
public class ProdutoModel {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDPRODUTO")
    private long id;
}
