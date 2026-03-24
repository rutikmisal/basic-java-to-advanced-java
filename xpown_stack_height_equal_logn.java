class xpown_stack_height_equal_logn
{
	public static int calPower1(int x, int n)
	{
		if(n==0)
		{
			return 1;
		}
		if(n==0)
		{
			return 0;
		}

		//if n is even 
		if(n%2==0)
		{
			return calPower1(x,n/2) * calPower1(x,n/2);
		}
		else
		{
			return calPower1(x,n/2) * calPower1(x,n/2) * x;
		}

	}
	public static void main(String args[])
	{
		int x=2,n=5;
		int ans = calPower1(x,n);
		System.out.println(ans);
	}
}