# Крупин Дмитрий группа №5276

# Операционные системы и виртуализация (Linux)

1. Использование команды cat в Linux
   - Создать два текстовых файла: "Pets"(Домашние животные) и "Pack animals"(вьючные животные), используя команду `cat` в терминале Linux. В первом файле перечислить собак, кошек и хомяков. Во втором — лошадей, верблюдов и ослов.
   - Объединить содержимое этих двух файлов в один и просмотреть его содержимое.
   - Переименовать получившийся файл в "Human Friends".
Пример конечного вывода после команды “ls” :
Desktop Documents Downloads  HumanFriends.txt  Music  PackAnimals.txt  Pets.txt  Pictures  Videos

2. Работа с директориями в Linux
   - Создать новую директорию и переместить туда файл "Human Friends".

3. Работа с MySQL в Linux. “Установить MySQL на вашу вычислительную машину ”
   - Подключить дополнительный репозиторий MySQL и установить один из пакетов из этого репозитория.

4. Управление deb-пакетами
   - Установить и затем удалить deb-пакет, используя команду `dpkg`.

5. История команд в терминале Ubuntu
   - Сохранить и выложить историю ваших терминальных команд в Ubuntu.
В формате: Файла с ФИО, датой сдачи, номером группы(или потока)


# Шаги выполнения задания.

# Использование команды cat в Linux

root@gb-linux:~/taskdz# cat Pets.txt  / Создали первый файл
Dogs Cats Hamstersroot@gb-linux:~/taskdz# nano Pets.txt
root@gb-linux:~/taskdz# cat > PackAnimals.txt / Создали второй файл
Horses Camels Donkeysroot@gb-linux:~/taskdz#
root@gb-linux:~/taskdz# nano PackAnimals.txt
root@gb-linux:~/taskdz# cat Pets.txt PackAnimals.txt > HumanFriends1.txt / Объеденили два файла в один
root@gb-linux:~/taskdz# cat HumanFriends1.txt
Dogs, Cats, Hamsters
Horses, Camels, Donkeys
root@gb-linux:~/taskdz# mv HumanFriends1.txt HumanFriends.txt / Переименовали файл
root@gb-linux:~/taskdz# ls
HumanFriends.txt  PackAnimals.txt  Pets.txt

# Работа с директориями

root@gb-linux:~/taskdz# mkdir FriendsDir / Создали новую директорию
root@gb-linux:~/taskdz# mv HumanFriends.txt FriendsDir/ / Переместили файл
root@gb-linux:~/taskdz# ls FriendsDir/
HumanFriends.txt
root@gb-linux:~/taskdz#

# Установка MySQL

root@gb-linux:~/taskdz# sudo apt update

root@gb-linux:~/taskdz# sudo apt install mysql-server

root@gb-linux:~/taskdz# mysql --version
mysql  Ver 8.0.39-0ubuntu0.24.04.2 for Linux on x86_64 ((Ubuntu))
root@gb-linux:~/taskdz#

# Управление deb-пакетами

root@gb-linux:~/taskdz# sudo apt install htop /Установка пакета htop
Чтение списков пакетов… Готово
Построение дерева зависимостей… Готово
Чтение информации о состоянии… Готово
Предлагаемые пакеты:
    lm-sensors
Следующие НОВЫЕ пакеты будут установлены:
    htop
Обновлено 0 пакетов, установлено 1 новых пакетов, для удаления отмечено 0 пакето
в, и 19 пакетов не обновлено.
Необходимо скачать 171 kB архивов.
После данной операции объём занятого дискового пространства возрастёт на 434 kB.

Пол:1 http://ru.archive.ubuntu.com/ubuntu noble/main amd64 htop amd64 3.3.0-4bui
ld1 [171 kB]
Получено 171 kB за 2с (70,8 kB/s)
Выбор ранее не выбранного пакета htop.
(Чтение базы данных … на данный момент установлено 153115 файлов и каталогов.)
Подготовка к распаковке …/htop_3.3.0-4build1_amd64.deb …
Распаковывается htop (3.3.0-4build1) …
Настраивается пакет htop (3.3.0-4build1) …
Обрабатываются триггеры для desktop-file-utils (0.27-2build1) …
Обрабатываются триггеры для hicolor-icon-theme (0.17-2) …
Обрабатываются триггеры для gnome-menus (3.36.0-1.1ubuntu3) …
Обрабатываются триггеры для man-db (2.12.0-4build2) …
root@gb-linux:~/taskdz# sudo dpkg --remove htop          / Удаление пакета htop
(Чтение базы данных … на данный момент установлено 153125 файлов и каталогов.)
Удаляется htop (3.3.0-4build1) …
Обрабатываются триггеры для man-db (2.12.0-4build2) …
Обрабатываются триггеры для hicolor-icon-theme (0.17-2) …
Обрабатываются триггеры для gnome-menus (3.36.0-1.1ubuntu3) …
Обрабатываются триггеры для desktop-file-utils (0.27-2build1) …

# История команд

163  mkdir taskdz
164  cd taskdz/
165  cat > Pets.txt
166  ll
167  cat Pets.txt
168  nano Pets.txt
169  cat > PackAnimals.txt
170  nano PackAnimals.txt
171  cat Pets.txt PackAnimals.txt > HumanFriends.txt
172  cat HumanFriends.txt
173  mv HumanFriends.txt HumanFriends.txt
174  ls
175  cat Pets.txt PackAnimals.txt > HumanFriends1.txt
176  cat HumanFriends.txt
177  mv HumanFriends1.txt HumanFriends.txt
178  ls
179  cat HumanFriends1.txt
180  cat Pets.txt PackAnimals.txt > HumanFriends1.txt
181  cat HumanFriends1.txt
182  mv HumanFriends1.txt HumanFriends.txt
183  ls
184  clear
185  mkdir FriendsDir
186  mv HumanFriends.txt FriendsDir/
187  ls FriendsDir/
188  sudo apt update
189  sudo apt install mysql-server
190  mysql --version
191  ls -l
192  sudo apt install htop
193  sudo dpkg --remove htop
194  history > commands_history.txt

