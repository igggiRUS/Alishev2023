package Day03;

import java.util.Scanner;

/**
 * Реализовать программу, которая пока работает, принимает на вход от пользователя два числа - делимое и делитель.
 * Для этих двух чисел программа расчитывает результат деления и выводит его на консоль.
 * Программа останавливает свою работу тогда, когда пользоватлеь вводи 0 в качестве делителя.
 */
public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("12 23");
        while (true) {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            if (b == 0)
                break;

            System.out.println(a / b);
        }
    }
}
