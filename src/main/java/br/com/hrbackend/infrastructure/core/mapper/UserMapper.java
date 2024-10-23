package br.com.hrbackend.infrastructure.core.mapper;

import br.com.hrbackend.domain.entity.User;
import br.com.hrbackend.infrastructure.data.entityDB.UsuarioDB;
import br.com.hrbackend.infrastructure.web.dto.EnterpriseResponseDTO;
import br.com.hrbackend.infrastructure.web.dto.UsuarioRequestDTO;
import br.com.hrbackend.infrastructure.web.dto.UsuarioResponseDTO;

public class UserMapper {

    public UsuarioRequestDTO domainObjectToRequestDTO(User usuario, EnterpriseResponseDTO enterprise) {
        return new UsuarioRequestDTO(
                usuario.getFirstName(),
                usuario.getLastName(),
                usuario.getUserName(),
                usuario.getPassword(),
                usuario.getToken(),
                usuario.getImage(),
                usuario.getPhoto(),
                usuario.getType(),
                usuario.getRole(),
                usuario.isAccountNonExpired(),
                usuario.isAccountNonLocked(),
                usuario.isCredentialsNonExpired(),
                usuario.isEnabled(),
                enterprise
        );
    }

    public UsuarioResponseDTO domainObjectToResponseDTO(User usuario, EnterpriseResponseDTO enterprise) {
        return new UsuarioResponseDTO(
                usuario.getUserId(),
                usuario.getFirstName(),
                usuario.getLastName(),
                usuario.getUserName(),
                usuario.getPassword(),
                usuario.getToken(),
                usuario.getImage(),
                usuario.getPhoto(),
                usuario.getType(),
                usuario.getRole(),
                usuario.isAccountNonExpired(),
                usuario.isAccountNonLocked(),
                usuario.isCredentialsNonExpired(),
                usuario.isEnabled(),
                enterprise
        );
    }

    public User requestDTOToDomainObject(UsuarioRequestDTO requestDTO) {
        return new User(requestDTO);
    }

    public User responseDTOToDomainObject(UsuarioResponseDTO responseDTO) {
        return new User(responseDTO);
    }

    public UsuarioDB toUserDB(User usuario) {
        return new UsuarioDB(usuario);
    }

    public User toUser(UsuarioDB usuarioDB) {
        return new User(usuarioDB);
    }
}
