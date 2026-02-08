import java.util.*;
class Bank
{
	
	public static void main(String args[])
	{
		int i,ch,n=-1,n1=-1,acc;
		Scanner sc = new Scanner(System.in);
		Bankinfo b[] = new Bankinfo[100];
		passbook p[] = new passbook[100];
		do
		{
			System.out.println("Menu");
			System.out.println("1.Add Account Details");
			System.out.println("2.Show Details");
			System.out.println("3.Deposite");
			System.out.println("4.Withdraw");
			System.out.println("5.Passbook Print");
			System.out.println("6. Exit");
			System.out.println("Enter Your Choice Number : ");
			ch=sc.nextInt();

			switch(ch)
			{
				case 1:
					b[++n]=new Bankinfo();
					b[n].getData();
					break;
				case 2:
					for(i=0;i<=n;i++)
					{
						b[i].showdata();
					}
					break;
					
				case 3:
					System.out.println("Enter a Account Number : ");
					acc=sc.nextInt();
					for(i=0;i<=n;i++)
					{
						if(b[i].accno==acc)
						{
							b[i].Deposite();
							
							p[++n1]= new passbook();
							p[n1].accno = b[i].accno;
							p[n1].name = b[i].name;
							p[n1].dep = b[i].dep;
							p[n1].amount = b[i].amount;
							p[n1].date = b[i].date;
							p[n1].trancode = "D";
							break;
						}
						if(i==acc)
						{
							System.out.println("Invalid Account Number Re-Entered...");
						}
					}
					break;
				case 4:
					System.out.println("Enter a Account Number : ");
					acc=sc.nextInt();
					for(i=0;i<=n;i++)
					{
						if(b[i].accno==acc)
						{
							b[i].withdraw();
							p[++n1]= new passbook();
							p[n1].accno = b[i].accno;
							p[n1].name = b[i].name;
							p[n1].with = b[i].with;
							p[n1].amount = b[i].amount;
							p[n1].date = b[i].date;
							p[n1].trancode = "W";
							break;
						}
						if(i==acc)
						{
							System.out.println("Invalid Account Number Re-Entered...");
						}
					}
					break;
				case 5:
					//p[++n]=new passbook();
					System.out.println("Enter a Account Number : ");
					acc=sc.nextInt();
					b[n].getDetails();
					System.out.println("AccNo\tName\tAmount\tType\tBalance\tDate");
					for(i=0;i<=n1;i++)
					{
						if(p[i].accno==acc)
						{
							p[i].pass();
							//break;
						}
						else
						{
							System.out.println("Invalid Account Number Entered...");
						}
						
					}
					System.out.println("Successfully Passbook Print...");	
					break;
				case 6:
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
class Bankinfo
{
	int accno,with,dep,amount,total;
	String name,date;
	Scanner sc = new Scanner(System.in);
	void getData()
	{
		System.out.println("Enter Account Number : ");
		accno = sc.nextInt();
		System.out.println("Enter Name : ");
		name = sc.next();
		System.out.println("Enter Account Created Date : ");
		date = sc.next();
		System.out.println("Enter Initial Amount (minimun 2000) : ");
		amount = sc.nextInt();
		if(amount<2000)
		{
			amount =2000;
			System.out.println("Minimum Balanced is 2000. set to 2000.");
		}
		System.out.println("Successfully Account Created.... ");
	}
	void showdata()
	{
		System.out.println("Account Number : "+accno);
		System.out.println("Name : "+name);
		System.out.println("Amount : "+amount);
		System.out.println("Amount Created Date : "+date);
	}
	void withdraw()
	{
		System.out.println("Enter Withdraw Amount : ");
		with = sc.nextInt();
		if(amount >= with) //5000 >=6000
		{	
			System.out.println("Enter Withdraw Date : ");
			date = sc.next();
			amount-=with;
			System.out.println("Withdraw : "+amount);
			System.out.println("Successfully Withdraw Money...");
		}
		else
		{
			System.out.println("Insufficient Balanced...!");
		}
	}
	void Deposite()
	{
		System.out.println("Enter Deposite Amount : ");
		dep = sc.nextInt();
		System.out.println("Enter Deposite Date : ");
		date = sc.next();
		amount+=dep;
		System.out.println("Deposite : "+amount	);
		System.out.println("Successfully Deposite Money...");
	}
	void getDetails()
	{
		System.out.println("****************Details******************");
		System.out.println("Name : "+name);
		System.out.println("Account No. : "+accno);
		System.out.println("Account Create Date : "+date);
		System.out.println("*****************************************\n");
	}
}
class passbook
{
	int accno,total,amount,dep,with;
	String name,trancode,date;
	void pass()
	{
		if(trancode=="D")
		{
			System.out.println(accno+"\t"+name+"\t"+dep+"\t"+trancode+"\t"+amount+"\t"+date);
		}
		else
		{
			System.out.println(accno+"\t"+name+"\t"+with+"\t"+trancode+"\t"+amount+"\t"+date);
		}
	}
}