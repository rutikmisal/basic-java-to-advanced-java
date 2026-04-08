class Trapping_Rain_Water
{
	public static void Trap(int nums[])
	{
		int left = 0;
		int right = nums.length-1;
		int maxLeft = 0;
		int maxRight = 0;
		int water = 0;
		while(left<right)
		{
			if(nums[left] < nums[right])
			{
				if(nums[left] >= maxLeft)
				{
					maxLeft = nums[left];
				}
				else
				{	
					water += (maxLeft-nums[left]);
				}
				left++;
			}
			else
			{
				if(nums[right] > maxRight)
				{
					maxRight = nums[right];
				}
				else
				{
					water += (maxRight-nums[right]);
				}
				right--;
			}
		}
		System.out.println("Trap Water "+water);
		
	}
	public static void main(String args[])
	{
		int nums[]={0,1,0,2,1,0,1,3,2,1,2,1};
		Trap(nums);
		
	}
}