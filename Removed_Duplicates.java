class Removed_Duplicates 
{
	public static boolean map[] = new boolean[26];
	
	public static void Duplicates(String str,int idx,String newString)
	{
		if(idx == str.length())
		{
			System.out.println(newString);
			return;
		}
		char currentChar = str.charAt(idx);
		if(map[currentChar - 'a' ] == true)
		{
			Duplicates(str, idx+1,newString);
		}
		else
		{
			newString += currentChar;
			map[currentChar - 'a'] = true;
			Duplicates(str, idx+1,newString);
		}
	}
	public static void main(String args[])
	{
		String str= "abbccda";
		Duplicates(str, 0,"");
	}
}