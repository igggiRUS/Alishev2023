package Day05;

/**
 * Создать класс Автомобиль, с полями "Год выпуска", "Цвет", "Модель".
 * Создать геттеры и сеттеры для каждого поля. Создать экземпляр класса Автомобиль,
 * задать сеттером каждое поле, вывести в консоль значение каждого поля геттером.
 * Созданный вами класс должен отвечать принципам инкапсуляции.
 */
//TODO: getter setter private alt+insert (getter and setter)
public class Task01 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("black");
        car.setYear(2000);
        car.setModel("audi");

        System.out.println("Our car: " + car.getYear() + " year " + car.getModel() + " model " +car.getColor() + " color");
    }
}
