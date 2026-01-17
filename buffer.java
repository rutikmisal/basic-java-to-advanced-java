import java.io.*;
class buffer
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Your Age : ");
		int n=Integer.parseInt(b.readLine());
		System.out.println("This is Age for You : "+n);
	}
}