package com.sermaluc.pe.service;

import com.sermaluc.pe.entities.Usuario;

public interface UsuarioService {
	boolean validarFormatoCorreo(String correo);
    boolean validarFormatoContraseña(String contraseña);
    boolean existeCorreo(String correo);
    String generarToken(String correo);
    Usuario guardarUsuario(Usuario usuario);
}
