//*
//** 
//*** 
//****

class Simple_pattern1
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
			for(int j=i;j<n;j++)
			{
				System.out.print("*");
			}
		System.out.println(" ");
		}
	}
	public static void main(String args[])
	{
		Simple_pattern1 s= new Simple_pattern1();
		s.setData(4);
		s.tri();
	}
}