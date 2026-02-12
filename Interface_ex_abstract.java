import java.util.Scanner;
interface i1
{
	double PI=3.14;
	void area();
}
////////////////////////////////////////////////////////////////////////////////////////
interface i2 extends i1
{
	void display();
}
////////////////////////////////////////////////////////////////////////////////////////
abstract class Sample10 implements i2
{
	double r,a;
	void getData()
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius : ");
		r=sc.nextDouble();
		//PI=22.14
	}	
	public void area()
	{
		a=PI*r*r;
	}
	void show()
	{
		System.out.println("Radius : "+r);
		System.out.println("Area : "+a);
	}
}
////////////////////////////////////////////////////////////////////////////////////////
class Sample11 extends Sample10
{
	public void display()
	{
		System.out.println("Display Method ");
	}
}
////////////////////////////////////////////////////////////////////////////////////////
class Interface_ex_abstract
{
	public static void main(String args[])
	{
		Sample11 i=new Sample11();
		i.getData();
		i.area();
		i.show();
	}
}