class CalPower
{
	public static int calcPow(int x, int n)
	{
		if(n==0)
		{
			return 1;
		}
		if(n==0)
		{
			return 0;
		}
		int xpownm1 = calcPow(x,n-1);
		int xpow = x*xpownm1;
		return xpow;
	}
	public static void main(String args[])
	{
		int x=2,n=7;
		int ans = calcPow(x,n);
		System.out.println(ans);
	}
}