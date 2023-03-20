package io.hexlet.array;

public class AppArray06 {
    public static int mult(int[] numbers) {
        var sum = 1;
        for (var number : numbers) {
            sum *= number;
        }

        return sum;
    }
}