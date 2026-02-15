class Try_Catch_Block
{
	public static void main(String args[])
	{
		int a=110,b=0,c,d[]={1,2,3,4,5};			//b=10
		try
		{
			c=a[1]/b;				//[10]
			System.out.println("a="+a+"b="+b+"c="+c);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("You are tried to divide by 0");
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("You to Specifiedwrong index");
		}
		System.out.println("Bye Bye...................");
	}
}