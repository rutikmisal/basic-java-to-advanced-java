import java.util.Arrays;
class Sort_Arrays
{
	public static void main(String args[])
	{
		int arr[] = {-2,-4,-1,0,3,2,5,1};
		Arrays.sort(arr);
		System.out.print("[");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+",");
		}
		System.out.print("]");
	}
}