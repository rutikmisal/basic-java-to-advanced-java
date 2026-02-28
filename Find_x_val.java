import java.util.Scanner;
class Find_x_val
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		 int size=sc.nextInt();
		int num[]=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("Entered X Value : ");
			num[i]=sc.nextInt();
			
		}
		System.out.print("Entered X Value : ");
		int x=sc.nextInt();
		
		for(int i=0; i<num.length; i++)
		{
			if(num[i] == x)
			{
				System.out.println("x value are found..");
			}
			
		}
		
	}
}