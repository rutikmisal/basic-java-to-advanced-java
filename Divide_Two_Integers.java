class Divide_Two_Integers 
{
    public static int divide(int dividend, int divisor) 
    {
        if(divisor == 0)
        {
            throw new ArithmeticException("Division by zero");
        }
        if(dividend  == Integer.MIN_VALUE && divisor  == -1)
        {
            return Integer.MAX_VALUE;
        }
        return dividend / divisor;
    }
    public static void main(String args[])
    {
	int dividend = 7;
	int divisor = -3;
	System.out.println(divide(dividend,divisor));
    }
}