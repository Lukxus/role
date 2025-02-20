# Aplicação de Eventos

- **Eventos pequenos**: Base não relacional
- **Eventos grandes**: Base relacional

## Função
Este módulo é responsável por gerenciar os eventos da aplicação de roles.

- Caso o evento criado tenha um **escopo maior**, ele será armazenado em um **banco de dados relacional**, pois há menos eventos desse tipo. Isso permite uma melhor organização relacional das informações.
- Caso o evento criado tenha um **escopo menor**, ele será armazenado em um **banco de dados não relacional**, pois há um número maior desses eventos. Como seu objetivo é organizar eventos locais, a quantidade de informações armazenadas será menos detalhada.  
