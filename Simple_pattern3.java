//   *=3space   star=1
//  **=2		star=2
// ***=1		star=3
//****=0		star=4

class Simple_pattern3
{
	int n;
	void setData(int n1)
	{
		n=n1;
	}
	void tri()
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n-1;j++)
			{
				System.out.print("");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
		System.out.println(" ");
		}
	}
	public static void main(String args[])
	{
		Simple_pattern3 s= new Simple_pattern3();
		s.setData(4);
		s.tri();
	}
}