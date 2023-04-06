package leetcode.twoSum;

class SolutionSmallMemory {
	public int[] twoSum(int[] nums, int target) {
		int arr[] = new int[2];
		int len = nums.length;
		int i = 0;
		int j = 1;
		int d = 1;
		while (true) {
			if (nums[i] + nums[j] == target) {
				arr[0] = i;
				arr[1] = j;
				System.gc();
				break;
			} else if (j == len - 1) {
				d++;
				j = d;
				i = 0;
			} else {
				i++;
				j++;
			}
		}
		System.gc();
		return arr;
	}
}

