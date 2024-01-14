В данном проекте был выбран Spring Rest.

Причины:
1. Главное преимущество Spring Rest является частью фреймворка Spring который имеет различные инструменты Spring Security, MVC и т.д
2. Spring Rest современный инструмент для построения Rest-full сервисов.
3. Спецификация JAX-RS требует знаний версий зависимостей.

Лабораторная работа 3 является продолжением лр 2.

Предметная область - Хранилище постов соц. сети.
Структура таблиц:

Table users:

| id  | username |  
|-----|----------|
|     |          |
|     |          |
|     |          |
TABLE posts:

| id  | title | content | user_id |
|-----|-------|---------|---------|
|     |       |         |         |
|     |       |         |         |
|     |       |         |         |

Были реализованы Rest controllers, которые формировали ответ в виде xml или json, при указании Accept: application/json или application/xml.

Точки доступа для всех методов http - [GET, POST, PUT, DELETE]:
* /api/user
* /api/user/{id}
* /api/post
* /api/post/{id}

С помощью JAXB была сгенерирована xml schema объектов для применения к ней XSL-преобразования.

Структура для post: 

    <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
    <xs:schema version="1.0" xmlns:xs="http://www.w3.org/2001/XMLSchema">
    <xs:element name="postList" type="postList"/>
    <xs:complexType name="postList">
        <xs:sequence>
            <xs:element name="post" type="post" minOccurs="0" maxOccurs="unbounded"/>
        </xs:sequence>
    </xs:complexType>
    <xs:complexType name="post">
            <xs:sequence>
                <xs:element name="content" type="xs:string" minOccurs="0"/>
                <xs:element name="id" type="xs:int"/>
                <xs:element name="title" type="xs:string" minOccurs="0"/>
            <xs:element name="user_id" type="xs:int"/>
            </xs:sequence>
        </xs:complexType>
    </xs:schema>

Структура для user:

    <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
    <xs:schema version="1.0" xmlns:xs="http://www.w3.org/2001/XMLSchema">
    <xs:element name="userList" type="userList"/>
    <xs:complexType name="userList">
        <xs:sequence>
            <xs:element name="user" type="user" minOccurs="0" maxOccurs="unbounded"/>
        </xs:sequence>
    </xs:complexType>
    <xs:complexType name="user">
        <xs:sequence>
            <xs:element name="id" type="xs:int"/>
            <xs:element name="username" type="xs:string" minOccurs="0"/>
        </xs:sequence>
    </xs:complexType>
    </xs:schema>

Было создано XSLT преобразование в файлах директории /.../xsl/

Точки доступа к представлениям
* /xsl/user
* /xsl/post

