class Try_catch_finally
{
	public static void main(String args[])
	{
		int a=30,b=3,x[]={1,2,3,4,5};
		float c;
		try
		{
			c=(float)a/b;
			System.out.println("a= "+a+"b= "+b+"c= "+c);
			System.out.println("Array Index x= "+x[3]);
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("You specified Index Position...........");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("You are tried to divide by 0");

		}
		finally
		{
			System.out.println("You Are finally Block...........");
		}
		System.out.println("Bye Bye ...........");
	}
}