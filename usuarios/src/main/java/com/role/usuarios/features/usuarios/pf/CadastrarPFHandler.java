package com.role.usuarios.features.usuarios.pf;


import org.springframework.stereotype.Service;

@Service
public class CadastrarPFHandler {

    private final UsuarioRepository usuarioRepository;
    private final KeycloakService keycloakService;

    public CadastrarPFHandler(UsuarioRepository usuarioRepository, KeycloakService keycloakService) {
        this.usuarioRepository = usuarioRepository;
        this.keycloakService = keycloakService;
    }

    public ResultadoCadastroPF handle(CadastrarPFCommand command) {
        // 1. Registrar o usuário no Keycloak (a senha é utilizada apenas aqui)
        KeycloakResponse keycloakResponse = keycloakService.criarUsuario(
                command.getNome(), command.getEmail(), command.getCpf(), command.getSenha());

        // 2. Criar o objeto de domínio para o usuário PF sem armazenar a senha
        Usuario usuario = new Usuario();
        usuario.setNome(command.getNome());
        usuario.setEmail(command.getEmail());
        usuario.setTipo("PF");  // Identifica Pessoa Física
        usuario.setDocumento(command.getCpf());
        // Opcional: armazene o identificador do usuário retornado pelo Keycloak
        usuario.setKeycloakId(keycloakResponse.getUserId());

        // 3. Persistir o usuário no banco de dados (sem a senha)
        usuarioRepository.cadastrarUsuario(usuario);

        // 4. Montar e retornar o resultado do cadastro
        ResultadoCadastroPF resultado = new ResultadoCadastroPF();
        resultado.setSucesso(true);
        resultado.setMensagem("Usuário PF cadastrado com sucesso no Keycloak e persistido localmente.");
        resultado.setTokenJWT(keycloakResponse.getToken());
        return resultado;
    }

    public static class ResultadoCadastroPF {
        private boolean sucesso;
        private String mensagem;
        private String tokenJWT;

        // Getters e Setters
        public boolean isSucesso() {
            return sucesso;
        }

        public void setSucesso(boolean sucesso) {
            this.sucesso = sucesso;
        }

        public String getMensagem() {
            return mensagem;
        }

        public void setMensagem(String mensagem) {
            this.mensagem = mensagem;
        }

        public String getTokenJWT() {
            return tokenJWT;
        }

        public void setTokenJWT(String tokenJWT) {
            this.tokenJWT = tokenJWT;
        }
    }
}
