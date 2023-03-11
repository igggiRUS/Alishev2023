CREATE SCHEMA `book`;
CREATE TABLE `book`.`book` (
  `book_id` INT NOT NULL,
  `title` VARCHAR(45) NULL,
  `author` VARCHAR(45) NULL,
  `price` DECIMAL(6,2) NOT NULL,
  `amount` INT NOT NULL,
  PRIMARY KEY (`book_id`));
USE `book`;
insert INTO book (book_id, title, author, price, amount) values (1, 'Мастер и Маргарита', 'Булгаков М.А.', 670.99, 3);
insert INTO book (book_id, title, author, price, amount) values (2, 'Белая гвардия', 'Булгаков М.А.', 540.50, 5);
insert INTO book (book_id, title, author, price, amount) values (3, 'Идиот', 'Достоевский Ф.М.', 460.00, 10);
insert INTO book (book_id, title, author, price, amount) values (4, 'Братья Карамазовы', 'Достоевский Ф.М.', 799.01, 3);
insert INTO book (book_id, title, author, price, amount) values (5, 'Игрок', 'Достоевский Ф.М.', 480.50, 10);
insert INTO book (book_id, title, author, price, amount) values (6, 'Стихотворения и поэмы', 'Есенин С.А.', 650, 15);
