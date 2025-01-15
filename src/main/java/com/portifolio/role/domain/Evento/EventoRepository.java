package com.portifolio.role.domain.Evento;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
public interface EventoRepository {

    Evento save(Evento evento);

    Optional<Evento> findByUuid(UUID uuid);

    List<Evento> findAll();

    void deleteByUuid(UUID uuid);
    
}
