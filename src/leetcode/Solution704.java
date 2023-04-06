package leetcode;

/**
 * https://leetcode.com/problems/binary-search/submissions/927439110/
 * (если числа нет то вернуть -1) если число есть то вернуть его индекс
 * перебор числа если числа нет вернуть индекс из первого
 * 704. Binary Search
 */
public class Solution704 {
    public static void main(String[] args) {
        Solution704.search(new int[]{-1, 0, 3, 5, 9, 12}, 9); // 4
        Solution704.search(new int[]{-1, 0, 3, 5, 9, 12}, 2); // -1
        Solution704.search(new int[]{5}, 5); // 0
        Solution704.search(new int[]{5}, -5); // -1
    }

    public static int search(int[] nums, int target) {
        int i;
        int length = nums.length - 1;
        for (i = 0; i <= length; ++i) {
            if (target == nums[i]) {
                System.out.println(i);
                return i;
            }
        }
        System.out.println(-1);
        return -1;
    }
}
