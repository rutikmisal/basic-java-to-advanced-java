import java.util.Scanner;
interface i1
{
	double PI=3.14;
	void area();
	void show();
	void getData();
}
////////////////////////////////////////////////////////////////////////////////////////
class Sample12 implements i1
{
	double r,a;
	public void getData()
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
	public void show()
	{
		System.out.println("Radius : "+r);
		System.out.println("Area : "+a);
	}
}
////////////////////////////////////////////////////////////////////////////////////////
class Interface_ex_reference
{
	public static void main(String args[])
	{
		//Sample9 i=new Sample9();
		i1 r=new Sample12(); 
		r.getData();
		r.area();
		r.show();
	}
}