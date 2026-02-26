import java.util.Scanner;

public class cal_simp_gst
{
    public static void main(String[] args) 
    {
        int pen,pencil,eraser;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Pen Price : ");
        pen=sc.nextInt();
        System.out.print("Enter Pencil Price : ");
        pencil=sc.nextInt();
        System.out.print("Enter Eraser Price : ");
        eraser=sc.nextInt();

        int cal = (pen+pencil+eraser);
        float gst = cal*0.18f;
        double total= cal+gst;
        System.out.println("Total cost of item with include GST : "+total);
        
        
    }
    
}
