
<div>

## Дипломная работа "Профессия Java-разработчик ISA" от Skypro
</div>

___
### Разработчик
- [Елена Довыдова]

___
## Описание проекта и его функциональность

Данный проект является онлайн-маркетом. В качестве пользовательского функционала предоставляется возможность размещения объявлений и комментариев относительно товаров, которые вы желаете продать или приобрести.

Система также поддерживает следующие действия:

- Авторизация и аутентификация пользователей;

- CRUD-операции, используемые для создания, удаления, изменения без ограничений объявлений на сайте;

- CRUD-операции, используемые для создания, удаления, изменения без ограничений комментариев, написанных пользователями;

- Возможность пользователей создавать, изменять, удалять свои объявления и комментарии, администраторы могут выбрать удалить или редактировать данные об объявлениях и комментарии;

- Наш веб-сайт имеет функцию поисковика, находящуюся в шапке сайта, которая позволяет пользователю искать определенные объявления только по названию;

- Технология загрузки и визуализации изображений в пределах товаров и аватаров пользователей.
___
## Запуск приложения
* Для запуска приложения Вам потребуется выполнить несколько шагов:
  - Клонировать проект и открыть его в среде разработки (например, *IntelliJ IDEA* или *VSCode*);
  - В файле **application.properties** указать путь к Вашей базе данных;
  - Запустить **Docker**;
  - В командной строке прописать ```docker pull ghcr.io/bizinmitya/front-react-avito:latest``` и скачать образ;
  - Запустить **Docker image** с помощью команды ```docker run -p 3000:3000 ghcr.io/bizinmitya/front-react-avito:latest```;
  - Запустить метод **main** в файле **MarketplaceApplication.java**.

После выполнения всех шагов, веб-приложение будет доступно по адресу: http://localhost:3000

Swagger будет доступен по адресу: http://localhost:8080/swagger-ui/index.html

___
## Стэк технологий
* **Backend**:
    - Java 11
    - Maven
    - Spring Boot
    - Spring Web
    - Spring Data JPA
    - Spring Security
    - Stream API
    - REST
    - GIT
    - Swagger
    - Lombok
    - Mapstruck
* **SQL**:
    - PostgreSQL
    - Liquibase
* **Test**:
    - Junit
    - Mockito
* **Frontend**:
    - Docker image

___
## Задание
- [Technical task](https://skyengpublic.notion.site/02df5c2390684e3da20c7a696f5d463d)




 