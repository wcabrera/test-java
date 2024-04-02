package com.sermaluc.pe.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sermaluc.pe.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByCorreo(String correo);
}
