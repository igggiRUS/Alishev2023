
```vim
" нумерация строк
set number
" табуляцию заменить на пробелы
set expandtab
" табуляция равна двум пробелам
set tabstop=2
" подчеркнуть синтаксис
syntax on
" что то с синтакисом
set foldenable
set foldmethod=syntax
" подсветка поиска клавишей end переход к следующему слову
set hlsearch
" инкриментальный поиск во время набора
set incsearch
colorscheme desert

 ```
 ```vim
 16 "  перед установкой плагина вычитаем текущий конфиг заново
 17 :source ~/.vimrc
 ```
 ```vim
 " набрать комманду 
 :PlugInstall
 ```
 
 18 " Example
 19 call plug#begin('~/.vim/plugged')
 20 " On-demand loading
 21 Plug 'scrooloose/nerdtree', { 'on':  'NERDTreeToggle' }
 22 
 23 " Initialize plugin system
 24 call plug#end()
~                       