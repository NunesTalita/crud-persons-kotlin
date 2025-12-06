# CRUD de Pessoas em Kotlin com Spring Boot

Um projeto simples desenvolvido em **Kotlin + Spring Boot** para demonstrar as operações básicas de CRUD (Create, Read, Update, Delete) utilizando:

- Spring Web
- Spring Data JPA
- Banco de dados H2
- Padrão REST

## 🚀 Tecnologias Usadas
- Kotlin
- Spring Boot
- Spring Data JPA
- H2 Database
- Maven/Gradle
- IntelliJ IDEA

## 📌 Funcionalidades
- Criar pessoa
- Listar todas as pessoas
- Buscar pessoa por ID
- Atualizar pessoa
- Deletar pessoa

## 🔗 Endpoints

| Método | Endpoint       | Descrição |
|--------|----------------|-----------|
| GET    | /persons       | Lista todas as pessoas |
| GET    | /persons/{id}  | Busca por ID |
| POST   | /persons       | Cria nova pessoa |
| PUT    | /persons/{id}  | Atualiza pessoa |
| DELETE | /persons/{id}  | Remove pessoa |

## 🗄️ Banco de Dados H2
Acesse via navegador:

```
http://localhost:8080/h2-console
```

Configuração:
- JDBC URL: `jdbc:h2:mem:testdb`
- User: `sa`
- Password: *vazio*

## 📦 Como rodar o projeto
1. Clone o repositório
2. Abra no IntelliJ
3. Execute a classe principal `CrudPessoasApplication.kt`
4. Teste no Postman

---

📚 Projeto criado para estudo de Kotlin + Spring Boot.
