package io.hexlet.array;

import java.util.Arrays;

class Utils12 {
    public static int[] uniq(int[] coll) {
        return Arrays.stream(coll).distinct().toArray();
    }
}
