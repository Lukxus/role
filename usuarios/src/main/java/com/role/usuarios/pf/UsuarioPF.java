package com.role.usuarios.pf;

import jakarta.persistence.Entity;

import java.time.LocalDate;

@Entity
public class UsuarioPF {

    private Long id;

    private String nome;

    private String cpf;

    private LocalDate dataNascimento;

    private Endereco endereco;

    private Contato contato;
}
