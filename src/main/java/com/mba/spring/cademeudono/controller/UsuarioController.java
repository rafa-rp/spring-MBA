package com.mba.spring.cademeudono.controller;

import com.mba.spring.cademeudono.dto.UsuarioRequest;
import com.mba.spring.cademeudono.model.UsuarioEntity;
import com.mba.spring.cademeudono.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("user")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping("create")
    public void createUser(@Valid @RequestBody UsuarioRequest request){
        UsuarioEntity usuario = request.userBuild();
        usuarioRepository.save(usuario);
    }

    @GetMapping("list/{userId}")
    public UsuarioEntity listarUsuario(@PathVariable("userId") Long id) {
        UsuarioEntity usuario = usuarioRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("ID inválido"));
        return usuario;
    }

    @GetMapping("list/all")
    public List<UsuarioEntity> listarAll(){
        List<UsuarioEntity> usuarios = usuarioRepository.findAll();
        return usuarios;
    }
}
