# Task Manager API

REST API para gerenciamento de tarefas desenvolvida com **Java + Spring Boot + PostgreSQL + Docker**.

Este projeto foi desenvolvido com foco em **portfólio backend**, demonstrando a construção de uma API RESTful com operações CRUD completas, integração com banco relacional, autenticação básica e documentação via Swagger.

---

## 🚀 Tecnologias utilizadas

* Java 21+
* Spring Boot
* Spring Web
* Spring Data JPA
* Spring Security
* PostgreSQL
* Docker
* Swagger / OpenAPI
* Lombok
* Maven

---

## 📌 Funcionalidades

A API permite:

* Criar tarefas
* Listar tarefas
* Atualizar tarefas
* Excluir tarefas

Cada tarefa contém:

* `id`
* `title`
* `description`
* `status`
* `priority`

---

## 🔐 Autenticação

A aplicação utiliza autenticação básica com **Spring Security**.

### Credenciais padrão

```text
Usuário: admin
Senha: 123456
```

Essas credenciais são utilizadas para acessar os endpoints protegidos da API.

---

## 📁 Estrutura do projeto

```text
src/main/java/com/vinicius/taskmanager
├── config
│   └── SecurityConfig.java
├── controller
│   └── TaskController.java
├── entity
│   └── Task.java
├── repository
│   └── TaskRepository.java
└── TaskmanagerApplication.java
```

---

## 🐘 Banco de dados com Docker

### Subir o container

### Windows

```bash
docker compose up -d
```

### Linux Mint / Ubuntu

```bash
docker-compose up -d
```

### Verificar se está rodando

```bash
docker ps
```

O PostgreSQL deve estar exposto na porta:

```text
5433
```

---

## ⚙️ Configuração do banco

```yaml
spring:
  datasource:
    url: jdbc:postgresql://localhost:5433/taskdb
    username: postgres
    password: 123456
```

---

## ▶️ Como executar o projeto

Execute a classe principal:

```text
TaskmanagerApplication.java
```

Ou rode pela IDE.

---

## 📘 Swagger / Teste da API

Com a aplicação rodando, acesse:

```text
http://localhost:8080/swagger-ui/index.html
```

---

## 🔗 Endpoints disponíveis

* `POST /tasks`
* `GET /tasks`
* `PUT /tasks/{id}`
* `DELETE /tasks/{id}`

---

## 🧪 Exemplo de JSON

```json
{
  "title": "Estudar Spring Boot",
  "description": "Criar CRUD completo",
  "status": "TODO",
  "priority": "HIGH"
}
```

---

## 💻 Como testar

### Criar tarefa

Use o endpoint:

```text
POST /tasks
```

### Listar tarefas

```text
GET /tasks
```

### Atualizar tarefa

```text
PUT /tasks/{id}
```

### Excluir tarefa

```text
DELETE /tasks/{id}
```

---

## 🎯 Objetivo do projeto

Este projeto foi desenvolvido com o objetivo de demonstrar conhecimentos em:

* desenvolvimento backend com Java
* APIs REST
* persistência com PostgreSQL
* Docker
* segurança com Spring Security
* documentação de APIs

---

## 👨‍💻 Autor

Desenvolvido por **Vinícius Buffon**
