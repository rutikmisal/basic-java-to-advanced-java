import java.util.Scanner;
class Array_Object
{
	public static void main(String args[])
	{
		int i;
		Student s[]=new Student[10];
		for(i=0;i<3;i++)
		{
			s[i]=new Student();
			s[i].getData();
			s[i].cal();
		}
		System.out.println("Roll no\tName\tM1\tM2\tM3\tTotal\tPercentage\t");
		for(i=0;i<3;i++)
		{
			s[i].show();
		}		
	}
}
class Student
{
int rno, m1,m2,m3,total;
String name;
float per;
	void getData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Roll No ");
		rno=sc.nextInt();
		System.out.println("Enter Name ");
		name=sc.next();
		System.out.println("Enter Marks for M1 ");
		m1=sc.nextInt();
		System.out.println("Enter Marks for M2 ");
		m2=sc.nextInt();
		System.out.println("Enter Marks for M3 ");
		m3=sc.nextInt();	
	}
	void cal()
	{
		total=m1+m2+m3;
		per=(float)total/3;
	}
	void show()
	{
		System.out.println(rno+"\t"+name+"\t"+m1+"\t"+m2+"\t"+m3+"\t"+total+"\t"+per+"\t");
	}
}
