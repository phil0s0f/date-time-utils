# date-time-utils

## Описание
`date-time-utils` — это простая Java-библиотека для работы с датами и временем. 
---

## Возможности
- **Форматирование даты** в строку (`formatDate`)
- **Добавление** или ➖ **вычитание** дней, месяцев, лет (`addDays`, `addMonths`, `addYears`)
- **Проверка на високосный год** (`isLeapYear`)

---

## Установка
Добавьте в ваш `pom.xml` зависимость на библиотеку:

```xml
<dependency>
    <groupId>ru.dugarov</groupId>
    <artifactId>date-time-utils</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```

---

## Тестирование
Для тестирования используется **JUnit 5**. Запустить тесты можно командой:

```sh
mvn test
```