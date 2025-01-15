package com.portifolio.role.application.usecases;

import com.portifolio.role.domain.Evento.Evento;

import java.util.List;
import java.util.UUID;
public interface EventoUseCases {

    //public Evento createEvento(CreateEventoRequest createEventoRequest);

    public List<Evento> getAllEvento(int page, int size);

    public Evento getEventoByUuid(UUID uuid);

    public void removeEventoByUuid(UUID uuid);
}
