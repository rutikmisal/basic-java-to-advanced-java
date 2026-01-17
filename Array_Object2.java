import java.util.Scanner;
public class Array_Object2
{
	public static void main(String args[]) 
	{
		int ch,i,n;
		Scanner sc = new Scanner(System.in);
		Student s[]=new Student[10];
		System.out.print("Enter No. of Student : ");
		n =sc.nextInt();
		while(true)
		{
			System.out.println("******************Menu********************");
			System.out.println(" 1.AddData \n 2.Show Data \n 3.AddMarks \n 4.Show Marks \n 5.Exit ");
			System.out.print("Enter Key : ");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					for(i=0;i<n;i++)
					{
						s[i]=new Student();
						s[i].getData();
					}
					break;
				case 2:
					System.out.println("Roll Number\tFirstName\tLastName\tDivision\tClass");
					for(i=0;i<n;i++)
					{
						s[i].show();
					}
					break;
				case 3:			
					for(i=0;i<n;i++)
					{
						s[i]=new Student();
						s[i].AddMarks();
					}
					break;
				case 4:
					System.out.print("Roll No\tM1\tM2\tM3\tTotal\tPercentage");
					for(i=0;i<n;i++)
					{
						s[i].showmarks();
					}
					break;
				case 5:
					System.out.println("Existing..........................!");
					sc.close();
				default:
					System.out.println("Invalid Menu Key.....!\tTry Again. ");
			}
		}
	}
}
class Student
{
	int rno,m1,m2,m3,total;
	String Fn,Ln,div,cls;
	float per;
	Scanner sc = new Scanner(System.in);
	void getData()
	{
		System.out.print("Enter Roll Number of Student : ");
		rno = sc.nextInt();
		System.out.print("Enter First Name of Student  : ");
		Fn = sc.next();
		System.out.print("Enter Last Name of Student  : ");
		Ln = sc.next();
		System.out.print("Enter Division of Student  : ");
		div = sc.next();
		System.out.print("Enter Class of Student  : ");
		cls = sc.next();
	}
	void show()
	{
		System.out.println("\t"+rno+"\t"+Fn+"\t\t"+Ln+"\t\t"+div+"\t\t"+cls);
	}
	void AddMarks()
	{
		System.out.print("Enter Roll Number of Student : ");
		rno = sc.nextInt();	
		System.out.print("Enter Marks M1 : ");
		m1=sc.nextInt();
		System.out.print("Enter Marks M2 : ");
		m2=sc.nextInt();
		System.out.print("Enter Marks M3 : ");
		m3=sc.nextInt();
	}
	void showmarks()
	{
		total=m1+m2+m3;
		per=(float)total/3;
		System.out.println(rno+"\t"+m1+"\t"+m2+"\t"+m3+"\t"+total+"\t"+per+"\t");
	}
}