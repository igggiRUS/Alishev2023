package Day02;

import java.util.Scanner;

/**
 * пользователь вводит число x а мы по математической формуле считаем  задачу
 * формула неравенства
 */
public class Task04 {
    public static void main(String[] args) {
        System.out.println("Введите число:" );
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = 0;
        if (x >= 5) {
            y = (Math.pow(x, 2) - 10) / (x + 7);
        } else if (x > -3 && x < 5) {
            y = (x + 3) * (Math.pow(x, 2) - 2);
        } else {
            y = 240;
        }
        System.out.println(y);
    }
}
