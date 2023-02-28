package Day02;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("7 78");

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int t = a + 1; // добавили 1 что бы a не входила в диапазон чисел
        while (t < b) {
            if (t % 5 == 0 && 0 != t % 10)
                System.out.println(t);
            t++;
        }
    }
}
