```bash
sudo apt install tmux
```

#устанавливаем новую сессию и даем ей название testSession

```bash
tmux new-session -s testSesii
```

Открывается обычный терминал в низу название сессии testSessi.
указано окно 'bash0'

создание новых окон сессий `ctrl+b`  `c` внизу появтяся окно bash

выходи из сессий `ctrl+b` `d`

проверить колличество активных сессий
```bash
tmux ls
```

подключение к активной сессии после -t указываем активную сессию
```bash
tmux attach -t testSesii
```

переключение между окнами `ctrl+b` `1` цифра это номер окна

## разделение терминала 

`ctrl+b` `shift+%` вертикально
`ctrl+b` `shift+"` горизонтально

переключаться по окнам `ctlr+b` стрелку

## удаление сессий
```bash
tmux kill-session -t tt
```








https://www.youtube.com/watch?v=8pfMmx0LF8k