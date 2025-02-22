package com.role.usuarios.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "usuarios")
@Getter
@Setter
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String email;

    private String tipo;

    private String documento;

    @Column(name = "keycloak_id")
    private String keycloakId;

    @Column(name = "criado_em")
    private LocalDateTime criadoEm;

    public Usuario() {
        this.criadoEm = LocalDateTime.now();
    }
}
