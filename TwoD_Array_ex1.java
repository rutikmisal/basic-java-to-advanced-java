import java.util.Scanner;
class TwoD_Array_ex1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Row  : ");
		int row=sc.nextInt();
		System.out.println("Enter Number of Column : ");
		int col=sc.nextInt();
		int num[][]=new int[row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.println("Enter Value : ");
				num[i][j]=sc.nextInt();
			}
		}
		System.out.print("Enter Number for x value : ");
		int x=sc.nextInt();
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(num[i][j]==x)
				System.out.println("Location are Found at position ("+i+" "+j+")");
			}
		}
	}	
}