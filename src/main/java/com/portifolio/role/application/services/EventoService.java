package com.portifolio.role.application.services;

import com.portifolio.role.application.usecases.EventoUseCases;
import com.portifolio.role.domain.Evento.Evento;
import com.portifolio.role.domain.Evento.EventoRepository;
import jdk.jfr.Event;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class EventoService implements EventoUseCases {


    private final EventoRepository eventoRepository;

//    @Override
//    public Evento createEvento(CreateEventoRequest createEventoRequest) {
//        return null;
//    }

    @Override
    public List<Event> getAllEvento(int page, int size) {
        return List.of();
    }

    @Override
    public Evento getJogadorByUuid(UUID uuid) {
        return null;
    }

    @Override
    public void removeEventoByUuid(UUID uuid) {

    }
}
