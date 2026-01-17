class alphabet_or_not
{
public static void main(String[] args)
{
	char c='A';
	if((c>='a' && c<='z') || (c>='A' && c<='Z'))
	{
		System.out.println("This is Character : "+c);
	}
	else
	{
		System.out.println("This is  Not Character : "+c);
	}
}
}