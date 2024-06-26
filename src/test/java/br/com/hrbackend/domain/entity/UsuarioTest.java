package br.com.hrbackend.domain.entity;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class UsuarioTest {

    private Usuario criarUsuarioMock() {
        Usuario usuarioMock = Mockito.mock(Usuario.class);

        Mockito.when(usuarioMock.getIdusuario()).thenReturn(1);
        Mockito.when(usuarioMock.getNome()).thenReturn("Tiago");
        Mockito.when(usuarioMock.getSobrenome()).thenReturn("Silva");
        Mockito.when(usuarioMock.getLogin()).thenReturn("tiago@silva");
        Mockito.when(usuarioMock.getSenha()).thenReturn("senha_segura");
        Mockito.when(usuarioMock.getTipo()).thenReturn("client");
        Mockito.when(usuarioMock.getRole()).thenReturn("ADMIN");
        Mockito.when(usuarioMock.isAccountNonExpired()).thenReturn(true);
        Mockito.when(usuarioMock.isAccountNonLocked()).thenReturn(true);
        Mockito.when(usuarioMock.isCredentialsNonExpired()).thenReturn(true);
        Mockito.when(usuarioMock.isEnabled()).thenReturn(true);
        Mockito.when(usuarioMock.getEmpresa()).thenReturn(new Empresa());

        return usuarioMock;
    }

    @Test
    public void shouldHaveRequiredFields() {
        Usuario usuario = criarUsuarioMock();

        assertEquals(1, usuario.getIdusuario());
        assertEquals("Tiago", usuario.getNome());
        assertEquals("Silva", usuario.getSobrenome());
        assertEquals("tiago@silva", usuario.getLogin());
        assertEquals("senha_segura", usuario.getSenha());
        assertEquals("client", usuario.getTipo());
        assertEquals("ADMIN", usuario.getRole());
        assertTrue(usuario.isAccountNonExpired());
        assertTrue(true, String.valueOf(usuario.isAccountNonLocked()));
        assertTrue(true, String.valueOf(usuario.isCredentialsNonExpired()));
        assertTrue(true, String.valueOf(usuario.isEnabled()));
        assertEquals(new Empresa(), usuario.getEmpresa());
    }
}
