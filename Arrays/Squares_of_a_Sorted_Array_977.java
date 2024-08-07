import java.util.Arrays;

public class Squares_of_a_Sorted_Array_977 {
    public static int[] sortedSquares(int[] arr){
        /*
        int len = arr.length;
        for(int i=0; i<len; i++){
            arr[i] = arr[i] * arr[i];
        }
        Arrays.sort(arr);
        return arr;
        */
         int[] result = new int[arr.length];
         int increment = arr.length - 1;
         int left = 0;
         int right = arr.length - 1;

         while(left <= right){
             if(Math.abs(arr[left]) > Math.abs(arr[right])){
                 result[increment] = arr[left] * arr[left];
                 left++;
             }
             else {
                 result[increment] = arr[right] * arr[right];
                    right--;
             }
             increment--;
         }
         return result;
    }

    public static void main(String[] args) {
        int[] arr = {-4,-1,0,3,10};
        int[] res  = sortedSquares(arr);

        for(int ans : res){
            System.out.print(ans+" ");
        }
    }
}
