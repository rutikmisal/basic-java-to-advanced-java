class statics
{
	int a,b;
	static int c=100,count=0;
statics()
{

}
statics(int a1,int b1)
	{
		a=a1;
		b=b1;
		count++;
	}
	void show()
	{	
		System.out.println("a= "+a);
		System.out.println("b="+b);
	}
	static void dis()
	{
		System.out.println("c="+c);
	}
}
class Static_ex
{
	public static void main(String args[])
	{
		System.out.println("Object 1: ");
		statics s = new statics(10,20);
		s.show();
		s.dis();
	
		System.out.println("Object 2 : ");
		statics s1 = new statics(30,40);
		s1.show();
		s1.dis();
		`````````
		System.out.println("Object 3 : ");
		statics s2= new statics(50,60);
		s2.show();
		s2.dis();
		
		System.out.println(statics.count+" Total Object is created");
	}
}