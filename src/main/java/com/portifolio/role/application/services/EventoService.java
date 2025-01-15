package com.portifolio.role.application.services;

import com.portifolio.role.application.usecases.EventoUseCases;
import com.portifolio.role.domain.Evento.Evento;
import com.portifolio.role.domain.Evento.EventoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class EventoService implements EventoUseCases {


    private final EventoRepository eventoRepository;


    @Override
    public List<Evento> getAllEvento(int page, int size) {
        return List.of();
    }

    @Override
    public Evento getEventoByUuid(UUID uuid) {
        eventoRepository.findAll();
        return new Evento();
    }

    @Override
    public void removeEventoByUuid(UUID uuid) {

    }
}
