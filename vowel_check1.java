import java.util.*;
class vowel_check1
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter String : ");
		String string = s.next();
		if((('a') || ('e') || ('o') || ('i') || ('u'))==string)
		{
			System.out.println("This is  a vowel : "+string);
		}
		else
		{
			System.out.println("This is  not a vowel : "+string);
		}
	}
}