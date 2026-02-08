import java.util.Scanner;
class Recursion_fact
{
	int n;
	void getData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A number : ");
		n = sc.nextInt();
	}
	void show()
	{
		System.out.println("Factorial: "+fact(n));
	}
	int fact(int n)
	{
		if(n==1)
			return 1;
		else
			return (n*fact(n-1));
	}
	public static void main(String args[])
	{
		Recursion_fact ob1 = new Recursion_fact();
		ob1.getData();
		ob1.show();
	}
}
