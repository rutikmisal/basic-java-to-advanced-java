class Simple_pattern4
{
	public static void main(String args[])
	{
		int n=1;
		for(int i=0;i<=4;i++)
		{
			for(int h=0;h<=4-i;h++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(n+" ");
				n++;
			}
			for(int k=0;k<=4-i;k++)
			{
				System.out.print(" ");
			}
			System.out.println("");
		}
	}
}

//	1		space 3 num 1 space 3
//     2 3		space 2 num 2 3 space 2
//   4 5 6 
// 7 8 9 10