package leetcode.twoSum;

/**
 * сложить 2 числа в массиве что бы получить таргет число и вернуть таргет в метод
 */

public class MainTwoSum {
	public static void main(String[] args) {
		int[] nums0 = {2, 7, 11, 15};
		int target0 = 9;
		SolutionTwoSum.twoSum(nums0, target0);
		int[] nums1 = {3, 2, 4};
		int target1 = 6;
		SolutionTwoSum.twoSum(nums1, target1);
		int[] nums2 = {3, 3};
		int target2 = 6;
		SolutionTwoSum.twoSum(nums2, target2);
		int[] nums3 = {30,15,0,7};
		int target3 = 7;
		SolutionTwoSum.twoSum(nums3, target3);

		int[] nums4 = {3, 7, 11, 15};
		int target4 = 18;
		SolutionBest.twoSumBest(nums4, target4);
		int[] nums5 = {3, 4, 4};
		int target5 = 8;
		SolutionBest.twoSumBest(nums5, target5);
		int[] nums6 = {5, 5};
		int target6 = 10;
		SolutionBest.twoSumBest(nums6, target6);
		int[] nums7 = {30,15,2,7};
		int target7 = 17;
		SolutionBest.twoSumBest(nums7, target7);


	}
}
