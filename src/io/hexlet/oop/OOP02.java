package io.hexlet.oop;
import static java.lang.Math.*;

/**
 * src/main/java/io/hexlet/App.java
 * В классе App реализуйте публичный статический метод getSquare(), который принимает в качестве аргументов две стороны треугольника и угол между ними в градусах (целые числа), а возвращает площадь этого треугольника в виде числа типа double. Площадь треугольника вычисляется, как половина произведения этих сторон, умноженная на синус угла между ними.
 *
 * App.getSquare(10, 10, 60); // Приблизительно 43.3
 * Подсказки
 * Для вычисления синуса угла используйте статический метод sin() встроенного в Java класса Math. Так как этот метод принимает угол в радианах, вам потребуется перевести градусы в радианы. Чтобы сделать это, нужно количество градусов умножить на число Пи и разделить на 180.
 */
public class OOP02 {
    public static void main(String[] args) {
        getSquare(10, 10, 60);
        getSquareTeacher(10,10,60);
    }

    public static double getSquare(int a, int b, int degrees) {
        var radians = Math.toRadians(degrees);
        var result = (((a * b) * 0.5) * Math.sin(radians));
        return result;
    }
        public static double getSquareTeacher(int side1, int side2, int angle) {
            var angleInRadians = angle * Math.PI / 180;
            var sin = Math.sin(angleInRadians);
            return (side1 * side2 * sin) / 2;
        }
        // END
    }

