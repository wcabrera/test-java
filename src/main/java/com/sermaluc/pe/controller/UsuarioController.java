package com.sermaluc.pe.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
 
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sermaluc.pe.entities.Usuario;
import com.sermaluc.pe.service.UsuarioService;
 

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;
    
 

    @PostMapping("/registro")
    public ResponseEntity<Object> registrarUsuario(@RequestBody Usuario usuario) {
        // Validar correo electrónico
        if (!usuarioService.validarFormatoCorreo(usuario.getCorreo())) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"mensaje\": \"Formato de correo inválido\"}");
        }

        // Validar contraseña
        if (!usuarioService.validarFormatoContraseña(usuario.getContraseña())) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"mensaje\": \"Formato de contraseña inválido\"}");
        }

        // Comprobar si el correo ya está registrado
        if (usuarioService.existeCorreo(usuario.getCorreo())) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"mensaje\": \"El correo ya está registrado\"}");
        }

        // Configurar las fechas y el token
        Date fechaActual = new Date();
        usuario.setCreated(fechaActual);
        usuario.setModified(fechaActual);
        usuario.setLastLogin(fechaActual);
        usuario.setToken(usuarioService.generarToken(usuario.getCorreo()));
        usuario.setActive(true);

        // Guardar el usuario en la base de datos
        Usuario nuevoUsuario = usuarioService.guardarUsuario(usuario);

        // Devolver la respuesta con el usuario creado
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevoUsuario);
    }
    
    
    
    
    
}