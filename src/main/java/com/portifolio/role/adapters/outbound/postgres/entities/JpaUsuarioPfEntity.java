package com.portifolio.role.adapters.outbound.postgres.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Evento")
public class JpaUsuarioPfEntity {

    @Id
    @GeneratedValue
    private UUID uuid;

    private String nome;

    private String cpf;

    private String email;
    
    private String endereco;
    
    private String telefone;
    
    private LocalDate dataCriacao;


}
