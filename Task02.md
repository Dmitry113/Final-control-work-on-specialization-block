# Крупин Дмитрий группа №5276

# Объектно-ориентированное программирование:

6. Диаграмма классов
- Создать диаграмму классов с родительским классом "Животные", и двумя подклассами: "Pets" и "Pack animals".
В составы классов которых в случае Pets войдут классы: собаки, кошки, хомяки, а в класс Pack animals войдут: (Лошади, верблюды и ослы).
Каждый тип животных будет характеризоваться (например, имена, даты рождения, выполняемые команды и т.д)
Диаграмму можно нарисовать в любом редакторе, такими как Lucidchart, Draw.io, Microsoft Visio и других.

7. Работа с MySQL (Задача выполняется в случае успешного выполнения задачи “Работа с MySQL в Linux. “Установить MySQL на вашу машину”

7.1. После создания диаграммы классов в 6 пункте, в 7 пункте база данных "Human Friends" должна быть структурирована в соответствии с этой диаграммой. Например, можно создать таблицы, которые будут соответствовать классам "Pets" и "Pack animals", и в этих таблицах будут поля, которые характеризуют каждый тип животных (например, имена, даты рождения, выполняемые команды и т.д.).
7.2   - В ранее подключенном MySQL создать базу данных с названием "Human Friends".
- Создать таблицы, соответствующие иерархии из вашей диаграммы классов.
- Заполнить таблицы данными о животных, их командах и датами рождения.
- Удалить записи о верблюдах и объединить таблицы лошадей и ослов.
- Создать новую таблицу для животных в возрасте от 1 до 3 лет и вычислить их возраст с точностью до месяца.
- Объединить все созданные таблицы в одну, сохраняя информацию о принадлежности к исходным таблицам.

Пример заполненной таблицы для теста:

Лист "Pets"
ID	Name	Type	BirthDate	Commands
1	Fido	Dog	2020-01-01	Sit, Stay, Fetch
2	Whiskers	Cat	2019-05-15	Sit, Pounce
3	Hammy	Hamster	2021-03-10	Roll, Hide
4	Buddy	Dog	2018-12-10	Sit, Paw, Bark
5	Smudge	Cat	2020-02-20	Sit, Pounce, Scratch
6	Peanut	Hamster	2021-08-01	Roll, Spin
7	Bella	Dog	2019-11-11	Sit, Stay, Roll
8	Oliver	Cat	2020-06-30	Meow, Scratch, Jump

Лист "PackAnimals"
ID	Name	Type	BirthDate	Commands
1	Thunder	Horse	2015-07-21	Trot, Canter, Gallop
2	Sandy	Camel	2016-11-03	Walk, Carry Load
3	Eeyore	Donkey	2017-09-18	Walk, Carry Load, Bray
4	Storm	Horse	2014-05-05	Trot, Canter
5	Dune	Camel	2018-12-12	Walk, Sit
6	Burro	Donkey	2019-01-23	Walk, Bray, Kick
7	Blaze	Horse	2016-02-29	Trot, Jump, Gallop
8	Sahara	Camel	2015-08-14	Walk, Run

# Шаги выполнения задания

# Работа с MySQL

Создание базы данных и таблиц:

mysql> CREATE DATABASE HumanFriends; USE HumanFriends;   / Создание базы данных
Query OK, 1 row affected (0,03 sec)
Database changed
mysql> CREATE TABLE Pets (     ID INT AUTO_INCREMENT PRIMARY KEY,     Name VARCHAR(50),     Type  / Создание первой таблицы в базе данных HumanFriends
CHAR(50),     BirthDate DATE,     Commands VARCHAR(255) );
Query OK, 0 rows affected (0,03 sec)

mysql> CREATE TABLE PackAnimals (     ID INT AUTO_INCREMENT PRIMARY KEY,     Name VARCHAR(50),   / Создание второй таблицы в базе данных HumanFriends
ype VARCHAR(50),     BirthDate DATE,     Commands VARCHAR(255) );
Query OK, 0 rows affected (0,03 sec)

mysql> INSERT INTO Pets (Name, Type, BirthDate, Commands) VALUES ('Fido', 'Dog', '2020-0      / Заполнение первой таблицы в базе данных HumanFriends
Stay, Fetch'), ('Whiskers', 'Cat', '2019-05-15', 'Sit, Pounce'), ('Hammy', 'Hamster', '
2021-03-10', 'Roll, Hide'), ('Buddy', 'Dog', '2018-12-10', 'Sit, Paw, Bark'), ('Smudge', 'Cat', '202
0-02-20', 'Sit, Pounce, Scratch'), ('Peanut', 'Hamster', '2021-08-01', 'Roll, Spin'), ('Bella', 'Dog
', '2019-11-11', 'Sit, Stay, Roll'), ('Oliver', 'Cat', '2020-06-30', 'Meow, Scratch, Jump');
Query OK, 8 rows affected (0,02 sec)
Records: 8  Duplicates: 0  Warnings: 0

mysql> INSERT INTO PackAnimals (Name, Type, BirthDate, Commands) VALUES ('Thunder', 'Horse', '20   / Заполнение второй таблицы в базе данных HumanFriends
7-21', 'Trot, Canter, Gallop'), ('Sandy', 'Camel', '2016-11-03', 'Walk, Carry Load'), ('Eeyore',
'Donkey', '2017-09-18', 'Walk, Carry Load, Bray'), ('Storm', 'Horse', '2014-05-05', 'Trot, Canter')
Dune', 'Camel', '2018-12-12', 'Walk, Sit'), ('Burro', 'Donkey', '2019-01-23', 'Walk, Bray, Kick'
), ('Blaze', 'Horse', '2016-02-29', 'Trot, Jump, Gallop'), ('Sahara', 'Camel', '2015-08-14', 'Walk,
);
Query OK, 8 rows affected (0,03 sec)
Records: 8  Duplicates: 0  Warnings: 0
mysql> SELECT * FROM Pets;
+----+----------+---------+------------+----------------------+
| ID | Name     | Type    | BirthDate  | Commands             |
+----+----------+---------+------------+----------------------+
|  1 | Fido     | Dog     | 2020-01-01 | Sit, Stay, Fetch     |
|  2 | Whiskers | Cat     | 2019-05-15 | Sit, Pounce          |
|  3 | Hammy    | Hamster | 2021-03-10 | Roll, Hide           |
|  4 | Buddy    | Dog     | 2018-12-10 | Sit, Paw, Bark       |
|  5 | Smudge   | Cat     | 2020-02-20 | Sit, Pounce, Scratch |
|  6 | Peanut   | Hamster | 2021-08-01 | Roll, Spin           |
|  7 | Bella    | Dog     | 2019-11-11 | Sit, Stay, Roll      |
|  8 | Oliver   | Cat     | 2020-06-30 | Meow, Scratch, Jump  |
+----+----------+---------+------------+----------------------+
8 rows in set (0,00 sec)

mysql> SELECT * FROM PackAnimals;
+----+---------+--------+------------+------------------------+
| ID | Name    | Type   | BirthDate  | Commands               |
+----+---------+--------+------------+------------------------+
|  1 | Thunder | Horse  | 2015-07-21 | Trot, Canter, Gallop   |
|  2 | Sandy   | Camel  | 2016-11-03 | Walk, Carry Load       |
|  3 | Eeyore  | Donkey | 2017-09-18 | Walk, Carry Load, Bray |
|  4 | Storm   | Horse  | 2014-05-05 | Trot, Canter           |
|  5 | Dune    | Camel  | 2018-12-12 | Walk, Sit              |
|  6 | Burro   | Donkey | 2019-01-23 | Walk, Bray, Kick       |
|  7 | Blaze   | Horse  | 2016-02-29 | Trot, Jump, Gallop     |
|  8 | Sahara  | Camel  | 2015-08-14 | Walk, Run              |
+----+---------+--------+------------+------------------------+
8 rows in set (0,00 sec)

# Удаление записей о верблюдах:

mysql> DELETE FROM PackAnimals WHERE Type = 'Camel';
Query OK, 3 rows affected (0,01 sec)

mysql> SELECT * FROM PackAnimals;
+----+---------+--------+------------+------------------------+
| ID | Name    | Type   | BirthDate  | Commands               |
+----+---------+--------+------------+------------------------+
|  1 | Thunder | Horse  | 2015-07-21 | Trot, Canter, Gallop   |
|  3 | Eeyore  | Donkey | 2017-09-18 | Walk, Carry Load, Bray |
|  4 | Storm   | Horse  | 2014-05-05 | Trot, Canter           |
|  6 | Burro   | Donkey | 2019-01-23 | Walk, Bray, Kick       |
|  7 | Blaze   | Horse  | 2016-02-29 | Trot, Jump, Gallop     |
+----+---------+--------+------------+------------------------+
5 rows in set (0,00 sec)

# Создадим новую таблицу для объединённых данных:

mysql> CREATE TABLE HorsesAndDonkeys AS SELECT * FROM PackAnimals WHERE Type IN ('Horse')

Query OK, 5 rows affected (0,06 sec)
Records: 5  Duplicates: 0  Warnings: 0

# Создание новой таблицы для животных в возрасте от 1 до 3 лет:

mysql> CREATE TABLE YoungAnimals AS SELECT *, TIMESTAMPDIFF(MONTH, BirthDate, CURDATE()) AS AgeI
ths FROM Pets WHERE TIMESTAMPDIFF(YEAR, BirthDate, CURDATE()) BETWEEN 1 AND
3 UNION SELECT *, TIMESTAMPDIFF(MONTH, BirthDate, CURDATE()) AS AgeInMonths FROM
PackAnimals WHERE TIMESTAMPDIFF(YEAR, BirthDate, CURDATE()) BETWEEN 1 AND 3;
Query OK, 2 rows affected (0,04 sec)
Records: 2  Duplicates: 0  Warnings: 0

# Объединение всех таблиц в одну:

mysql> CREATE TABLE AllAnimals AS SELECT 'Pet' AS SourceTable, ID, Name, Type, B
irthDate, Commands FROM Pets UNION SELECT 'PackAnimal' AS SourceTable, ID, Name,
Type, BirthDate, Commands FROM PackAnimals UNION SELECT 'YoungAnimal' AS Source
Table, ID, Name, Type, BirthDate, Commands FROM YoungAnimals;

# Результат объединения:

mysql> SELECT * FROM AllAnimals;
+-------------+----+----------+---------+------------+------------------------+
| SourceTable | ID | Name     | Type    | BirthDate  | Commands               |
+-------------+----+----------+---------+------------+------------------------+
| Pet         |  1 | Fido     | Dog     | 2020-01-01 | Sit, Stay, Fetch       |
| Pet         |  2 | Whiskers | Cat     | 2019-05-15 | Sit, Pounce            |
| Pet         |  3 | Hammy    | Hamster | 2021-03-10 | Roll, Hide             |
| Pet         |  4 | Buddy    | Dog     | 2018-12-10 | Sit, Paw, Bark         |
| Pet         |  5 | Smudge   | Cat     | 2020-02-20 | Sit, Pounce, Scratch   |
| Pet         |  6 | Peanut   | Hamster | 2021-08-01 | Roll, Spin             |
| Pet         |  7 | Bella    | Dog     | 2019-11-11 | Sit, Stay, Roll        |
| Pet         |  8 | Oliver   | Cat     | 2020-06-30 | Meow, Scratch, Jump    |
| PackAnimal  |  1 | Thunder  | Horse   | 2015-07-21 | Trot, Canter, Gallop   |
| PackAnimal  |  3 | Eeyore   | Donkey  | 2017-09-18 | Walk, Carry Load, Bray |
| PackAnimal  |  4 | Storm    | Horse   | 2014-05-05 | Trot, Canter           |
| PackAnimal  |  6 | Burro    | Donkey  | 2019-01-23 | Walk, Bray, Kick       |
| PackAnimal  |  7 | Blaze    | Horse   | 2016-02-29 | Trot, Jump, Gallop     |
| YoungAnimal |  3 | Hammy    | Hamster | 2021-03-10 | Roll, Hide             |
| YoungAnimal |  6 | Peanut   | Hamster | 2021-08-01 | Roll, Spin             |
+-------------+----+----------+---------+------------+------------------------+
15 rows in set (0,01 sec)
