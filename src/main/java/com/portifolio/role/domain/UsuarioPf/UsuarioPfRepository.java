package com.portifolio.role.domain.UsuarioPf;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
public interface UsuarioPfRepository {

    UsuarioPf save(UsuarioPf usuarioPf);

    Optional<UsuarioPf> findByUuid(UUID uuid);

    List<UsuarioPf> findAll();

    void deleteByUuid(UUID uuid);

}
