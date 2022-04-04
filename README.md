# ATIVIDADE - Rest APP com Docker

- Autor:Rafael Rossi Pereira / Michel Adriano Medeiros
- Linguagem: Java 14
- Banco de dados: MySQL
- Tecnologias: Spring, JPA, Hibernate, Docker

## Objetivo
Criar um serviço REST de cadastro e listagem de usuários que serão consumidos pelas aplicações desenvolvidas em outras etapas do curso.


## Para rodar o programa
- Tenha em sua máquina o docker e o docker-compose instalados
- Utilize o comando -> ./gradlew build
- Após buildar, rode o comando -> docker-compose up
- A aplicação estara disponível localmente em sua porta 8080
- O arquivo **ScriptBanco** tem como objetivo popular o banco de dados da aplicação. Execute a query que o arquivo contém em seu banco de dados.


## Utilizando Postman para teste
- Foi utilizado o Postman para testar os endpoints fornecidos pela aplicação. Todos os endpoints podem ser encontrados na classe UsuarioController
- Segue exemplo de Json para fornecer ao método Post de criação de usuário:
  {
  "nome": "Fulano Teste",
  "cpf": "111.111.111-11",
  "email": "fulanoteste@fiap.com",
  "cidade": "Sao Paulo",
  "telefone": "11911111122"
  }