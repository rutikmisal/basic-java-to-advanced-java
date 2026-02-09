class Simple_pattern5
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
				System.out.print(" * ");
			}
			for(int k=0;k<=4-i;k++)
			{
				System.out.print(" ");
			}
			System.out.println("");
		}
	}
}
