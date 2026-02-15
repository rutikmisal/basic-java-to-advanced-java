import java.util.Scanner;
class Simple_pattern8
{
	public static void main(String args[])
	{
		char ch='a';
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1 || i==n || j==1 || j==n)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		
	}
}
//********      
//*	   *
//*        *
//*        *
//********