package io.hexlet.array;

public class AppArray02 {
    public static String[] getWeekends(String format) {
        String[] longFormat = new String[]{"saturday", "sunday"};
        String[] shotrFormat = new String[]{"sat", "sun"};
        switch (format) {
            case "long":
                return longFormat;
            case "short":
                return shotrFormat;
            default:
                return longFormat;
        }
    }
}
