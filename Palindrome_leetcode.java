class Palindrome_leetcode {
    public static boolean isPalindrome(int x) {
        if(x<0)
        {
            return false;
        }
        int temp=x;
        int reverse=0;
        while(temp>0)
        {
            int reminder = temp%10;
            reverse = (reverse*10)+reminder;
            temp = temp/10;
        }
        return x == reverse;
    }
    public static void main(String args[])
    {
        int x=121;
        if (isPalindrome(x))
        {
           System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}