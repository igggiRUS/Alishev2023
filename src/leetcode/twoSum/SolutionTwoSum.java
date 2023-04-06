package leetcode.twoSum;

import java.util.Arrays;

class SolutionTwoSum {
	public static int[] twoSum(int[] nums, int target) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (target == nums[j] + nums[i]) {
					 System.out.println(Arrays.toString(new int[]{i, j}));
					return new int[]{i, j};
				}
			}
		}

		return nums; // лишняя строчка
	}
}