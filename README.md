# Tasks API – Spring Boot REST API

## Descrição

A Tasks API é uma aplicação backend desenvolvida com Spring Boot que permite o gerenciamento de tarefas. A API oferece operações completas de CRUD (Create, Read, Update, Delete), possibilitando criar, listar, buscar, atualizar e remover tarefas.

O projeto foi desenvolvido com foco em aprendizado de desenvolvimento backend, boas práticas e integração com banco de dados relacional.

---

## Tecnologias utilizadas

* Java 17+
* Spring Boot
* Spring Web
* Spring Data JPA
* MySQL
* Maven
* Postman

---

## Funcionalidades

* Criar uma nova tarefa
* Listar todas as tarefas
* Buscar tarefa por ID
* Atualizar tarefa
* Deletar tarefa
* Validação de campos obrigatórios
* Tratamento de erros (404 e validação)

---

## Estrutura do projeto

O projeto segue uma arquitetura em camadas:

* Controller: responsável pelas requisições HTTP
* Service: contém a lógica de negócio
* Repository: acesso ao banco de dados
* Model: representação da entidade Task
* Exception: tratamento global de erros

---

## Como rodar o projeto

### 1. Pré-requisitos

* Java 17 ou superior
* MySQL instalado
* Maven instalado

---

### 2. Criar o banco de dados

Execute o comando abaixo no MySQL:

```sql
CREATE DATABASE tasks_db;
```

---

### 3. Configurar o application.properties

Atualize o arquivo com suas credenciais:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/tasks_db
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

### 4. Executar a aplicação

Execute a aplicação pela sua IDE ou via Maven:

```bash
mvn spring-boot:run
```

---

## Endpoints principais

### Criar tarefa

POST /tasks

```json
{
  "titulo": "Estudar Spring Boot",
  "descricao": "Revisar conceitos",
  "status": "PENDENTE"
}
```

---

### Listar tarefas

GET /tasks

---

### Buscar por ID

GET /tasks/{id}

---

### Atualizar tarefa

PUT /tasks/{id}

```json
{
  "titulo": "Estudar Java",
  "descricao": "Praticar exercícios",
  "status": "CONCLUIDO"
}
```

---

### Deletar tarefa

DELETE /tasks/{id}

---

## Validações

* O campo "titulo" é obrigatório
* O campo "descricao" é obrigatório

---

## Tratamento de erros

A API retorna respostas padronizadas para erros, como:

* 400 Bad Request para dados inválidos
* 404 Not Found para recursos inexistentes

---

## Objetivo do projeto

Este projeto foi desenvolvido com o objetivo de praticar desenvolvimento backend com Java e Spring Boot, incluindo integração com banco de dados, validação de dados e organização em camadas.
