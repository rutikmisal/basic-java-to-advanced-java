class tower_of_hanoi
{
	public static void Tower(int n, String src, String helper, String dest)
	{
		if(n==1)
		{
			System.out.println("transfer disk "+n+" from "+src+" to "+dest);
			return;
		}
		Tower(n-1,src,dest,helper);
		System.out.println("transfer disk"+n+"from"+src+"to"+dest);
		Tower(n-1,helper,src,dest);
	}
	public static void main(String args[])
	{
		Tower(3,"S","H","D");
	}
}