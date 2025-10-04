package com.ecommerce.Style_Lab.controller;

import com.ecommerce.Style_Lab.model.ProdutoModel;
import com.ecommerce.Style_Lab.service.ProdutoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class ProdutoController {
    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService){
        this.produtoService = produtoService;
    }

    @GetMapping("/produtos")
    public List<ProdutoModel> listarProduto(){
        return produtoService.listarProdutos();
    }

    @GetMapping("/{cdProduto}")
    public ResponseEntity<?> listarProdutoCd(@PathVariable Integer cdProduto){
        Optional<ProdutoModel> produto = produtoService.listarProdutoCd(cdProduto);
        return ResponseEntity.ok(produto);
    }

    @PostMapping("/register")
    public ProdutoModel criarProduto(@RequestBody ProdutoModel produtoModel){
        return produtoService.registerProduto(produtoModel);
    }

    @DeleteMapping("/{cdProduto}")
    public ResponseEntity<Void> deletarProduto(@PathVariable Integer cdProduto){
        produtoService.deleteByCd(cdProduto);
        return ResponseEntity.noContent().build();
    }
}
