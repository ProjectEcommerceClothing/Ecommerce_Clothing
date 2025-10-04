package com.ecommerce.Style_Lab.service;

import com.ecommerce.Style_Lab.model.ProdutoModel;
import com.ecommerce.Style_Lab.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {
    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository){
        this.produtoRepository = produtoRepository;
    }

    public ProdutoModel registerProduto(ProdutoModel produtoModel){
        return produtoRepository.save(produtoModel);
    }

    public List<ProdutoModel> listarProdutos(){
        return produtoRepository.findAll();
    }

    public Optional<ProdutoModel> listarProdutoCd(Integer cdProduto){
        return this.produtoRepository.findById(cdProduto);
    }

    public void deleteByCd(Integer cdProduto){
        if (!produtoRepository.existsById(cdProduto)){
            throw new RuntimeException();
        }
        produtoRepository.deleteById(cdProduto);
    }
}
