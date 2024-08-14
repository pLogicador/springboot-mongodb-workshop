# MongoDB com Spring Boot
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/pLogicador/springboot-mongodb-workshop/blob/main/LICENSE) 


# Sobre o projeto
Este projeto é uma aplicação Spring Boot que integra um banco de dados NoSQL MongoDB. Foi desenvolvido com o objetivo de explorar os conceitos fundamentais de bancos de dados orientados a documentos, 
abordando desde operações básicas de CRUD até a implementação de consultas complexas utilizando Spring Data e MongoRepository. Além disso, o projeto inclui a criação de associações entre objetos, 
tanto através de objetos aninhados quanto de referências, proporcionando uma visão prática das diferentes abordagens disponíveis ao trabalhar com MongoDB.

O projeto visa, principalmente, apresentar as principais diferenças entre os paradigmas de bancos de dados orientados a documentos e relacionais, 
refletindo sobre decisões de design que podem influenciar o desempenho e a escalabilidade de aplicações modernas.



# Tecnologias utilizadas
## Back end
- Spring Boot
- MongoDB
- Spring Data MongoDB
- Maven

## Front-end
- Spring Web

## Pré-requisitos: Java 11, MongoDB, Maven

## Passos para compilar e executar
<details>
  <summary><strong>1. Configurar o ambiente</strong></summary>
  
* Instalar o Java:
1. Baixe e instale o JDK 11 ou superior do Oracle.
2. Configure a variável de ambiente `JAVA_HOME` para o diretório onde o JDK foi instalado (Ex: `C:\Program Files\Java\jdk-11`).

* Instalar o MongoDB:
1. Windows: Baixe e instale o MongoDB Community Server e configure a variável PATH para incluir o diretório do MongoDB.
2. Mac: Use o Homebrew para instalar o MongoDB e configure a pasta /data/db.

* Instalar o Maven:
1. Baixe o Maven do site oficial.
2. Extraia o arquivo e configure a variável de ambiente para o diretório onde o Maven foi extraído.
3. Adicione o diretório `bin` do Maven ao `PATH`.

</details>
<details>
  <summary><strong>2. Clonar o repositório</strong></summary>

1. Clone o repositório do projeto para sua máquina local usando o comando:
````bash
git clone https://github.com/pLogicador/mongodb-springboot-workshop.git
````
2. Navegue até o diretório do projeto:

`````bash
cd mongodb-springboot-workshop
``````
</details>
<details>
  <summary><strong>3. Construir o projeto</strong></summary>
  
1. Compile e construa o projeto usando o Maven com o comando:

`````bash
mvn clean install
``````
</details>
<details>
  <summary><strong>4. Executar a aplicação</strong></summary>
1. Certifique-se de que o MongoDB esteja em execução. Você pode iniciar o MongoDB com o comando:
  
`````bash
mongod
``````
2. Execute o JAR gerado, use o comando

`````bash
java -jar target/nome-do-arquivo.jar
``````

</details>
<details>
  <summary><strong>5. Acessar a aplicação</strong></summary>
1. Após iniciar a aplicação, você pode acessar o endpoint padrão do Spring Boot no navegador ou com ferramentas de API, como o Postman:
  
URL: http://localhost:8080

</details>

# Agradecimentos
Gostaria de expressar meus sinceros agradecimentos ao [Prof. Dr. Nelio Alves](https://github.com/acenelio), que me guiou durante todo o processo de desenvolvimento deste projeto. 
Sua paciência, conhecimento e dedicação foram fundamentais para que eu pudesse aplicar os conceitos aprendidos e concluir este projeto com sucesso.

# Autor

 Pedro Miranda - pLogicador

[LinkedIn](https://www.linkedin.com/in/pedroesm/)
