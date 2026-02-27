class Final
{
	public static void main(String args[])
	{
		A a= new A();
		B b= new B();
		
		A r;
		
		r=a;
		r.Call();
		
		r=b;
		r.Call();
	}
}
class A 
{
		final void Call()
		{
			System.out.println("The final method are call...");
		}
}
class B extends A
{
		void Call()
		{
			System.out.println("Ilegal.......!Error........"); //Error can't ne override
		}
}