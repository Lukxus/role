package com.portifolio.role.application.services;

import com.portifolio.role.application.usecases.EventoUseCases;
import com.portifolio.role.application.usecases.UsuarioPfUseCases;
import com.portifolio.role.domain.Evento.Evento;
import com.portifolio.role.domain.Evento.EventoRepository;
import com.portifolio.role.domain.Usuario.UsuarioPfRepository;
import com.portifolio.role.domain.UsuarioPf.UsuarioPf;
import jdk.jfr.Event;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UsuarioPfService implements UsuarioPfUseCases {


    private final UsuarioPfRepository usuarioPfRepository;


    @Override
    public List<UsuarioPf> getAllUsuarioPf(int page, int size) {
        return List.of();
    }

    @Override
    public UsuarioPf getUsuarioPfByUuid(UUID uuid) {
        return null;
    }

    @Override
    public void removeUsuarioPfByUuid(UUID uuid) {

    }
}
