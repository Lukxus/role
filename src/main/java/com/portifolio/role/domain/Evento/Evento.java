package com.portifolio.role.domain.Evento;

import com.portifolio.role.domain.Usuario.TipoCriador;
import com.portifolio.role.domain.Usuario.UsuarioPf;


import java.sql.Time;
import java.util.UUID;
public class Evento {

    private UUID id;
    private UsuarioPf usuarioCriador;
    private TipoCriador tipoCriador;
    private String nome;
    private Time time;

}
