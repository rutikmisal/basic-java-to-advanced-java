class Valid_Palindrome
{
    public static boolean isPalindrome(String s) 
    {
        String newString = "";
        String rev = "";
        for(int i=0; i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch))
            {
                newString += Character.toLowerCase(ch);
            }
        }
        for(int i=newString.length()-1;i>=0;i--)
        {
                rev += newString.charAt(i);
        }
        return rev.equals(newString);
       
    }
    public static void main(String args[])
    {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}