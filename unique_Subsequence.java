import java.util.HashSet;
class unique_Subsequence
{
	public static void Unique(String str, int idx, String newString,HashSet<String> set)
	{
		if(idx==str.length())
		{
			if(set.contains(newString))
			{
				return;
			}
			else
			{
				System.out.println(newString);
				set.add(newString);
				return;
			}
		}
		char currentChar = str.charAt(idx);
			
		Unique(str,idx+1,newString+currentChar,set);

		Unique(str,idx+1,newString,set);
	}
	public static void main(String args[])
	{
		String str = "aaa";
		HashSet<String> set = new HashSet<>();
		Unique(str,0,"",set);
	}
}