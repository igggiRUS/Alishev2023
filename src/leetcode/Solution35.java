package leetcode;

/**
 * 35
 * https://leetcode.com/problems/binary-search/submissions/927439110/
 * (если числа нет то вернуть -1) если число есть то вернуть его индекс
 * перебор числа если числа нет вернуть индекс из первого
 * 704. Binary Search
 */
public class Solution35 {
    /**
     * Учитывая отсортированный массив различных целых чисел и целевое значение, верните индекс, если целевое значение найдено. Если нет, верните индекс туда, где он был бы, если бы он был вставлен по порядку.
     */
    public static void main(String[] args) {
        Solution35.searchInsert(new int[]{1, 3, 5, 6}, 5); // 2
        Solution35.searchInsert(new int[]{1,3,5,6}, 2); // 1
        Solution35.searchInsert(new int[]{1,3,5,6}, 7); // 4

    }

    public static int searchInsert(int[] nums, int target) {
        int i;
        int length = nums.length - 1;
        for (i = 0; i <= length; ++i) {
            if (nums[i] >= target) {
//                System.out.println();
                System.out.println(i);
                return i;
//            } else if (nums[i] >= target) {
//                return i;
            }
        }
//        System.out.println();
        System.out.println(i);
        return i;
    }
}
