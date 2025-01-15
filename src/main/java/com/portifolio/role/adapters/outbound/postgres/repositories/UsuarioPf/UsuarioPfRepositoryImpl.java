package com.portifolio.role.adapters.outbound.postgres.repositories.UsuarioPf;

import com.portifolio.role.domain.UsuarioPf.UsuarioPfRepository;
import com.portifolio.role.domain.UsuarioPf.UsuarioPf;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public class UsuarioPfRepositoryImpl implements UsuarioPfRepository {

    private final JpaUsuarioPfRepository jpaUsuarioPfRepository;

    public UsuarioPfRepositoryImpl(JpaUsuarioPfRepository jpaUsuarioPfRepository) {
        this.jpaUsuarioPfRepository = jpaUsuarioPfRepository;
    }

    @Override
    public UsuarioPf save(UsuarioPf usuarioPf) {
        return null;
    }

    @Override
    public Optional<UsuarioPf> findByUuid(UUID uuid) {
        return Optional.empty();
    }

    @Override
    public List<UsuarioPf> findAll() {
        return List.of();
    }

    @Override
    public void deleteByUuid(UUID uuid) {

    }
}
