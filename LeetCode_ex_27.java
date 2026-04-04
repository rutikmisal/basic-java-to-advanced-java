class LeetCode_ex_27 {
    public static int removeElement(int[] nums, int val) {
        int count =0;
        for(int i=0;i<nums.length;i++)
        {
            if(val!=nums[i])
            {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
    public static void main(String args[])
    {
        int val=3;
        int nums[]={3,2,2,3};
        int result = removeElement(nums,val);
	System.out.println("new Length : "+result);
	for(int i=0;i<result;i++)
	{
		System.out.println(nums[i]);
	}
    }
}