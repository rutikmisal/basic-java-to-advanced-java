class abstract_ex
{
	public static void main(String args[])
	{
		sample3 s = new sample3();
		s.show();
		s.display();
		s.put();
	}
}
abstract class sample1
{
	void show()
	{
		System.out.println("Welcome to Class Sample 1");
	}
	abstract void display();
	abstract void put();
}
abstract class sample2 extends sample1
{
	void display()
	{
		System.out.println("Welcome to Class Sample 2 extends sample 1");
	}
}
class sample3 extends sample2
{
	void put()
	{
		System.out.println("Welcome to Class Sample 3 extemds sample 2");
	}
}
