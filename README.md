<hr>
<p align="center">
   <img src="https://github.com/renatof4rias/spring-project-delivery/assets/123312837/2a0cb045-9f7b-42af-8046-d21d6c75ae20" #vitrinedev/>
</p>
<hr>
<h1 align="center"> Movie </h1>

## Descrição do projeto 

<p align="justify">
Movie é uma aplicação backend de uma API REST.

A aplicação consiste em uma pesquisa de satisfação de um determinado filme, contendo gerenciamente de score (1 a 5), média, contagem de avaliações e cadastro de novos usuários .  
</p>

## Modelo Conceitual
![dsmovie-dominio](https://github.com/renatof4rias/spring-project-delivery/assets/123312837/293f4162-3280-4ddb-98d3-e0321f1f2747)

## Lógica utilizada

```bash
# 1- Informar email, id do filme e valor da avaliação (1 a 5).
# 2- Recuperar usuário do banco de dados pelo email. Se o usuário não existir, insira no banco.
# 3- Salvar a avaliação do usuário para o dado filme.
# 4- Recalcular a avaliação média do filme e salvar no banco de dados.
````
![dsmovie-objs](https://github.com/renatof4rias/spring-project-delivery/assets/123312837/158d93f5-3e15-4406-aaec-f96bd20277b0)

## Back end

- Java 
- Spring Boot
- JPA / Hibernate
- Maven
- MVC
- PostgreSQL
<h1 align="center"> Como execurtar o projeto </h1>

## Back end  
Pré-requisitos: Java 17

```bash
# clonar repositório
git clone git@github.com:renatof4rias/spring-project-movies

# entrar na pasta do projeto back end
cd movies

# executar o projeto
./mvnw spring-boot:run
```

<h1 align="center"> Como testar o projeto </h1>

Pré-requisitos: Postman

```bash
#END POINTS
[GET] /movies  # Adicionado à URL "/id" (/movies/1) busca do banco de dados o filme com o id referente na url.
[GET] /movies ¹ # Busca do banco de dados uma lista (PAGE) em formato de página.
[PUT] /scores ² # Insere uma avaliação ao filme escolhido.

```
Observações 
```bash
¹ # [GET] /movies adicionado à URL "?size=12" por exemplo: (/movies?size=12), a pagina terá o "tamanho" de 12 filmes por páginas.

² # [POST] /scores necesita de um "body" como parâmetro.
Exemplo : 
{
    "movieId": 4,
    "email": "seu_email@gmail.com",
    "score": 5
}

```

<h1 align="center"> Autor </h1>

Renato Gonçalves Farias

https://www.linkedin.com/in/renatof4rias/

renatof4rias@gmail.com
