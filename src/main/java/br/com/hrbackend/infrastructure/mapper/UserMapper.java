package br.com.hrbackend.infrastructure.mapper;

import br.com.hrbackend.domain.entity.Usuario;
import br.com.hrbackend.infrastructure.db.entityDB.UsuarioDB;
import br.com.hrbackend.infrastructure.dto.EmpresaResponseDTO;
import br.com.hrbackend.infrastructure.dto.UsuarioRequestDTO;
import br.com.hrbackend.infrastructure.dto.UsuarioResponseDTO;

public class UserMapper {

    public UsuarioRequestDTO domainObjectToRequestDTO(Usuario usuario, EmpresaResponseDTO empresa) {
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

    public UsuarioResponseDTO domainObjectToResponseDTO(Usuario usuario, EmpresaResponseDTO empresa) {
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
