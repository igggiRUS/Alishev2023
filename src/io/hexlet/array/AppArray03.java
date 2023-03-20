package io.hexlet.array;

public class AppArray03 {
        public static int[] swap(int[] numbers) {
            int length = numbers.length;

            if (length < 2) {
                return numbers;
            }
            int lastIndex = numbers.length - 1;
            int firstIndex = numbers[lastIndex];
            numbers[lastIndex] = numbers[0];
            numbers[0] = firstIndex;
            return numbers;
        }
    }


