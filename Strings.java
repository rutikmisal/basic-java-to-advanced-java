class Strings
{
	public static void main(String args[])
	{

		//Concatenation

		String firstName="Rutik";
		String lastName="Misal";
		String fullName=firstName  +" "+  lastName;
		System.out.println("Name : "+fullName);

		//Length
		System.out.print("Total Length of Name : "+fullName.length());

		//charAt
		System.out.println("Each Charater Print  : ");
		for(int i=0;i<fullName.length();i++)
		{
			System.out.print("\t"+fullName.charAt(i));
		}
		
		//Compare
		String name1="Rutik";
		String name2="Rutik";
		System.out.println("\n");
		if(name1.compareTo(name2)==0)
		{
			System.out.println("Two Strings Are equal");
		}
		else
		{
			System.out.println("Two Strings Are Not		 equal");
		}

		//SubString
		String Name3="I am Rutik Misal "
		String subStrings = lastName.substring(6,11);
		System.out.println("SubString : "+subStrings);
	}
}