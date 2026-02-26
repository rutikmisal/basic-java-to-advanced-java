import java.util.Scanner;

public class Income_Tax_Cal
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Salary : ");
        int salary = sc.nextInt();

        if(salary<=500000)
        {
            System.out.println("0% Tax ");
        }
        else if(salary<=1000000 && salary>=500000)
        {
            System.out.println("20% Tax ");
        }
        else
        {
            System.out.println("30% Tax ");
        }
    }
    
}
