package com.role.usuarios.features.usuarios.pf;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/usuarios/pf")
public class PFController {

    private final CadastrarPFHandler handler;
    private final CadastrarPFValidator validator;

    public PFController(CadastrarPFHandler handler) {
        this.handler = handler;
        this.validator = new CadastrarPFValidator();
    }

    @PostMapping
    public ResponseEntity<?> cadastrar(@RequestBody CadastrarPFCommand command) {
        BindingResult result = new BeanPropertyBindingResult(command, "cadastrarPFCommand");
        validator.validate(command, result);
        if (result.hasErrors()) {
            return ResponseEntity.badRequest().body(result.getAllErrors());
        }
        CadastrarPFHandler.ResultadoCadastroPF resultado = handler.handle(command);
        if (resultado.isSucesso()) {
            return ResponseEntity.ok(resultado);
        }
        return ResponseEntity.status(500).body("Erro ao cadastrar usuário.");
    }
}
