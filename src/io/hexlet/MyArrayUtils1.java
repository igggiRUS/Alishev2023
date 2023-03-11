package io.hexlet;

import java.util.Arrays;

class MyArrayUtils1 {
    public static void main(String[] args) {
        int[] numbers = {3, 2, 10, -2, 0};
        MyArrayUtils1.bubbleSort(numbers);
        System.out.println(Arrays.toString(numbers)); // => [-2, 0, 2, 3, 10]
    }

    public static void bubbleSort(int[] items) {
        var stepsCount = items.length - 1;
        boolean swapped;
        do {
            swapped = false;
            for (var i = 0; i < stepsCount; i++) {
                if (items[i] > items[i + 1]) {
                    var temp = items[i];
                    items[i] = items[i + 1];
                    items[i + 1] = temp;
                    swapped = true;
                }
            }
            stepsCount--;
        } while (swapped);
    }
}
