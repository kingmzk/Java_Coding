package LeetCode_interview_Top_150;
public class Best_Time_To_Buy_And_SellStock_121_07 {
    public static int maxProfit(int[] prices)
    {
        int minValue = Integer.MAX_VALUE;
        int maxValue = 0;

        for(int i = 0; i< prices.length; i++) {
            if(prices[i] < minValue){
                minValue = prices[i];
            }
            else if(prices[i] - minValue > maxValue){
                maxValue = prices[i] - minValue;
            }
         }
        return maxValue;
    }

    public static void main(String[] args)
    {
        int[] price = {7,1,5,3,6,4};
        System.out.println(maxProfit(price));
    }
}
