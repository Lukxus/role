# Módulo de Comentários

## Visão Geral
O **Módulo de Comentários** permite a comunicação em tempo real entre os participantes de **eventos grandes**, utilizando **WebSockets** para garantir mensagens instantâneas e interativas.

## Tecnologias Utilizadas
- **Spring Boot** (Backend)
- **Spring WebSocket** para comunicação em tempo real
- **Banco de Dados Relacional (PostgreSQL/MySQL)** para persistência dos comentários
- **STOMP e SockJS** para suporte a WebSockets no frontend
- **React, Angular ou outra tecnologia** para interface do usuário

---

## Funcionalidade
1. **Envio e Recebimento de Comentários**
    - Os usuários podem enviar mensagens em tempo real dentro de um evento.
    - Todos os participantes do evento recebem os comentários instantaneamente.

2. **Persistência dos Comentários**
    - Comentários importantes serão armazenados em um banco **relacional** para futuras consultas.

3. **Gerenciamento de Salas**
    - Cada evento possui um canal de comunicação exclusivo.

4. **Moderação**
    - Filtragem e exclusão de mensagens inadequadas podem ser configuradas.

---

## Como Funciona
1. O usuário entra em um **evento** e é automaticamente **adicionado ao canal de WebSocket** correspondente.
2. As **mensagens enviadas** são distribuídas para todos os usuários do evento em tempo real.
3. Os **comentários são salvos** no banco de dados para referência futura.
4. A **moderação pode ser aplicada** para garantir a qualidade das interações.

---

## Estrutura do Projeto  
