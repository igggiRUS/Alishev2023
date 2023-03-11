## 23 Установка PostgresSQL

```
sudo apt-get install postgresql

```
пользователь postgres заходим в консоль базы

```
sudo -u postgres psql
```

в консоли базы пишем
```
\password
```

указываем пароль Допустим единица 1
создаем базу данных 

`create database test_base;`

Проверить есть ли созданная база

`\l`


## 24 установка mySQL
sudo apt-get install mysql-server mysql-client

Во время установки будет экран на котором надо ввести пароль для удобства можно выбрать пароль единицу

mysql -u root -p
Enter password: 1



sudo apt update && sudo apt upgrade  


Сначала загрузите пакет репозитория с помощью wget команды:

```
wget -c https://repo.mysql.com//mysql-apt-config_0.8.13-1_all.deb
```

Затем установите пакет репозитория MySQL, используя следующую dpkgкоманду:


```
sudo dpkg -i mysql-apt-config_0.8.13-1_all.deb
```


Выполните следующую команду, чтобы начать установку MySQL:

```
sudo apt-get install mysql-server
```

Выполните следующую команду, чтобы настроить безопасность сервера MySQL:

### Комманда для сены пароля MySQL СБРОС ПАРОЛЯ

```
sudo mysql_secure_installation
```

Выдет это сообщение об установке пароля на  MySQL


>Securing the MySQL server deployment.

>Connecting to MySQL using a blank password.
The 'validate_password' component is installed on the server.
The subsequent steps will run with the existing configuration
of the component.
Please set the password for root here.


__Важно__
После надписи `New password:`  укажите свой рут пароль и запомните его



> * Удалить анонимных пользователей? (Нажмите y | Y для Yes, любой другой ключ для No): __y__ 
> * Запретить удаленный вход в root? (Нажмите y | Y для Yes, любой другой ключ для No): __y__
> * Удалить тестовую базу данных и доступ к ней? (Нажмите y | Y для Yes, любой другой ключ для No): __y__
> * Перезагрузить таблицы привилегий сейчас? (Нажмите y | Y для Yes, любой другой ключ для No): __y__

Как правило, служба MySQL автоматически запускается после настройки пакета. Чтобы проверить, работает ли сервер MySQL или нет, вы используете эту команду:

```
sudo systemctl status mysql
```

Если вы обнаружили, что сервер MySQL не запускается автоматически, вы можете использовать следующую команду для его запуска:

```
sudo systemctl enable mysql
```

Для подключения к серверу MySQL используйте эту команду:

### Комманда для захода в базу MySQL

```
sudo mysql -u root -p
```
Используйте `SHOW DATABASES` для отображения всех баз данных на текущем сервере:

mysql> 
```
show databases;
```

### Создаем чистую базу MySQL

