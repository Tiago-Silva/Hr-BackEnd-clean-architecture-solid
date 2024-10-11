package br.com.hrbackend.infrastructure.core.mapper;

import br.com.hrbackend.domain.entity.Usuario;
import br.com.hrbackend.infrastructure.data.entityDB.UsuarioDB;
import br.com.hrbackend.infrastructure.web.dto.EmpressResponseDTO;
import br.com.hrbackend.infrastructure.web.dto.UsuarioRequestDTO;
import br.com.hrbackend.infrastructure.web.dto.UsuarioResponseDTO;

public class UserMapper {

    public UsuarioRequestDTO domainObjectToRequestDTO(Usuario usuario, EmpressResponseDTO empresa) {
        return new UsuarioRequestDTO(
                usuario.getNome(),
                usuario.getSobrenome(),
                usuario.getLogin(),
                usuario.getSenha(),
                usuario.getToken(),
                usuario.getImage(),
                usuario.getFoto(),
                usuario.getTipo(),
                usuario.getRole(),
                usuario.isAccountNonExpired(),
                usuario.isAccountNonLocked(),
                usuario.isCredentialsNonExpired(),
                usuario.isEnabled(),
                empresa
        );
    }

    public UsuarioResponseDTO domainObjectToResponseDTO(Usuario usuario, EmpressResponseDTO empresa) {
        return new UsuarioResponseDTO(
                usuario.getIdusuario(),
                usuario.getNome(),
                usuario.getSobrenome(),
                usuario.getLogin(),
                usuario.getSenha(),
                usuario.getToken(),
                usuario.getImage(),
                usuario.getFoto(),
                usuario.getTipo(),
                usuario.getRole(),
                usuario.isAccountNonExpired(),
                usuario.isAccountNonLocked(),
                usuario.isCredentialsNonExpired(),
                usuario.isEnabled(),
                empresa
        );
    }

    public Usuario requestDTOToDomainObject(UsuarioRequestDTO requestDTO) {
        return new Usuario(requestDTO);
    }

    public Usuario responseDTOToDomainObject(UsuarioResponseDTO responseDTO) {
        return new Usuario(responseDTO);
    }

    public UsuarioDB toUserDB(Usuario usuario) {
        return new UsuarioDB(usuario);
    }

    public Usuario toUser(UsuarioDB usuarioDB) {
        return new Usuario(usuarioDB);
    }
}
