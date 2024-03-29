package Day06;

/**
 * Создать класс Самолет с полями "изготовитель", "год выпуска", "длина", "вес", "объем топлива в баке".
 * Создать конструктор в классе Самолет, принимающий в качестве аргументов значения четырех полей класса
 * (значение поля "объем топлива в баке" установить равным 0).
 * В конструкторе для передачи полям значений использовать ключевое слово "this".
 * Помимо этого, в классе необходимо реализовать метод info(), который выводит сообщение в следующем формате:
 * "Изготовитель: … , год выпуска: … , длина: … , вес: …, объем топлива в баке: …"
 * Также, необходимо реализовать метод fill Up(),
 * который в качестве аргумента принимает число и заправляет топливный бак самолета на это значение.
 * Создать новый объект класса Самолет с произвольными данными.
 * Изменить год выпуска и длину с помощью сеттеров, вызвать метод fill Up() два раза, передав разные значения.
 * Вызвать метод info().
 */
public class Task02 {
    public static void main(String[] args) {
        Ariplane ariplane = new Ariplane("boening", 2021, 30, 4000);
        // обновляем данные
        ariplane.setYear(2011);
        ariplane.setLength(35);

        // вызываем заполнение топливом.
        ariplane.fillUp(1000);
        // дозаправили самолет
        ariplane.fillUp(5000);

        ariplane.info();
    }
}
