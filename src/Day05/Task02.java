package Day05;

/**
 * Создать класс Мотоцикл, с полями "Год выпуска", "Цвет", "Модель"".
 * Создать экземпляр класса Мотоцикл, с помощью конструктора (сеттеры не использовать).
 * Придерживаться принципов инкапсуляции и использовать ключевое слово this.
 */
//TODO: this constructor alt+insert (constructor)
public class Task02 {
    public static void main(String[] args) {
        //    передавать параметры в той же последовательности что и в конструкторе
        Motorbike motorbike = new Motorbike(2010, "kawasaki", "red");
        System.out.println(motorbike.getModel() + "\n" +
                motorbike.getYear() + "\n" +
                motorbike.getColor());
    }
}
