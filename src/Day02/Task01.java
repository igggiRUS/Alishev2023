//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Day02;

import java.util.Scanner;

public class Task01 {
    public Task01() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int floorCount = scanner.nextInt();
        if (1 <= floorCount && floorCount <= 4) {
            System.out.println("Малоэтажный");
        } else if (5 <= floorCount && floorCount <= 8) {
            System.out.println("Средний");
        } else if (floorCount >= 9) {
            System.out.println("многоэтаж");
        } else {
            System.out.println("ошибка");
        }

    }
}
