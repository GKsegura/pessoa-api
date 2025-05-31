# 📚 Pessoa API - Spring Boot Project

![Java CI](https://github.com/GKsegura/pessoa-api/actions/workflows/java.yml/badge.svg)
![Version](https://img.shields.io/badge/version-v1.0.0-BA55D3?style=for-the-badge)

Este é um projeto de API RESTful desenvolvido com Spring Boot que permite o gerenciamento de pessoas, incluindo operações de criação, leitura, atualização e exclusão (CRUD).

## 🚀 Tecnologias Utilizadas

- Java 17+
- Spring Boot
- Spring Data JPA
- H2 Database (banco em memória)
- Maven
- GitHub Actions (CI/CD)
- RESTful API
- **Swagger (OpenAPI) para documentação automática**

## 📦 Endpoints

| Método | Endpoint          | Descrição                     |
| ------ | ----------------- | ----------------------------- |
| GET    | /api/pessoas      | Lista todas as pessoas        |
| GET    | /api/pessoas/{id} | Busca uma pessoa por ID       |
| POST   | /api/pessoas      | Cria uma nova pessoa          |
| PUT    | /api/pessoas/{id} | Atualiza uma pessoa existente |
| DELETE | /api/pessoas/{id} | Deleta uma pessoa             |

## 📚 Documentação Automática (Swagger UI)

A API está documentada automaticamente com Swagger, facilitando a visualização e testes dos endpoints diretamente pelo navegador.

Acesse a documentação em:
[http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)

Essa interface é gerada dinamicamente a partir do código, garantindo que a documentação esteja sempre atualizada com a API real.

## ⚙️ Como Rodar Localmente

```bash
# Clone o repositório
git clone https://github.com/GKsegura/pessoa-api.git
cd pessoa-api

# Rode a aplicação (via IDE ou terminal)
./mvnw spring-boot:run
```

Acesse a API em: `http://localhost:8080/api/pessoas`

## ✅ Testes

Você pode rodar os testes com:

```bash
./mvnw test
```

## 📄 Banco de Dados H2

Acesse o console em: `http://localhost:8080/h2-console`
JDBC URL: `jdbc:h2:mem:testdb`
Usuário: `sa`
Senha: _(em branco)_

## 🤖 CI/CD com GitHub Actions

Este projeto possui integração contínua com GitHub Actions. A cada `push` no repositório, a pipeline é executada automaticamente para rodar testes e verificar se a build está estável.

## 🧠 Autor

Desenvolvido por [José Segura 👨‍💻](https://gksegura.netlify.app)

## 🪪 Licença

Este projeto está licenciado sob a Licença MIT - veja o arquivo [LICENSE](LICENSE) para mais detalhes.
