package com.ecommerce.Style_Lab.repository;

import com.ecommerce.Style_Lab.model.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoModel, Integer> {

}
