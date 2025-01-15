package com.portifolio.role.domain.Usuario;

public enum TipoCriador {

    PF(1, "Pessoa Fisica"),
    PJ(2, "Pessoa Juridica");

    private final int id;
    private final String nome;

    TipoCriador(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
    
}
