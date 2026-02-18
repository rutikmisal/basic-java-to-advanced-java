import java.io.*;
class Try_catch_throw
{
	public static void main(String args[]) throws IOException
	{
		int temp=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		do
		{
			try
			{
				System.out.print("Enter Temp. Far : ");
				temp=Integer.parseInt(br.readLine());
				if(temp<90 || temp>105)
				{
					NullPointerException err = new NullPointerException("Invalid Rang");
					throw err;
				}
				System.out.println("Temp. Far : "+temp);
			}
			catch(NullPointerException ne)
			{
				System.out.println("Invalid Range for Temp. : ");
				temp=0;
			}
			catch(NumberFormatException ne)
			{
				System.out.println("Please Enter 0-9 digit Number  : ");
			}
		}while(temp==0);
		System.out.println("Bye Bye.......");
	}

}