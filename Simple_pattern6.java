class Simple_pattern6
{
	public static void main(String args[])
	{
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<=((4-i)+1);j++)
			{		
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{		
				System.out.print(i);
			}
			for(int h=0;h<=((4-i)+1);h++)
			{		
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
//     1        3space
//    2 2 
//  3 3 3 
//4 4 4 4