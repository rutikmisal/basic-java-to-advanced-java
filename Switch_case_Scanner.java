import java.util.*;
class Switch_case_Scanner
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st Number :  ");
		int a=sc.nextInt();
		System.out.print("Enter 2nd Number :  ");
		int b=sc.nextInt();
		while(true)
		{
		System.out.println("\n1.Addition:  \n 2.Substarction \n 3.Multipliaction \n 4.Division\n 5.Exit");
		int ch=sc.nextInt();
		switch(ch)		{
			case 1:

				int add=a+b;
				System.out.println("Addition of Two Number : "+add);
				break;
			case 2:
				int sub=a-b;
				System.out.println("Subtraction of Two Number : "+sub);
				break;
			case 3:
				int mul=a*b;
				System.out.println("Multiplication of Two Number : "+mul);
				break;
			case 4:
				float div=a/b;
				System.out.println("Division of Two Number : "+div);
				break;
			case 5:
				System.out.println("Exit!....................... : ");
				sc.close();
				break;
			default:
				System.out.println("Incorrect Choice Number: ");
				break;
			}
		}	
	}
	
}