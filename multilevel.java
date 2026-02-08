class multilevel
{
	public static void main(String args[])
	{
		Sample6 s = new Sample6();
	}
}
class Sample4
{
	Sample4()
	{
		System.out.println("Welcome to Class Sample 4");
	}
}
class Sample5 extends Sample4
{
	Sample5()
	{
		System.out.println("Welcome to Class Sample 5");
	}

}
class Sample6 extends Sample5
{
	Sample6()
	{
		System.out.println("Welcome to Class Sample 6");
	}

}