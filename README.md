<h1 align="center">
  API APRENDENDO A FAZER DEPLOY
</h1>
Api para fixar aprendizados de deploy de apis com railway

## Tecnologias
 
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
- [Railway](https://docs.railway.app/)

## Como Executar

- Clonar repositório git:
```
git clone https://github.com/Gabrielcamargos28/Api_Deploy.git
```

- Executar:
```
java -jar .libs\santander-bootcamp-0.0.1-SNAPSHOT.jar
```

## Testando

```
[Railway]apideploy-primeira.up.railway.app
[localhost] http://localhost:8080/swagger-ui/index.html
```

## Diagrama de Classes
```mermaid
classDiagram
  class User {
    -String: name
    -Account: account: 
    -Feature features[] 
    -Card card 
    -News news[] 
  }
  
  class Account {
    -String number
    -String agency
    -Number balance
    -Number limit
  }

  class Feature {
    -String icon
    -String description
  }

  class Card {
    -String number 
    -Number limit 
  }

  class News {
    -String icon 
    -String description 
  }

  User "1" *-- "1" Account : has
  User "1" *-- "1..N" Feature : has
  User "1" *-- "1" Card : has
  User "1" *-- "N" News : has
