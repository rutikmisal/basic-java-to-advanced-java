class sum_first_n_naturalNum
{
	public static void printSum(int i, int n, int sum)
	{
		if(i==n)
		{
			sum+=i;
			System.out.print(i+" = "+sum);
			return;
		}
		sum+=i;
		System.out.print(i+" + ");
		printSum(i+1,n,sum);
	}
	public static void main(String args[])
	{
		printSum(1,5,0);
	}
}