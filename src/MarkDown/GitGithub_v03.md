# Работа с git через консоль

## 1 Начало создания репозитория 

#### Переходим в нужную папку

```
cd /home/mike215/Документы/git/
```

> Создаем папку в которой будет храниться информация с гита например java224top\_bmz (_группа инициалы_)

```
mkdir java224top_bmz
```
> /home/mike215/Документы/git/java224top_bmz


## 2 Создаем новый репозиторий



Создаем новую папку и называем ее по своему усмотрению она будет являться местом хранения информации с репозиторием.
Производим инициализацию пустой папки.

> /home/mike215/Документы/git/java224top_bmz
> 
> Инициализируем папку 

```git
git init
```

>После инициализации пустого репозитория создается системная папка .git она не видимая.


## 3 Проверить наличие файлов git pub
>> ls ll два похожих оператора но ll дает полную инфу

```
ll ~/.ssh/
```

#### Удаление ненужного файла file.pub ключа
> удалять не обязательно но если вдруг надо то можно. Что бы не было лишних ключей ненужных

```
remove file.pub
rm file.pub
```

## создать ssh ключ 

```
cd ~/.ssh/
ssh-keygen
```
в первой строке можем указать что хотим

```
Enter file in which to save the key (/home/mike/.ssh/id_rsa): java224top_bmz_System
```


```
cat java224top_bmz_System.pub
```
открываем файл и копируем хеш в браузер

Как выглядит ХЕШ (начало хеша будет ssh-rsa конец хеша будет ваш админ компьютере копируем всю эту информацию, она генерируется случайным образом каждый раз разная. Вам нужна именно ваша)
```ssh-rsa apdfasdasd.,rqoasdf aLKASDJSLFKSDKLFLS:DKFJkLSDKJap  dfasdasd.,rqoasdfa ASDJSLFKSDKLFLS:DKFJkLSDKJapdfasdasd.,rqoasdfaLKASDJSLFKSDKLFLS:DKFJkLSDKJapdfasdasd.,rqo aLKASDJSLF KSDKLF LS:D KFJkLSDKJapdf  asdasd.,rqoasd faLKA SDJSLFKSDK  FLS:DKFJkLSDKJapdfasdasd.,rqoasdfa LKASDJSLFKSDKLFLS:DKFJkLSDKJapdfasdasd.,rqoasdfaLKASDJSLFKSD KLFLS:DKFJkLSDKJapdfasdasd.,rqoasdfaLKASDJSLFKSDKLFLS:DKFJkLSDKJapdfasdasd.,rqoasdfaLKASDJSLFKSDKLFLS:DKFJkLSDKJapdfasdasd.,rqoasdfaLKASD aLKASDJSLFKSDKLFLS:DKFJkLSDKJ
= mike215@mike215System
```

### Переходим на сайт github.com

>Открываем [github.com](https://github.com/) создаем новый публичный репозиторий  
>
Я свой репозиторий назвал `java224top_bmz`

Открываем [github.com](https://github.com/) заходим в него и переходим в настройки ssh

```
github-->settings-->ssh-->
```

>После переходим в наш репозиторий  на сайте у меня это выглядит так

```
https://github.com/igggiRUS/TOP_java224_BMZ
```

Забираем нашу строку нажимая на кнопку `code` копируем предложенный `ssh` код

```
git@github.com:igggiRUS/TOP_java224_BMZ.git
```

### Переходим в терминал компьютера

```
git clone git@github.com:igggiRUS/TOP_java224_BMZ.git
```
Делаем нужные подтверждения и все файлы клонируются на диск.
Заходим в нашу папку через терминал

Проверяем наш гит статус
```
git status
```
В этой папке теперь создаем наш проект в java после переходим в терминал и набираем комманду

```
git add .
```

 добавить все файлы




## Часто используемые комманды

сокращенные коммиты в 1 строку удобно смотреть

```
git log --oneline 
```

покажет  коммит с меткой в скобках --all показывает логи всего

```
git log --oneline --all
```

слово HEAD показывает место где мы находимся

показывает графическое отображение коммитов

```
git log --all --graph
```
смотреть разницу дифференциал

```
git diff
```


git status статусы файла
dir ls навигация используй tab
git add . добавить все файлы
git add -a  добавляет все файлы 
.gitignore создать файл со списоком игнора обозвать его .gitignore если надо заигнорить папку пишет /folder folder название папки

## Создаем клон на новом компьютере

git clone создаем клон на новом компе
git commit создаем коммит для пуша на облако гита что бы понимать какие изменения делались
git push пушим файлы в облако гита если при пуше в консоли ошибка пишем 
**esc** клавиша потом :pw **enter**
git pull качаем с гита файлы которые кто то пушил


git init 
git add .
git commit -m 'comment to commit'



```
git commit -a -m 'rename comment to commit'
```
но только если не успели запушить 
```
--amend
```

==================
git remote add origin https://github.com/ivansamofal/test.git

git status

git config --global user.name "Ivan"
git config --global user.email "ivansamofal@gmail.com"


git config --global push.default simple
git push

git checkout перемещение веток
git branch показать ветвление
git stash 












-----------------------------------

[git](https://www.youtube.com/channel/UC2Ev-rDSHBov0ZMChesLfrg)

[github](https://www.youtube.com/channel/UCK5d3n3kfkzlArMccS0TTXA)

[15:11 логическую цепочку превращает в схему МаркДаун](https://www.youtube.com/watch?v=GnK6rci9Nsc)
