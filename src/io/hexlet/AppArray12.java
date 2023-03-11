package io.hexlet;

class AppArray12 {
    /**
     * Реализуйте публичный статический метод getSameCount(), который принимает на вход два массива целых чисел. Метод должен возвращать количество общих уникальных значений в обоих массивах
     * // Общие уникальные элементы: 1, 3, 2
     * App.getSameCount(new int[] {1, 3, 2, 2}, new int[] {3, 1, 1, 2, 5}); // 3
     *
     * // Общие уникальные элементы: 4
     * App.getSameCount(new int[] {1, 4, 4}, new int[] {4, 8, 4}); // 1
     *
     * // Общие уникальные элементы: 1, 10
     * getSameCount(new int[] {1, 10, 3}, new int[] {10, 100, 35, 1}); // 2
     *
     * // Нет элементов
     * getSameCount(new int[] {}, new int[] {}); // 0
     * Подсказки
     * Для получения массива без повторяющихся элементов, используйте метод Utils.uniq(). Этот метод уже написан в упражнении
     * int[] coll = {1, 1, 2, 3, 4, 4};
     * int[] uniqColl = Utils.uniq(coll);
     * System.out.println(uniqColl); // [1, 2, 3, 4]
     * В целях обучения и прокачки, решите это упражнение с помощью вложенных циклов
     * @param args
     */
    public static void main(String[] args) {
        AppArray12.getSameCount(new int[]{1, 3, 2, 2}, new int[]{3, 1, 1, 2, 5}); // 3 // Общие уникальные элементы: 1, 3, 2
        AppArray12.getSameCount(new int[]{1, 4, 4}, new int[]{4, 8, 4}); // 1 // Общие уникальные элементы: 4
        AppArray12.getSameCount(new int[]{1, 10, 3}, new int[]{10, 100, 35, 1}); // 2 // Общие уникальные элементы: 1, 10
        AppArray12.getSameCount(new int[]{}, new int[]{}); // 0 // Нет элементов
    }
    // BEGIN (write your solution here)

    public static int getSameCount(int[] coll1, int[] coll2) {
        var uniq1 = Utils12.uniq(coll1);
        var uniq2 = Utils12.uniq(coll2);

        var count = 0;

        for (var item1 : uniq1) {
            for (var item2 : uniq2) {
                if (item1 == item2) {
                    count++;
                }
            }
        }

        return count;
    }
    // END
}

