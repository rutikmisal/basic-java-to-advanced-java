	   //x^1        x^2            x^3            x^n
//y=1+---------+---------------+------------+---------------
	   //1!         2!               3!             n!

	   //2^1        2^2            2^3         
//y=1+---------+---------------+------------
	   //1!=1     2!=2            3!=6        


// 2  2*2    2*2*2   
class hard {
    public static void main(String args[]) {

        int x = 2;
        int n = 4;

        double sum = 1.0;   // y = 1
        int fact = 1;
        int power = 1;

		//1*2=2
		//2*2=4
		//4*2=8

        for (int i = 1; i <= n; i++) {
            power = power * x;   // x^i
            fact = fact * i;     // i!
            sum = sum + (double) power / fact;
        }

        System.out.println("Result y = " + sum);
    }
}