class LeetCode_ex_50 {
    public static double myPow(double x, int n) {
        if(n==0)
        {
            return 1;
        }
        double half = myPow(x,n/2);
        if(n%2==0)
        {
            return half * half;
        }
        else if(n>0)
        {
            return x * half * half;
        }
        else 
        {
            return (1/x) * half * half;
        }
    }
public static void main(String args[])
{
	double x=2.0;
	int n=10;
	double result = myPow(x,n);
	System.out.println(result);
}
}
