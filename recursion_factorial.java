class recursion_factorial
{	
	public static int calFact(int n)
	{
		if(n==1 || n==0)
		{
			return 1;
		}
		int fact_1mn = calFact(n-1);
		int fact = (n*fact_1mn);
		return fact;
	}
	public static void main(String args[])
	{
		int n=5;
		int ans = calFact(n);
		System.out.println("Factorial = "+ans);
	}
}