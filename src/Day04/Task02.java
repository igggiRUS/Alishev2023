package Day04;
/**
 * Создать и заполнить новы массив длинной 100 элементов, случайными числами от 0 до 10000
 * и с помощью цикла for each вывести информацию о наибольшем
 * и наименшем элементе массива, кол-ве элементов оканчивающихся на 0.
 * Использовать сортировку запрещено.
 */
//TODO: array max min zero sum for  randome

import java.util.Arrays;
import java.util.Random;

public class Task02 {
    public static void main(String[] args) {
        int[] array = new int[100];

        Random random = new Random();

        for (int i = 0; i < array.length; i++) array[i] = random.nextInt(0, 10000);

        int max = 0;
        for (int element : array) {
            if (element > max)
                max = element;
        }
        System.out.println(Arrays.toString(array));
        System.out.println(max);

        int min = 10000;
        for (int element : array) {
            if (element < min)
                min = element;
        }
        System.out.println(min);

        int counter = 0;
        for (int element : array) {
            if (element % 10 == 0)
                counter++;
        }
        System.out.println(counter);

        int sum = 0;
        for (int element : array) {
            if (element % 10 == 0)
                sum += element;
        }
        System.out.println(sum);
    }
}

