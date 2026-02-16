import java.io.*;
class Try_catch_buffered
{
	public static void main(String args[]) throws IOException
	{
		int a=0,b=0;
		float c;
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		do
		{
			try
			{
				System.out.println("Enter Value of A : ");
				a =Integer.parseInt(br.readLine());
			}
			catch(NumberFormatException ne)
			{
				System.out.println("Invalid Number Please Enter 0-9 digit ");
			}
		}while(a==0);
		do
		{
			try
			{
				System.out.println("Enter Value of B : ");
				b =Integer.parseInt(br.readLine());
			}
			catch(NumberFormatException ne)
			{
				System.out.println("Invalid Number Please Enter 0-9 digit ");
			}
		}while(b==0);
		try
		{
			c=(float)a/b;
			System.out.println("a = "+a+" b = "+b+" c = "+c);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("You are tried to divide by 0 ");
		}
		System.out.println("Bye Bye...........");	
	}
}