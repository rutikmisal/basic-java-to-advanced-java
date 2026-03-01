import java.util.Scanner;
class TwoD_Array_ex2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Rows : ");
		int row=sc.nextInt();
		System.out.println("Enter Number of Columns : ");
		int col=sc.nextInt();
		int num[][]=new int[row][col];
		//Input
		//Rows
		for(int i=0;i<row;i++)
		{
			//Columns
			for(int j=0;j<col;j++)
			{
				num[i][j]=sc.nextInt();
			}
		}
		//Output
		//Rows
		System.out.println("After 2D Array.....\n");
		for(int i=0;i<row;i++)
		{
			//Column 
			for(int j=0;j<col;j++)
			{
				System.out.print(num[i][j]);
			}
			System.out.println();
		}
	}
}