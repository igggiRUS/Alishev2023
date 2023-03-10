Установка переменных JAVA_HOME / PATH в Unix/Linux
~ / .bash_profile является сценарий запуска, который обычно выполняется один раз. Это конкретный файл используется для команд, которые выполняются, когда нормальные входе пользователя в систему. Common использует для .bash_profile должны установить переменные окружения, такие как PATH, JAVA_HOME, чтобы создать псевдонимы для команд оболочки, и установить права доступа по умолчанию для вновь создаваемых файлов.

Установка JAVA_HOME / PATH для одного пользователя 

Зайдите в свой аккаунт (учетную запись) и откройте файл .bash_profile в любом редакторе:
find /home -type f -name "*bash_profile*" -not -path "*/home/timeshift*"

```sh
vim ~/.bash_profile
```
Установите JAVA_HOME как показано используя синтаксис export JAVA_HOME=<path-to-java>. Если ваш путь такой как у меня /usr/lib/jvm/java-1.6.0-openjdk-i386/bin/java, то тогда пропишите:
export JAVA_HOME=/usr/lib/jvm/java-1.6.0-openjdk-i386/bin/java

```sh
export PATH=/usr/lib/jvm/java-1.6.0-openjdk-i386/bin:$PATH
```