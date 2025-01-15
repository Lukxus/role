package com.portifolio.role.adapters.outbound.postgres.repositories.Evento;

import com.portifolio.role.domain.Evento.Evento;
import com.portifolio.role.domain.Evento.EventoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public class EventoRepositoryImpl implements EventoRepository {


    private final JpaEventoPfRepository jpaEventoPfRepository;

    public EventoRepositoryImpl(JpaEventoPfRepository jpaEventoPfRepository) {
        this.jpaEventoPfRepository = jpaEventoPfRepository;
    }

    @Override
    public Evento save(Evento evento) {
        return null;
    }

    @Override
    public Optional<Evento> findByUuid(UUID uuid) {
        return Optional.empty();
    }

    @Override
    public List<Evento> findAll() {
        return List.of();
    }

    @Override
    public void deleteByUuid(UUID uuid) {

    }
}
