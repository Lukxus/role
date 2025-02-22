package com.role.usuarios.features.usuarios.pf;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CadastrarPFCommand {
    private String nome;
    private String cpf;
    private String email;
    private String senha;

}
