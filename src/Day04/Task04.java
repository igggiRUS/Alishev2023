package Day04;

import java.util.Random;

/**
 * Создать и заполнить новый массив длиной 100 элементов, случайными числами от 0 до 10000.
 * Найти максимум среди сумм трех соседних элементов.
 * Для найденной тройки с максимальной суммой выведите значение суммы и индекс первого элемента тройки.
 * <p>
 * Пример:
 * [1, 456, 1025, 65, 954, 5789, 4, 8742, 1040, 3254]
 * Тройка с максимальной суммой: [5789, 4, 8742]
 */

public class Task04 {
    public static void main(String[] args) {
//        int[] array = new int[100];
        int[] array = {1, 456, 1025, 65, 495, 5789, 4, 8742, 1040, 3254};
// TODO: ПРОВЕРЬ с тестом не правильное значение.
        Random random = new Random();
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(10000);
//        }
        int maxSum = 0;
        int maxSumIndx = 0;
        for (int i = 0; i < array.length - 2; i++) {
            int sum = 0;
            for (int j = i; j < i + 3; j++) {
                sum += array[j];
            }
            if (sum > maxSum) {
                maxSum += sum;
                maxSumIndx = i;
            }
        }
        System.out.println(maxSum);
        System.out.println(maxSumIndx);
    }
}

