//package io.hexlet;
//
//import java.util.Arrays;
//import org.apache.commons.lang3.ArrayUtils;
//
//class App {
//    // BEGIN
//    public static int countUniqChars(String text) {
//        char[] chars = text.toCharArray(); // создали массив char
//        char[] uniqChars = new char[chars.length]; // создали дубликат массива длинной первого
//
//
//        var count = 0;
//        for (var current: chars) {
//            if (!ArrayUtils.contains(uniqChars, current)) { // сравнение дубликата и целевым массиовм
//                uniqChars[count] = current;
//                count++;
//            }
//        }
//
//        return count;
//    }
//    // END
//}
