package Day04;

import java.util.Random;

/**
 * Заполнить многомерный массив (Матрицу таблицу) случайными числами от 0 до 50.
 * Размер матрицы задать m = 12, n = 8 (m строки n столбцы)
 * В консоль ввести индекс строкиБ сумма чисел в которой максимальна.
 * Если таких строк несколько вывести последнюю из них.
 */

public class Task03 {
    public static void main(String[] args) {
        int[][] matrix = new int[12][8];

        Random random = new Random();

//        прошли по строке
        for (int i = 0; i < matrix.length; i++) {
//            прошли по столбцу
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(50);
            }
        }
        int maxSum = 0;
        int maxSumIndx = 0;
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
            if (sum > maxSum) {
                maxSum = sum;
                maxSumIndx = i;
            }
        }
        System.out.println(maxSumIndx);
    }
    }
