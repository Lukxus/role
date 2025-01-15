package com.portifolio.role.adapters.inbound;

import com.portifolio.role.application.usecases.UsuarioPfUseCases;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/usuario-pf")
public class UsuarioController {

    private Map<String, UsuarioPfUseCases> map = new HashMap<>();
    
}
