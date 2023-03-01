package Day04;

/**
 * С клавиатуры вводится кол-во элементов в массиве. Создать массив указанной длинны, заполнить его случайными числами от 0 до 10.
 * Распечатать массив, а так же вывести в консоль информацию о:
 * а) Длинне массива.
 * б) Колличестве чисел больше 8
 * В) Колличестве чисел равных 1
 * г) Колличестве четных чисел
 * д) Количестве нечетных чисел.
 * е) Сумме всех элементов массива.
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();

        Random random = new Random();
        int[] array = new int[arrayLength];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(array));
        System.out.println(array.length);

        int coutre8 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 8)
                coutre8++;
        }
        System.out.println(coutre8);

        int coutre1 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1)
                coutre1++;
        }
        System.out.println(coutre1);

        int counterEven = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                counterEven++;
        }
        System.out.println(counterEven);

        int counterOdd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                counterOdd++;
        }
        System.out.println(counterOdd);

        int sum = 0;
        for (int i = 0; i < arrayLength; i++) {
            sum += array[i];
        }
        System.out.println(sum);
    }
}

