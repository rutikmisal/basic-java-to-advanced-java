import java.util.Scanner;
class Recursion_Fibonacci
{
	int n;
	void getData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		n=sc.nextInt();
	}
	void show()
	{
		int f0=0,f1=1;
		System.out.println("Fibanacci Serious : "+f0+"\t"+f1);	
		fiba(n-2,f0,f1);
	}
	void fiba(int n,int f0,int f1)
	{	
		int f2;
		if(n>=1)
		{
			
			f2=f0+f1;
			System.out.print("\t"+f2);
			fiba(n-1,f1,f2);
		}
	}
	public static void main(String[] args)
	{
		Recursion_Fibonacci fb = new Recursion_Fibonacci();
		fb.getData();
		fb.show();
	}
}