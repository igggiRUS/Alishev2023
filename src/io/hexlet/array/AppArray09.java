package io.hexlet.array;

public class AppArray09 {
    public static String getSuperSeriesWinner(int[][] scores) {
        int result = 0;
        for (int[] score: scores) {
            result += Integer.signum(score[0] - score[1]);
        }
        if (result > 0) {
            return "canada";
        }
        if (result < 0) {
            return "ussr";
        }
        return "draw";
    }
    // END
}