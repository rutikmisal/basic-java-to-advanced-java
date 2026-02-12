import java.util.Scanner;
interface i1
{
	double PI=3.14;
	void area();
}
class Sample9 implements i1
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
class Interface_ex
{
	public static void main(String args[])
	{
		Sample9 i=new Sample9();
		i.getData();
		i.area();
		i.show();
	}
}