package Day03;
/**
 * Реализовать программу, которая пока работает, принимает на вход от пользователя два числа - делимое и делитель.
 * Для этих двух чисел программа расчитывает результат деления и выводит его на консоль.
 * Программа останавливает свою работу тогда, когда пользоватлеь вводи 0 в качестве делителя.
 * ограничен 5 итерациями
 */
import java.util.Scanner;


public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        while (counter < 5) {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();

            counter++;

            if (b == 0) {
                System.out.println("деление на ноль");
                continue;
            }

            System.out.println(a / b);
        }
        System.out.println("прошло 5 операций");
    }
}
