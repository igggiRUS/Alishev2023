package io.hexlet.array;

public class AppArray05 {
    public static int calculateSum(int[] numbers) {
        int sum3 = 0;
        for (int i = 0; i < numbers.length; i++) {
            int currentElement = numbers[i];
            if (currentElement % 3 == 0) {
                sum3 = currentElement + sum3;
            }
        }
        return sum3;
    }
}
