import java.io.*;
class Switch_case_BufferedReader
{
	public static void main(String args[]) throws IOException
	{	while(true)
		{
			BufferedReader r= new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter Number : ");
			int a = Integer.parseInt(r.readLine());
			System.out.println("\n 1.Check Prime Number \n 2.EvenOdd \n 3.Exit ");
			System.out.print("Enter Choice Number : ");
			int ch = Integer.parseInt(r.readLine());
			switch(ch)
			{
				case 1:
					int i;
					for(i=2;i<a;i++)
					{
						if(a%i==0)
						break;
					}
					if(a==i)
					{
						System.out.println("Prime Number"+a);
					}
					else
					{
						System.out.println("Prime Not Number"+a);
					}
					break;
				case 2:
					if(a%2==0)
					{
						System.out.println("This is Even Number "+a);
					}
					else
					{
						System.out.println("This is Odd Number "+a);
					}
					break;
				case 3:
					System.out.println("Existing.....................................");
					r.close();
					break;
				default:
					System.out.println("Choice Number Are Invalid Re-Enter");
					break;
			}
		}
	}
}
