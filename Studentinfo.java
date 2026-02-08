import java.util.*;
class Studentinfo
{
	public static void main(String args[])
	{
		int i,ch,n=-1,rn;
		Scanner sc = new Scanner(System.in);
		Student s[]=new Student[20];
		do
		{
			System.out.println("Menu");
			System.out.println("1.Add Student Data");
			System.out.println("2.Enter Result of a Student");
			System.out.println("3.Show Result of a Student ");
			System.out.println("4.Print All Student Data and Result ");
			System.out.println("5. Exit");
			System.out.println("Enter Your Choice Number : ");
			ch=sc.nextInt();

			switch(ch)
			{
				case 1:
					s[++n]=new Student();
					s[n].getData();
					System.out.println("Successfully Added Data for Student...");
					break;
				case 2:
					System.out.println("Enter a Roll Number : ");
					rn=sc.nextInt();
					for(i=0;i<=n;i++)
					{
						if(s[i].rno==rn)
						{
							s[i].add();
							System.out.println("Successfully Added Result for Student...");
							break;
						}
						if(i==rn)
						{
							System.out.println("Invalid Roll Number Entered...");
						}
					}
					break;
				case 3:
					for(i=0;i<=n;i++)
					{
						s[i].cal();		
					}
					break;
				case 4:
					for(i=0;i<=n;i++)
					{
						s[i].display();
					}
				break;
				case 5:
					sc.close();
				break;
				
				default :
					System.out.println("Invalid choice!!");
				break;
					
			}
		}
		while(ch>=1 && ch<=6);
	}
}
class Student
{
	int rno,m1,m2,m3,total;
	double per;
	String name;
	void getData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Roll Number ");
		rno = sc.nextInt();
		System.out.println("Enter Name ");
		name = sc.next();
	}
	void show()
	{
		System.out.println("Roll Number "+rno);
		System.out.println("Name "+name);
	}
	void add()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Roll Number :  ");
		rno = sc.nextInt();
		System.out.println("Enter Marks M1 :  ");
		m1 = sc.nextInt();
		System.out.println("Enter Marks M2 :  ");
		m2 = sc.nextInt();
		System.out.println("Enter Marks M3 :  ");
		m3 = sc.nextInt();
	}
	void cal()
	{
		total=m1+m2+m3;
		per=total/3.0;
		System.out.println("Student Result:- "+per);
	}
	void display()
	{
		System.out.println("Roll Number : "+rno);
		System.out.println("Name : "+name);
		System.out.println("Marks M1 :  "+m1);
		System.out.println("Marks M2 :  "+m2);
		System.out.println("Marks M3 :  "+m3);
		System.out.println("Total : "+total);
		System.out.println("Percentage : "+per);
	}
}