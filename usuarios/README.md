# Módulo de Usuários

## Visão Geral
O **Módulo de Usuários** é responsável pelo gerenciamento dos usuários da aplicação, permitindo operações **CRUD** (Criar, Ler, Atualizar e Deletar) e integração com o **Keycloak** para autenticação e controle de acesso.

## Tecnologias Utilizadas
- **Spring Boot**
- **Spring Security**
- **Keycloak** (Servidor de identidade e autenticação)
- **Banco de Dados Relacional (PostgreSQL/MySQL)**
- **Spring Data JPA**

---

## Funcionalidades
### 🔹 **Gerenciamento de Usuários**
- Criar usuários
- Buscar usuários por ID
- Listar todos os usuários
- Atualizar informações do usuário
- Excluir usuários

### 🔹 **Autenticação com Keycloak**
- Registro de usuários no Keycloak
- Geração de tokens JWT
- Autorização baseada em papéis (Roles)

---

## Configuração e Execução

### **1. Configuração do Keycloak**
#### 🔹 **Rodando o Keycloak com Docker**
Caso não tenha um servidor Keycloak configurado, você pode rodá-lo com o seguinte comando:
```sh
docker run -p 8080:8080 --name keycloak -e KEYCLOAK_ADMIN=admin -e KEYCLOAK_ADMIN_PASSWORD=admin quay.io/keycloak/keycloak:latest start-dev
