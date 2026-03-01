import java.util.Scanner;
class TwoD_Array_ex3
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
		System.out.println("Spiral Order : ");		
		int row_start=0;
		int row_end=row-1;
		int col_start=0;
		int col_end=col-1;
		while(row_start<=row_end && col_start<=col_end)
		{
			//1
			for(int i=col_start;i<=col_end;i++)
			{
				System.out.print(num[row_start][i]+" ");
			}
			row_start++;
			//2
			for(int j=row_start;j<=row_end;j++)
			{
				System.out.print(num[j][col_end]+" ");
			}
			col_end--;
			//3
			for(int i=col_end;i>=col_start;i--)
			{
				System.out.print(num[row_end][i]+" ");
			}
			row_end--;
			//4
			for(int j=row_end;j>=row_start;j--)
			{
				System.out.print(num[j][col_start]+" ");
			}
			col_start++;

			//System.out.println();
		}
	}
}