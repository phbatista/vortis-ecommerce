package com.ecommerce.vortis.service;

import java.util.List;

import com.ecommerce.vortis.model.Usuario;
import com.ecommerce.vortis.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    public Usuario save(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public Usuario findById(Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        usuarioRepository.deleteById(id);
    }
}
