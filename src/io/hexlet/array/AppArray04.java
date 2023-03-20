package io.hexlet.array;

public class AppArray04 {
    public static String[] addPrefix(String[] names, String prefix) {
        String[] array = new String[names.length];
        for (int i = 0; i < names.length; i++) {
            array[i] = prefix + " " + names[i];
        }
        return array;
    }
}