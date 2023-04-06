package leetcode.twoSum;
// самый быстрый по выполенинию без перебора массива вложенного
class SoutionElIf {
		public int[] twoSum(int[] nums, int target) {
			int[] res = new int[2];
			int step = 1;
			for(int i=0;i<nums.length;)
			{
				if(step >= nums.length)
					break;
				if(step + i >= nums.length)
				{
					step++;
					i=0;
					continue;
				}
				else if(nums[i] + nums[step + i] == target)
				{
					res[0] = i;res[1] = i + step;
					break;
				}
				i++;
			}
			return res;
		}
	}

