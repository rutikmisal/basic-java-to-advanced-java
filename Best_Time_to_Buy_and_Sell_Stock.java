class Best_Time_to_Buy_and_Sell_Stock {
    public static int maxProfit(int[] prices) 
    {
        int profit =0;
        int max=0;
        int min=99999;
        int left =0;
        int right = prices.length;
        while(left<right)
        {
            int current=prices[left];
            if(current < min)
            {
                min = current;
            }
            else
            {
                profit = current - min;
                if(profit > max)
                {
                    max = profit;
                }
            }
            left++;
        }
    return max;
    }
public static void main(String args[])
{
	int prices[]={7,1,5,3,6,4};
	int result = maxProfit(prices);
        System.out.println(result); 
	
}
}