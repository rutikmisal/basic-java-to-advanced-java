class Try_catch_ex2
{
	public static void main(String args[])
	{
		int a=30,b=3,x[]={1,2,3,4,5};      //b=0
		float c;
		try
		{
			c=(float)a/b;
			System.out.println("a= "+a+" b= "+b+" c= "+c);
			try
			{
				System.out.println("Array Index x= "+x[4]);  //5
			}
			catch(NullPointerException pe)
			{
					System.out.println("Null Pointer Error...........");
			}
		}
		catch(ArithmeticException ae)
		{
			System.out.println("You are tried to divide by 0...........");
		}
		catch(ArrayIndexOutOfBoundsException ie)
		{
				System.out.println("You specified Index Position...........");
		}
		System.out.println("Bye Bye...........");
	}
}