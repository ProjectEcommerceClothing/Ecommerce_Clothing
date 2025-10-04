package com.ecommerce.Style_Lab.controller;


import com.ecommerce.Style_Lab.dto.UsuarioDto;
import com.ecommerce.Style_Lab.model.UsuarioModel;
import com.ecommerce.Style_Lab.service.UsuarioService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1")
public class UsuarioController {

    private final UsuarioService  usuarioService;

    public UsuarioController(UsuarioService usuarioService){
        this.usuarioService = usuarioService;
    }

    @GetMapping
    public List<UsuarioModel> listarUsuarios(){
        return usuarioService.listarUsuarios();
    }

    @PostMapping("/cadastrar")
    public UsuarioModel cadastrarUsuario(@RequestBody UsuarioDto usuario){
        return usuarioService.cadastrarUsuario(usuario);
    }
}
