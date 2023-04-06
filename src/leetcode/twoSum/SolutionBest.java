package leetcode.twoSum;

import java.util.Arrays;
// самый лучший по расходу памяти
class SolutionBest {
	public static int[] twoSumBest(int[] nums, int target) {
//		создаем массив который будем возвращать
		int[] output = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					output[0] = i;
					output[1] = j;
				}
			}
		}
		System.out.println(Arrays.toString(output));
		return output;
	}
}