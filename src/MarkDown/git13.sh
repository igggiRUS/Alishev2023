 echo создаем файл execute.sh и добавлем все это внутрь 

 # cat << ex.sh > EOF

 # сюда вставляем тело комманд которое ниже строчки #######

 # закрываем файл
 #EOF
 echo выставляем приоритеры файлы
 chmod 777 execute.sh
 echo запускаем файл
 ./execute.sh


##########

cd code-user/
echo проверяем статус
git status

echo git stash прячем все файлы которые хотели закоменить но не успели потому что надо сделать срочный коммент другова файла.
git stash

echo проверяем наличие файла todo.md
# l

echo создаем и сохраняем файл todo.md с любым содржимым 
echo "Создайте файл todo.md с любым содержимым"  todo.md 

echo проверяем наличие файла todo.md
# l

echo проверяем файл на внутреннее наполнение
cat todo.md

echo дополняем в файл строчку дописываем не перезаписывая файл 
echo "stash не трогает новые файлы, которые еще не добавлены в индекс." >> hexlet.txt

echo проверяем файл на внутреннее наполнение
cat hexlet.txt

echo проверяем статус до исполнения
git status

echo делаем коммит только с файлом hexlet.txt
git add hexlet.txt && git commit -m "hexlet.txt"

echo проверяем статус после исполнения
git status

echo восстанавливаем то что было упаковано в stash
git stash pop

echo смотрим что вытащили из stash
git status

echo коммитим то что выщатили из stash
git commit -m ""



