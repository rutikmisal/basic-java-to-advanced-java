//*
//** 
//*** 
//****

class Simple_pattern2
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
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
		System.out.println(" ");
		}
	}
	public static void main(String args[])
	{
		Simple_pattern2 s= new Simple_pattern2();
		s.setData(4);
		s.tri();
	}
}