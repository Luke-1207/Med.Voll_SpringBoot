<div align="center">

# MedVoll Clinical

![logo medvoll clinical](https://github.com/Luke-1207/Med.Voll_SpringBoot/assets/132922886/a3b876c1-8056-4ef5-8b85-54bbac566a7a)

<br>

[![Badge Desenvolvimento](https://img.shields.io/badge/status-release%20disponível-green)](https://github.com/Luke-1207/Med.Voll_SpringBoot/releases/tag/v1.0.1)
![Badge Versão](https://img.shields.io/badge/versão-v1.0.1-blue)
![Badge Lançamento](https://img.shields.io/badge/lançamento-agosto-blue)

<br>

</div>

# Índice 

* [Descrição do Projeto](#descricao-do-projeto)
* [Tecnologias Utilizadas](#tecnologias-utilizadas)
* [Acesso ao Projeto](#acesso-ao-projeto)
* [Utilização](#utilizacao)
* [Autor](#autor)

<h1><a name="descricao-do-projeto"</a> Descrição do Projeto </h1>

## ⚜ Introdução

<p>Este é o meu primeiro projeto utilizando Spring Boot, com foco no desenvolvimento Backend. O objetivo principal foi criar uma API Rest para uma clínica médica, implementando as operações CRUD (Create, Read, Update e Delete) para manipulação dos dados. Além da funcionalidade para a marcação de consultas e desmarcação.</p>

## 🛠 Estado do Projeto

<p>No momento, o resultado do projeto é satisfatório, mesmo não tendo um Frontend relacionado. As funcionalidades foram desenvolvidas com sucesso e as requisições HTTP foram testadas, demonstrando que as entregas funcionam perfeitamente. A API está pronta para ser utilizada e integrada com uma interface do usuário. Ainda mais por possuir boas práticas na API, tratamento de erros, autenticação e autorização em um controle de acesso por tokens e documentação com o SpringDoc.</p>

## 📕 Aprendizados e Desenvolvimento

<p>Durante o desenvolvimento deste projeto, pude aprofundar meus conhecimentos em Java e aprimorar minha lógica de programação. Além disso, tive a oportunidade de entender e aplicar os conceitos fundamentais do Spring Framework, como o uso do Spring Boot, JDBC e JPA.</p>
<p>O Spring se mostrou uma ferramenta poderosa e eficiente para o desenvolvimento de aplicações em Java, permitindo a abstração de muitos dos conceitos relacionados ao acesso a banco de dados e gerenciamento de transações.</p>
<p>Também fui capaz de realizar testes automatizados dentro do ambiente de desenvolvimento, compreender melhor a lógica de validação e autorização com Tokens JWT e realizar todo o tratamento de erros com os retornos dos métodos HTTP.</p>
<p>O aprendizado obtido neste projeto foi valioso, pois proporcionou a prática de diversos conceitos teóricos que havia estudado, permitindo uma visão mais clara de como desenvolver aplicações robustas e escaláveis utilizando o Spring. Futuramente, planejo desenvolver um Frontend relacionado, seja web ou mobile.</p>

<h1><a name="tecnologias-utilizadas"</a> Tecnologias Utilizadas </h1>

* Java 17
* Spring Boot
* Spring Data(JPA), Security(JWT), Doc(OpenAPI/Swagger UI)
* Bean Validation 
* Lombok
* MySQL / Flyway
* JPA / Hibernate
* Maven
* Insomnia ou Postman (Testes das Funcionalidades da API)


<h1><a name="acesso-ao-projeto"</a> Acesso ao Projeto </h1>

<p>Você pode acessar e baixar a release do projeto <a href="https://github.com/Luke-1207/Med.Voll_SpringBoot/releases/tag/v1.0.0">por aqui!</a></p>

## 🔘 Abrir e Rodar o Projeto

<p>Após baixar o projeto, siga os seguintes passos:</p>
<ol>
  <li>É necessário ter o Java 17 (no mínimo) instalado em sua máquina.</li>
  <li>Abra o diretório do projeto no seu terminal.</li>
  <li>Execute o seguinte comando em seu respectivo Sistema Operacional:</li>
      <ul>
        <li>Windows:</li>
              <pre>
              <code>
                  java "-Dspring.profiles.active=prod" "-DDATASOURCE_URL=<strong><em>URL_seu_banco</em></strong>" "-DDATASOURCE_USERNAME=<strong><em>Usuário_seu_banco</em></strong>" "-DDATASOURCE_PASSWORD=<strong><em>Senha_seu_banco</em></strong>" -jar <strong><em>.\Caminho_do_Arquivo\</em></strong>Voll_med-API-1.0.0.jar
              </code>
              </pre>
        <li>Linux e MacOS:</li>
              <pre>
              <code>
                  java -Dspring.profiles.active=prod -DDATASOURCE_URL=<strong><em>URL_seu_banco</em></strong> -DDATASOURCE_USERNAME=<strong><em>Usuário_seu_banco</em></strong> -DDATASOURCE_PASSWORD=<strong><em>Senha_seu_banco</em></strong> -jar <strong><em>./Caminho_do_Arquivo/</em></strong>Voll_med-API-1.0.0.jar
              </code>
              </pre>
      </ul>
  <li>Acesse a API REST através do seguinte endereço: <strong><em>http://localhost:8080</em></strong> </li>
  <li>Também acesse a documentação no seguinte endereço: <strong><em>http://localhost:8080/swagger-ui.html</em></strong> </li>
</ol>


<h1><a name="utilizacao"></a> 🖱 Utilização </h1>

<p>Essa API é feita para ser integrada em um Frontend relacionado, sinta-se livre para utilizá-la e testá-la como considerar melhor.</p>
<p>Para testar e realizar as requisições enquanto o projeto está em execução, acesse a documentação pelo Swagger UI e crie um Usuário no "autenticacao-controller" na funcionalidade POST "/login/cadastro" e se cadastre utilizando um e-mail comum e uma senha de livre criação. (A API ainda não possui verificações de E-mails e senhas válidas, além de possuir apenas um tipo de usuário - administrador - que pode realizar todas as requisições depois de logar-se).</p>
<p>Então, depois de se cadastrar no banco, insira o mesmo e-mail e senha na requisição de login, copiando o token gerado para o colar na opção "Authorize", na parte superior da Documentação HTML. E assim, todas as requisições estarão liberadas para uso. Nas próximas vezes, basta apenas logar-se com as credenciais cadastradas. Os Tokens expiram em 2 duras após sua geração.</p>

<br>

![documentacao_demonstracao](https://github.com/Luke-1207/Med.Voll_SpringBoot/assets/132922886/74b78cd5-61b1-4055-a563-8b26b9c613e2)

<p>Os testes também poderão ser realizados pelo Insomnia ou Postman.</p>

<h1><a name="autor"</a> Autor </h1>

| [<img loading="lazy" src="https://avatars.githubusercontent.com/u/132922886?v=4" width=115><br><sub>Lucas Fabiano</sub>](https://github.com/Luke-1207) |
| :---: | 
