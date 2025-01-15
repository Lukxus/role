package com.portifolio.role.application.usecases;

import com.portifolio.role.domain.Evento.Evento;
import jdk.jfr.Event;

import java.util.List;
import java.util.UUID;
public interface EventoUseCases {

    //public Evento createEvento(CreateEventoRequest createEventoRequest);

    public List<Event> getAllEvento(int page, int size);

    public Evento getJogadorByUuid(UUID uuid);

    public void removeEventoByUuid(UUID uuid);
}
