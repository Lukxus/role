# Módulo de Gerenciamento de Usuários (PJ e PF)

Este módulo faz parte do projeto **ROLE**, desenvolvido pelos devs **Luiz Octavio** e **Magno Luiz**.

## Sobre o Módulo

- **Funcionalidade principal**: Microsserviço de gerenciamento de usuários (PJ e PF).
- **Arquitetura empregada**: Vertical Slice, focada em casos de uso.
  - **Motivo da escolha**:
    - Facilidade de possíveis alterações.
    - Baixo acoplamento.
    - Leitura e interpretação mais simples do código.

## Metodologia de Desenvolvimento

- **TDD (Test-Driven Development)**: Todo o código é escrito já com testes.
- **Testes**:
  - **Unitários**.
  - **Integração** (validação de vários componentes funcionando juntos).

## Funcionalidades Principais

- **Criação de contas de usuários**:
  - Dentro da própria aplicação (compartilhado com outros módulos).
  - Também no **Keycloak**.

- **Banco de dados**:
  - **PostgreSQL** para armazenamento das informações necessárias.
  - **Liquibase** para gerenciamento de versões.
  - **H2** (banco em memória) para a realização dos testes.

- **Ferramentas de Testes**:
  - **ArchUnit** (validações de arquitetura).
  - **JUnit** (testes unitários e integrados).

## Considerações Iniciais sobre a Arquitetura

**Data**: 24/02/2025

Uma decisão importante a ser tomada é quanto à separação de itens (por exemplo, controllers e repositórios) em cada um dos casos de uso. Após discussão, chegou-se às seguintes conclusões:

- **Controllers**: Serão separadas para deixar o código mais fácil de ler e interpretar.
- **Repositories**:
  - Como ao criar uma `Specification` é possível eliminar diversas buscas, é provável que a classe de repositório não sofra grandes alterações e nem se torne extensa em código.
  - Assim, decidiu-se por manter apenas uma repositório por bloco lógico de features.

### Keycloak

**Data**: 26/02/2025

- Configurado de forma automática por meio de um arquivo **JSON**.
- Permite que o container já inicie com as configurações necessárias para a aplicação rodar da forma desejada.
