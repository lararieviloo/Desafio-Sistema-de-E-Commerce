# Desafio Sistema de E-Commerce

Este projeto é um sistema de e-commerce básico que gerencia clientes e produtos. Ele foi desenvolvido utilizando Java com Spring Boot e inclui funcionalidades como cadastro, consulta, atualização e exclusão de clientes e produtos.

## Tecnologias Utilizadas

- **Java**
- **Spring Boot**
- **Spring Data JPA**
- **Hibernate Validator**
- **Maven**

## Endpoints da API

### Clientes

- **POST /clientes**: Cadastra um novo cliente.
    - Exemplo de requisição:
      ```json
      {
        "clientName": "João Silva",
        "cpf": "123.456.789-09",
        "email": "joao.silva@example.com"
      }
      ```

- **GET /clientes/{cpf}**: Retorna os detalhes de um cliente pelo CPF.

- **PUT /clientes/{cpf}**: Atualiza os dados de um cliente pelo CPF.

### Produtos

- **POST /produtos**: Cadastra um novo produto.
    - Exemplo de requisição:
      ```json
      {
        "productName": "Notebook",
        "price": 2500.00,
        "quantity": 10
      }
      ```

- **GET /produtos**: Retorna a lista de todos os produtos.

- **DELETE /produtos/{id}**: Exclui um produto pelo ID.

