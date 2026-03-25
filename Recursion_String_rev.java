class Recursion_String_rev
{
	public static void main(String args[])
	{	
		String str = "abcd";
		int index = str.length()-1;
		reverse(str,index);
	}
	public static void reverse( String str, int index)
	{
		if(index==0)
		{
			System.out.print(str.charAt(index));
			return;
		}
		System.out.print(str.charAt(index));
		reverse(str, index-1);
	}
}