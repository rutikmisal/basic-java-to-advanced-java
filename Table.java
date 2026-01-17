class Table
{
int n;
void setData(int n1)
{
	n=n1;
}
void tablem()
{		
	for(int k=1;k<=n;k++)
	{
		for(int i=1;i<=n;i++)
		{
			
		int ta=k*i;
		System.out.print(ta+"\t");
		}
	System.out.println(" ");
	}
	
}
public static void main(String args[])
{
	Table t=new Table();
	t.setData(10);
	t.tablem();
}
}