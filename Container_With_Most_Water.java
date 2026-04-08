class Container_With_Most_Water
{
	public static void Water(int nums[])
	{
			int left = 0;
			int right = nums.length-1;
			int max=0;
		while(left<right)
		{
			int height = Math.min(nums[left],nums[right]);
			int width =right -  left ;
			int area = height * width;
			if(area > max)
			{
				max = area;
			}
			if(nums[left] < nums[right])
			{
				left++;
			}
			else
			{
				right--;
			}
		}
		System.out.println("Maximum Water: " + max);
	}
	public static void main(String args[])
	{
		int nums[]= {1,8,6,2,5,4,8,3,7};
		Water(nums);
	}
}