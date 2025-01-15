package com.portifolio.role.domain.Evento;


import com.portifolio.role.domain.UsuarioPf.UsuarioPf;

import java.sql.Time;
import java.util.UUID;
public class Evento {

    private UUID id;
    private UsuarioPf usuarioCriador;
    private String nome;
    private Time time;

}
