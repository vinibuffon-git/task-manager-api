# Task Manager API

REST API para gerenciamento de tarefas desenvolvida com **Java + Spring Boot + PostgreSQL + Docker**.

Este projeto foi desenvolvido com foco em **portfólio backend**, demonstrando a construção de uma API RESTful com operações CRUD completas, integração com banco relacional e documentação via Swagger.

---

## 🚀 Tecnologias utilizadas

- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- Spring Security
- PostgreSQL
- Docker
- Swagger / OpenAPI
- Lombok
- Maven

---

## 📌 Funcionalidades

A API permite:

- Criar tarefas
- Listar tarefas
- Atualizar tarefas
- Excluir tarefas

Cada tarefa contém:

- `id`
- `title`
- `description`
- `status`
- `priority`

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

```bash
docker compose up -d
```

### Verificar se está rodando

```bash
docker ps
```

---

## ▶️ Como executar o projeto

Execute a classe principal:

`TaskmanagerApplication.java`

---

## 📘 Swagger / Teste da API

Com a aplicação rodando, acesse:

`http://localhost:8080/swagger-ui/index.html`

---

## 🔗 Endpoints disponíveis

- `POST /tasks`
- `GET /tasks`
- `PUT /tasks/{id}`
- `DELETE /tasks/{id}`

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

## 👨‍💻 Autor

Desenvolvido por **Vinícius Buffon**
