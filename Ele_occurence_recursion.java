class Ele_occurence_recursion
{
	public static int first = -1;
	public static int last= -1;
	public static void Ele(int index, String str, char ele)
	{
		if(index == str.length())
		{
			System.out.println("("+first+","+last+")");
			return;
		}
		int currentchar = str.charAt(index);
		if(currentchar == ele)
		{
			if(first == -1)
			{
				first = index;
			}
			last = index;
		}
	
			
		Ele(index+1, str , ele);
	}
	public static void main(String args[])
	{
		String str = "abaacdaefaah";
		Ele(0, str, 'a');
	}
}