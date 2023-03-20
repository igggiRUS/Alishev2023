package io.hexlet.array;

import java.util.Arrays;

class AppArray07 {
    public static void main(String[] args) {
        int[] numbers1 = {};
        AppArray07.getSameParity(numbers1); // []

        int[] numbers2 = {1, 2, 3};
        AppArray07.getSameParity(numbers2); // [1, 3]

        int[] numbers3 = {1, 2, 8};
        AppArray07.getSameParity(numbers3); // [1]

        int[] numbers4 = {2, 2, 8};
        AppArray07.getSameParity(numbers4); // [2, 2, 8]

        int[] numbers5 = {-3, 2, 1};
        AppArray07.getSameParity(numbers5); // [-3, 1]
//

    }
    // BEGIN
    public static int[] getSameParity(int[] numbers) {

        var numbersCount = numbers.length;
        if (numbersCount == 0) {
            return new int[0];
        }

        int[] items = new int[numbers.length];
        int firstIndex = numbers[0];
        boolean remainder = Math.abs(firstIndex) % 2 == 0;

        int newIndex = 0;

        for (var i = 0; i < numbers.length; i++) {
            int currentElementIn = numbers[i];
            boolean currentRemainder = Math.abs(currentElementIn) % 2 == 0;

            if (currentRemainder == remainder) {
                items[newIndex] = numbers[i];
                newIndex++;
            }
        }
        return Arrays.copyOfRange(items, 0, newIndex);
    }
}
