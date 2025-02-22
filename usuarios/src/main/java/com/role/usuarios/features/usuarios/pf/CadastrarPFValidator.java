package com.role.usuarios.features.usuarios.pf;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class CadastrarPFValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return CadastrarPFCommand.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        CadastrarPFCommand command = (CadastrarPFCommand) target;

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "nome", "nome.empty", "O nome é obrigatório.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "cpf", "cpf.empty", "O CPF é obrigatório.");
        if (command.getCpf() != null && !command.getCpf().matches("\\d{11}")) {
            errors.rejectValue("cpf", "cpf.invalido", "O CPF deve conter 11 dígitos numéricos.");
        }
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "email.empty", "O e-mail é obrigatório.");
        if (command.getEmail() != null && !command.getEmail().matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            errors.rejectValue("email", "email.invalido", "Formato de e-mail inválido.");
        }
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "senha", "senha.empty", "A senha é obrigatória.");
        if (command.getSenha() != null && command.getSenha().length() < 6) {
            errors.rejectValue("senha", "senha.curta", "A senha deve ter pelo menos 6 caracteres.");
        }
    }
}
