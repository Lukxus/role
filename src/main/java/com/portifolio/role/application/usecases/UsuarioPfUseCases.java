package com.portifolio.role.application.usecases;

import com.portifolio.role.domain.UsuarioPf.UsuarioPf;

import java.util.List;
import java.util.UUID;
public interface UsuarioPfUseCases {

    //public Evento createEvento(CreateUsuarioPfRequest createUsuarioPfRequest);

    public List<UsuarioPf> getAllUsuarioPf(int page, int size);

    public UsuarioPf getUsuarioPfByUuid(UUID uuid);

    public void removeUsuarioPfByUuid(UUID uuid);
}
