# ATIVIDADE - FRONT-END + BACK-END
Entregáveis - SEGUNDA ETAPA

- Autor:Rafael Rossi Pereira / Michel Adriano Medeiros
- Linguagem: Java 14
- Banco de dados: MariaDB MySQL
- Tecnologias: Spring, JPA, Hibernate, Thymeleaf

## Objetivo
Criar um serviço REST de cadastro e listagem de usuários que serão consumidos pelas aplicações desenvolvidas em outras etapas do curso.


## Para rodar o programa
- Tenha o JDK 14 e um banco de dados MySQL instalados. (Exemplo utilizado: MariaDB Server)
- Em seu banco de dados crie uma database com o nome de **fiap**
- Configure o arquivo **application.properties** com o seu usuário e senha do banco de dados.
- Baixe e execute o programa.
- O arquivo **ScriptBanco** tem como objetivo popular o banco de dados da aplicação. Execute a query que o arquivo contém em seu banco de dados.


## Utilizando Postman para teste
- Foi utilizado o Postman para testar os endpoints fornecidos pela aplicação. Todos os endpoints podem ser encontrados na classe UsuarioController
- Segue exemplo de Json para fornecer ao método Post de criação de usuário:
  {
  "nome": "Fulano Teste",
  "cpf": "111.111.111-11",
  "email": "fulanoteste@fiap.com",
  "cidade": "Sao Paulo",
  "telefone": "11911111111"
  }