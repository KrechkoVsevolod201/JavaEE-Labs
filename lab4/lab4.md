Лабораторная работа 4 является продолжением лр 3.

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

В данной работе была добавлена таблица LogEntry - в которую сохраняются все изменения связанные с бизнес объектом. 

TABLE LogEntry:

| id  | entity | EventType | model | idModel |
|-----|--------|-----------|-------|---------|
|     |        |           |       |         |  
|     |        |           |       |         |
|     |        |           |       |         |

Также была добавлена таблица Email, которая содержит почты подписчиков и условия на которые были подписаны слушатели.

TABLE Email:

| id  | mail | model | events |
|-----|------|-------|--------|
|     |      |       |        |    
|     |      |       |        |
|     |      |       |        |

В работе был выбран для работы с JMS - Spring JMS. 

С его помощью создан и настроен контейнер JMS.

Созданный класс Sender отправляет сообщения при изменении объектов бд в брокер сообщений в его очереди event и mail.

Созданный класс Consumer читает очереди и выполняет проверку структуры и записывает данные в бд.

Был также разработан класс для отправки сообщений по почте с помощью встроенного в Spring инструмента по протоколу SMTP, 
данный класс отправляет уведомления при выполнении условия слушателя на действия, которые он подписался - CREATE/DELETE и выбранная модель - USER/POST.
