package com.sermaluc.pe;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.when;
import static org.mockito.ArgumentMatchers.any;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.http.MediaType.APPLICATION_JSON;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sermaluc.pe.controller.UsuarioController;
import com.sermaluc.pe.entities.Usuario;
import com.sermaluc.pe.service.UsuarioService;

@ExtendWith(SpringExtension.class) // Integra Spring Test Context con JUnit 5
@WebMvcTest(UsuarioController.class)
public class UsuarioControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UsuarioService usuarioService;

    @Test
    public void testRegistrarUsuario() throws Exception {
        Usuario usuario = new Usuario(); // Asegúrate de llenar el objeto con datos de prueba relevantes.
        usuario.setNombre("Test User");
        usuario.setCorreo("test@test.com");
        // Configura más propiedades según sea necesario.

        when(usuarioService.guardarUsuario(any(Usuario.class))).thenReturn(usuario);

        mockMvc.perform(post("/api/usuarios/registro")
                .contentType(APPLICATION_JSON)
                .content(new ObjectMapper().writeValueAsString(usuario)))
                .andExpect(status().isCreated());
                // Se puede agregar más expectativas según sea necesario, como el cuerpo de la respuesta.
    }
}