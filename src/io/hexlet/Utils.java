package io.hexlet;

import java.util.Arrays;

class Utils {
    public static int[] uniq(int[] coll) {
        return Arrays.stream(coll).distinct().toArray();
    }
}
