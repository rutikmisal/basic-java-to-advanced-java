import java.util.*;
class vowel_check
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter String : ");
		char c = s.next().charAt(0);
		if((c=='a') || (c=='e') || (c=='o') || (c=='i') || (c=='u'))
		{
			System.out.println("This is  a vowel : "+c);
		}
		else
		{
			System.out.println("This is  not a vowel : "+c);
		}
	}
}