public class Find_Minimum_in_Rotated_Sorted_Array_153 {
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        int low = 0;
        int high = arr.length-1;

        for(int i = 0; i<arr.length; i++){
            int mid = low + (high - low) / 2;

            if(arr[mid] > arr[high]){
                low = mid + 1;
            }else {
                    high = mid;
            }
        }
        System.out.println(arr[low]);
    }
}
