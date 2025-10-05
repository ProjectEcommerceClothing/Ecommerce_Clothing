package com.ecommerce.Style_Lab.service;


import com.ecommerce.Style_Lab.dto.UsuarioDto;
import com.ecommerce.Style_Lab.model.UsuarioModel;
import com.ecommerce.Style_Lab.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {


    public UsuarioRepository repositorioUsuario;

    //Construtor
    public UsuarioService(UsuarioRepository usuarioRepository){
        this.repositorioUsuario=usuarioRepository;
    }

    //Listar todos
    public List<UsuarioModel> listarUsuarios(){
        return repositorioUsuario.findAll();
    }

    //Salvar
    public UsuarioModel cadastrarUsuario(UsuarioDto usuario){
        UsuarioModel usuarioM = new UsuarioModel();
        usuarioM.setNmClinte(usuario.nmCliente());
        usuarioM.setNuCpf(usuario.nuCpf());
        usuarioM.setNuRg(usuario.nuRg());
        usuarioM.setNuTelefone(usuario.nuTelefone());
        usuarioM.setDsEndereco(usuario.dsEndereco());
        usuarioM.setNuEndereco(usuario.nuEndereco());
        usuarioM.setFlAtivo(usuario.flAtivo());

        return repositorioUsuario.save(usuarioM);
    }


}
