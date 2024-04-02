package com.sermaluc.pe.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sermaluc.pe.entities.Usuario;
import com.sermaluc.pe.repository.UsuarioRepository;

//import io.jsonwebtoken.Jwts;
//import io.jsonwebtoken.SignatureAlgorithm;

@Service
public class UsuarioServiceImpl implements UsuarioService {
//
//	String jwtSecret = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhcHAiOiJzZXJtYWx1Yy1hcHAifQ.IbczUe3GmFSubaC5lZW3cjMj0QeEwdfocJ2Lp-Ciu2U";
//	int jwtExpirationMs = 3600000;

	@Autowired
	private UsuarioRepository usuarioRepository;

	public boolean validarFormatoCorreo(String correo) {
		// Se implementa lógica de validación del formato de correo
		return correo.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$");
	}

	public boolean validarFormatoContraseña(String contraseña) {
		// Se puede implementar la lógica de validación del formato de contraseña
		// Por ejemplo, en este caso tenemos longitud mínima, caracteres especiales requeridos, etc.
		return contraseña.length() >= 8;
	}

	public boolean existeCorreo(String correo) {
		// Verificar si el correo ya existe en la base de datos
		return usuarioRepository.findByCorreo(correo) != null;
	}

	public String generarToken(String correo) {
		// Aquí Se muestra la lógica para generar un token único

		//return Jwts.builder().setSubject(correo).setIssuedAt(new Date())
		//		.setExpiration(new Date((new Date()).getTime() + 11010101))
		//	.signWith(SignatureAlgorithm.HS512, "aa").compact();
		return "";
	}

	public Usuario guardarUsuario(Usuario usuario) {
		// Guardar el usuario en la base de datos
		return usuarioRepository.save(usuario);
	}
}