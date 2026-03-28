class Subsequence
{
	public static void Sequence(String str, int idx, String newString)
	{
		if(idx==str.length())
		{
			System.out.println(newString);
			return;
		}
		char currentchar = str.charAt(idx);
		// is to be
		Sequence(str, idx+1, newString+currentchar);
		// is not to be
		Sequence(str, idx+1, newString);
	}
	public static void main(String args[])
	{
		String str = "abc";
		Sequence(str,0,"");
	}
}