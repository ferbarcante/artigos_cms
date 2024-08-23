# CMS de Artigos com Spring

Este projeto é um sistema de gerenciamento de conteúdo (CMS) para artigos, desenvolvido usando Spring Framework. O sistema permite criar, listar, atualizar e excluir artigos, proporcionando uma interface eficiente e organizada para a gestão de conteúdos.
Funcionalidades

    CRUD Completo para Artigos: Criação, leitura, atualização e exclusão de artigos com mapeamento de entidades utilizando JPA.
    Estrutura Modular: Projeto organizado em módulos, com separação clara entre as camadas de controle, serviço e repositório.
    Integração com PostgreSQL: Persistência de dados realizada em um banco de dados PostgreSQL, aproveitando o poder do Spring Data JPA.
    Rotas RESTful: APIs bem definidas para interação com os recursos de artigos, seguindo as melhores práticas de design de APIs REST.
    Validação e Manipulação de Exceções: Validações de entrada implementadas e tratamento centralizado de exceções.

## Tecnologias Utilizadas

    Spring Boot
    Spring Data JPA
    PostgreSQL
    Hibernate
    Lombok

## Como Executar

    Clone o repositório:

    bash

git clone https://github.com/seu-usuario/nome-do-repositorio.git

Configure o banco de dados no arquivo application.properties.
Execute a aplicação:

bash

    ./mvnw spring-boot:run

### TODO:

    Implementar autenticação e autorização.
    Melhorar a interface do usuário para gerenciamento de artigos.
    Adicionar testes unitários e de integração.
