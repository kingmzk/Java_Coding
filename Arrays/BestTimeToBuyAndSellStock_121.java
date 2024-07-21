public class BestTimeToBuyAndSellStock_121 {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        int len = arr.length;
        int maxProfit = 0;

        /*
        int buy = arr[0];


        for(int i = 1; i < len; i++) {
            if(arr[i] < buy) {
                buy = arr[i];
            }
            else {
                int currentProfit = arr[i] - buy;
                maxProfit = Math.max(currentProfit, maxProfit);
            }
        }
        System.out.println(maxProfit);

        */

        int min = Integer.MAX_VALUE;
        for (int i = 0; i <len; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
            else if(arr[i] - min > maxProfit){
                maxProfit = arr[i];
            }
        }
        System.out.println(maxProfit);

    }
}
