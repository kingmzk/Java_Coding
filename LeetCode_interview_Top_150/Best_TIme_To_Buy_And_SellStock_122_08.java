package LeetCode_interview_Top_150;

public class Best_TIme_To_Buy_And_SellStock_122_08 {
    public static int maxProfit(int[] nums){
        int total = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > nums[i-1]){
                total = total + (nums[i] - nums[i-1]);
            }
        }
        return total;
    }
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }
}
