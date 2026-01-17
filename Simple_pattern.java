//*
//** 
//*** 
//****

class Simple_pattern
{
	int n;
	void setData(int n1)
	{
		n=n1;
	}
	void tri()
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
		System.out.println(" ");
		}
	}
	public static void main(String args[])
	{
		Simple_pattern s= new Simple_pattern();
		s.setData(4);
		s.tri();
	}
}