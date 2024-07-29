public class FindFastAndLastPositionInSorted_34 {

    public static int[] searchRange(int[] arr, int target){
        int low = 0;
        int high = arr.length - 1;
        int mid;
        int[] result = new int[2];

        if(arr.length == 0) return new int[] {-1,1};

        while(low < high){
            mid = low + (high - low) / 2;
            if(arr[mid] < target){
                low = mid + 1;
            }
            else {
                high = mid;
            }
        }

        if(arr[low] != target) return new int[] {-1,1};

        result[0] = low;
        high = arr.length-1;

        while(low<high){
            mid = low + (high - low) / 2;
            if(arr[mid] <= target){
                low = mid+1;
            }
            else{
                high = mid;
            }
        }

        result[1] = low - 1;
        return result;
    }
    public static void main(String[] args) {
          int [] arr = new int[] {5,7,7,8,8,10};
          int target = 8;
          int[] result = searchRange(arr, target);
          for(int ans : result) {
              System.out.print(ans+" ");
          }
    }
}
