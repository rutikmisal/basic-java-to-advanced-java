class print_num_5_to_1
{
	public static void printNumber(int n)
	{
		if(n==0)
		{
			return;
		}
		System.out.println(n);
		printNumber(n-1);
	}
	public static void main(String args[])
	{
		int n=5;
		printNumber(n); //n=5
	}	
}