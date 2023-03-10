
## возвращает длину строки str (количество символов, включая пробелы)
```
str.length();
```
## Сравнивает строки str1 и str2

```
str1.equals(str2);
```
Метод indexOf() ищет в строке заданный символ (или строку), и возвращает  индекс его первого вхождения. Если элемент не найден, метод возвращает -1.
## Получение элемента строки по его индексу
Для этого используется метод

```
charAt();
```

## Проверка строки на пустоту.
Метод isEmpty() является весьма полезным инструментом. Он возвращает false, если строка содержит какие-либо элементы (пробел - тоже элемент), и true - если строка пустая, т.е. не содержит ни одного элемента.
```
isEmpty();
```
## Одна строка внутри другой

Чрезвычайно полезный метод contains() проверяет, содержится ли одна строка внутри другой, и возвращает соответствующее логическое значение - true или false.

```
contains();
```

## Преобразование регистров.

Методы  toUpperCase() / toLowerCase() приводят всю строку в верхний и нижний регистр соответственно.

```
toUpperCase();

toLowerCase();
```

## Представление числа в строковом формате.

Иногда полезно работать не с числом, а с его представлением в виде строки. Для этого Java предоставляет метод toString(). Чтобы использовать этот метод, нужно воспользоваться классом - обёрткой Integer. Сделать это можно разными путями.

```
toString();
```

## Преобразование строки в число.

Метод, обратный предыдущему - valueOf() преобразует строку в число нужного типа.
```
valueOf();
```

## Создание подстроки.

Метод substring() возвращает новую строку, которая является подстрокой данной строки. Подстрока начинается с символа, заданного индексом, и продолжается до конца данной строки или до указанного индекса.
```
substring();
```

## Замена элементов строки.

Несмотря на то, что строки в Java являются неизменяемыми (immutable), всё-таки их можно изменять с помощью специального метода replace(), который может заменить один символ на другой. Этот метод не изменяет строку, а собирает новую по заданным параметрам. Метод принимает два обязательных параметра - символ, подлежащий замене, и символ, на который его нужно заменить.
```
replace();
```