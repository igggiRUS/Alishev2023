# Установка LAMP стека

### Установить  Апачи сервер

```linux
sudo apt install apache2
```

после в браузере вбиваем

```firefox
 localhost
```

### Установить phpmyadmin

```linux
sudo apt install php-common php php-curl php-gd php-mbstring php-xml php-xmlrpc php-soap php-intl php-zip
```

проверить установку

```linux
php -v
```

### Установить mysql

```linux
sudo apt install mysql-server
```

проверка

```linux
mysql --version
```



## 	Разрешить пользователю подключаться к MySQL и MariaDB без sudo 

​	Для получения доступа к базе данных MySQL/MariaDB обычному пользователю без использования **sudo** привилегий, зайдите в приглашение командной строки MySQL

```
sudo mysql
```

Переключиться на аутентификацию по паролю можно следующим SQL запросом:

```
use mysql;
ALTER USER 'root'@'localhost' IDENTIFIED BY 'root';
exit
```

​	Обратите внимание, что вам нужно ввести ПАРОЛЬ.

​	Затем попробуйте войти в базу данных без **sudo**, как показано ниже.

```
mysql -u root -p
в моем случайе mysql -u mike215 -p (в следуйщей строке вводим пароль)
```

ТАК ЖЕ МОЖНО

```linux
sudo mysql
```

​	и запустите следующие команды:

```sql
use mysql;
update user set plugin='' where User='mike215';
flush privileges;
exit
```

​	Затем перезапустите службу MySQL и попробуйте войти в базу данных без **sudo**, как показано ниже.

```linux
sudo systemctl restart mysql.service
```

# Установка политики пароля ошибка 1819

## Создаем пользователя

```sql
create user 'mike215'@'localhost' IDENTIFIED BY 'mike215mike';
```
- ​		**LOW** (НИЗКИЙ): позволяет пользователям устанавливать пароль из 8 или менее символов. 
- ​		**MEDIUM** (СРЕДНИЙ): позволяет пользователям  устанавливать пароль из 8 или менее символов со смешанными регистрами и  специальными символами. 
- ​		**STRONG** (СИЛЬНЫЙ): позволяет пользователям  устанавливать пароль, который имеет все атрибуты пароля среднего уровня с включением проверки по файлу словаря. 

## Проверяем политику пароля
```sql
SHOW VARIABLES LIKE 'validate_password%';
```


```sql
+--------------------------------------+--------+
| Variable_name                        | Value  |
+--------------------------------------+--------+
| validate_password.check_user_name    | ON     |
| validate_password.dictionary_file    |        |
| validate_password.length             | 8      |
| validate_password.mixed_case_count   | 1      |
| validate_password.number_count       | 1      |
| validate_password.policy             | MEDIUM |<<<<------
| validate_password.special_char_count | 1      |
| validate_password_check_user_name    | ON     |
| validate_password_dictionary_file    |        |
| validate_password_length             | 8      |
| validate_password_mixed_case_count   | 1      |
| validate_password_number_count       | 1      |
| validate_password_policy             | MEDIUM |<<<<-----
| validate_password_special_char_count | 1      |
+--------------------------------------+--------+
```

#### Включаем плагин

```sql
select plugin_name, plugin_status from information_schema.plugins where plugin_name like 'validate%';
install plugin validate_password soname 'validate_password.so';
```
#### Проверяем активацию плагина

```sql
select plugin_name, plugin_status from information_schema.plugins where plugin_name like 'validate%';
```
​	Вы должны получить результат, показанный ниже:

```sql
+-------------------+---------------+
| plugin_name       | plugin_status |
+-------------------+---------------+
| validate_password | ACTIVE        |
+-------------------+---------------+
```

#### Устанавливаем низкую политику пароля
```sql
SET GLOBAL validate_password_policy=LOW;
SET GLOBAL validate_password.policy=LOW;
SET GLOBAL validate_password_policy=0;
```
#### После этого вы можете подтвердить уровень политики проверки пароля.
```sql
SHOW VARIABLES LIKE 'validate_password%';
```


```sql
+--------------------------------------+--------+
| Variable_name                        | Value  |
+--------------------------------------+--------+
| validate_password.check_user_name    | ON     |
| validate_password.dictionary_file    |        |
| validate_password.length             | 8      |
| validate_password.mixed_case_count   | 1      |
| validate_password.number_count       | 1      |
| validate_password.policy             | LOW    |<<<<<--------
| validate_password.special_char_count | 1      |
| validate_password_check_user_name    | ON     |
| validate_password_dictionary_file    |        |
| validate_password_length             | 8      |
| validate_password_mixed_case_count   | 1      |
| validate_password_number_count       | 1      |
| validate_password_policy             | LOW    |<<<<<-------
| validate_password_special_char_count | 1      |
+--------------------------------------+--------+
```

Теперь вы можете продолжить и назначить относительно слабый пароль по своему желанию.

### Назначем слабый пароль

```sql
create user 'username'@'localhost' IDENTIFIED BY 'mypassword';
```
​	Чтобы вернуться к уровню политики паролей «СРЕДНИЙ», просто вызовите команду:

```sql
SET GLOBAL validate_password_policy=MEDIUM;
```

### Даем привелегии пользователю

```sql
GRANT ALL PRIVILEGES ON *.* TO 'mike'@'localhost' IDENTIFIED BY PASSWORD 'm' 
```
### Узнать под каким пользователем сидишь


```sql
select user();
select current_user();
```

создает пользователя 

```sql
CREATE USER 'mike215'@'localhost' IDENTIFIED BY 'password';
```

###### Показывает всех пользователей SELECT user

```sql
 SELECT user, host FROM mysql.user;
```

###### Дает все привелегии GRANT ALL

```sql
GRANT ALL PRIVILEGES ON *.* TO 'mike215'@'localhost' IDENTIFIED BY 'mike215mike' WITH GRANT OPTION;
```

###### Смотреть привелегии пользователя SHOW GRANTS FOR

```sql
SHOW GRANTS FOR 'mike215'@'localhost';
```

###### Смена пользователя и пароля ALTER USER

```sql
ALTER USER 'root'@'localhost' IDENTIFIED BY 'New_Password';
```







https://www.dmosk.ru/miniinstruktions.php?mini=mysql-user

https://fooobar.com/questions/262924/error-1044-42000-access-denied-for-root-with-all-privileges

```sql
SHOW DATABASES; - список баз данных
SHOW TABLES [FROM db_name]; -  список таблиц в базе 
SHOW COLUMNS FROM таблица [FROM db_name]; - список столбцов в таблице
SHOW CREATE TABLE table_name; - показать структуру таблицы в формате "CREATE TABLE"
SHOW INDEX FROM tbl_name; - список индексов
SHOW GRANTS FOR user [FROM db_name]; - привилегии для пользователя.


SHOW VARIABLES; - значения системных переменных
SHOW [FULL] PROCESSLIST; - статистика по mysqld процессам
SHOW STATUS; - общая статистика
SHOW TABLE STATUS [FROM db_name]; - статистика по всем таблицам в базе
```

