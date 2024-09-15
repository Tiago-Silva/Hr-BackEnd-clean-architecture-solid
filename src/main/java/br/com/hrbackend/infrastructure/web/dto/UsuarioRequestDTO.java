package br.com.hrbackend.infrastructure.web.dto;

public record UsuarioRequestDTO(
        String nome,
        String sobrenome,
        String login,
        String senha,
        String token,
        String image,
        byte[] foto,
        String tipo,
        String role,
        boolean accountNonExpired,
        boolean accountNonLocked,
        boolean credentialsNonExpired,
        boolean enabled,
        EmpresaResponseDTO empresa
) {
}
