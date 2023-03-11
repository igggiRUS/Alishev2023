## 25 Поиск find

find . -type f | egrep -i -E -o "\.{1}\w*$" | sort -su

```
find . -type f "*.slq" | egrep -iwrl  "CREATE DATABASE" ./*
```



## 13 Групповое переименование файлов в консоли
> установка утилиты

```
sudo apt install rename
```

#### Находит все файлы с расширением *.md и меняет на txt
-n не разрешит записать поверх два одинаковых файла если после переименования будут дубликаты

```
rename -n 's/\.md/\.txt/' *.md
```

#### Меняет все заглавные на строчные

```
rename -n 'y/A-Z/a-z/'*.jpeg
```

```
find . -type f "*.md" | egrep -iwrl  "мульти" ./*
```



