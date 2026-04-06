import java.util.Arrays;
class Sum3
{
	public static void sumThree(int arr[],int tar)
	{
		Arrays.sort(arr);
		for(int i=0;i<arr.length-2;i++)
		{
			if(i>0 && arr[i] == arr[i-1])
			continue;
			int left = i+1;
			int right =arr.length-1;
			while(left<right)
			{
		
				int sum = arr[i] + arr[left] + arr[right];
				if(sum==tar)
				{
					System.out.println("["+arr[i]+","+arr[left]+","+arr[right]+"]");
					left++;
					right--;
				}
				else if(sum < tar)
				{
					left++;
				}		
				else
				{
					right--;
				}

			}	
		}
	}
	public static void main(String args[])
	{
		int arr[]={-1, -4, -1, 0, 1, 2};
		int tar =0;
		sumThree(arr,tar);
	}
}