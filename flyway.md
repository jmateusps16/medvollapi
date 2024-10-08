# Flyway Snippet

## Ajustes migrações com problemas
- limpa o histórico
`delete from flyway_schema_history where success = 0;`
- caso continue com o erro necessário:
  - dropar a tabela `drop database vollmed_api;`
  - recriar tabela `create database vollmed_api;`