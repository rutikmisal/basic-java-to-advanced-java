class Remove_Duplicates_From_Sorted_Array
{
    public static int removeDuplicates(int[] nums) 
    {
        int index = 0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[index] != nums[i])
            {
                index++;
                nums[index] = nums[i];
            }
        }
        return index+1;
    }
    public static void main(String args[])
    {
        int nums[]={0,0,1,1,1,2,2,3,3,4};
        
        for(int j=0;j<nums.length;j++)
        {
            System.out.print(nums[j]+" ");
        }
        System.out.println();
        removeDuplicates(nums);
        for(int j=0;j<nums.length;j++)
        {
            System.out.print(nums[j]+" ");
        }
    }
}