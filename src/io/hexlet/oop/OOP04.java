package io.hexlet.oop;
import static java.lang.Math.PI;

/**
 * Окружность – это геометрическая фигура, все точки которой равноудалены от центра. Чтобы однозначно определить окружность на плоскости, достаточно знать координаты центра окружности и её радиус
 * <p>
 * src/main/java/io/hexlet/Circle.java
 * В файле Circle.java реализуйте класс Circle с публичными свойстваи x, y и radius, который будет представлять окружность. Значения свойств – целые числа типа int. Определите в классе конструктор
 * <p>
 * // Создаём круг
 * // В конструктор передаём координаты X и Y центра окружности и её радиус
 * var circle = new Circle(1, 2, 5);
 * <p>
 * // Обращение к свойству объекта
 * circle.x = 1;
 * src/main/java/io/hexlet/App.java
 * В классе App уже определен публичный статический метод getCircumference(), который принимает в качестве аргумента окружность. Метод должен возвращать длину окружности в виде числа типа double. Допишите тело этого метода
 * <p>
 * Circle circle = new Circle(1, 2, 5);
 * <p>
 * App.getCircumference(circle); // Приблизительно 31.4
 * Подсказки
 * Длину окружности можно вычислить, умножив радиус на 2 и на число Пи.
 * Math.PI – Число Пи
 */
public class OOP04 {
    public static void main(String[] args) {
//        вызываем класс Circle внутри которого есть конструктор
        OOP04.getCircumference(new Circle(1, 2, 5));
    }

    public static double getCircumference(Circle circle) {
        // BEGIN (write your solution here)
        var result = 2 * PI * circle.radiusR;
        System.out.println(result);
        return result;
        // END
    }
}
