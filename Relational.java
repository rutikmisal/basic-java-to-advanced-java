import java.util.Scanner;

public class Relational 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value 1:-  ");
        int val1=sc.nextInt();
        System.out.println("Enter a value 2:-  ");
        int val2=sc.nextInt();
        System.out.println(" Equal to  "+(val1==val2));
        System.out.println("Greater Than "+(val1>val2));
        System.out.println("Less Than  "+(val1<val2));
        System.out.println("Greater Than Equal to  "+(val1>=val2));
        System.out.println("Less Than Equal to "+(val1<=val2));
    }
}
