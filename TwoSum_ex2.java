import java.util.Arrays;

class TwoSum_ex2
{
    public static void main(String args[])
    {
        int nums[] = {2, 7, 11, 15};
        Arrays.sort(nums);

        int target = 9;

        int result[] = twoSum(nums, target);
        System.out.println(result[0] + " " + result[1]);
    }

    public static int[] twoSum(int[] nums, int target) 
    {
        int start = 0;
        int end = nums.length - 1;

        while(start < end)
        {
            int sum = nums[start] + nums[end];

            if(sum == target)
            {
                return new int[]{start, end};
            }
            else if(sum > target)
            {
                end--;
            }
            else
            {
                start++;
            } 
        }
        return new int[]{-1, -1};
    }
}