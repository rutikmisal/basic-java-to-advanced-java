class Keypad_Recursion
{
	public static String keypad[] = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz",};

	public static void Key(String str, int idx, String combination)
	{
		if(idx==str.length())
		{
			System.out.println(combination);
			return;
		}
		char currentChar = str.charAt(idx);
		String mapping  = keypad[currentChar - '0'];

		for(int i = 0; i<mapping.length();i++)
		{
			Key(str,idx+1,combination + mapping.charAt(i));
		}
	}
	public static void main(String args[])
	{
		String str = "233";
		Key(str,0,"");
	}
}