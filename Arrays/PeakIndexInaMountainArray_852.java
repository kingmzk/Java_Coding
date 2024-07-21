public class PeakIndexInaMountainArray_852 {
    public static void main(String[] args) {
        int[] arr = {0,2,1,0};
//        int i=0;
//        while(arr[i]<arr[i+1]){
//            i++;
//        }
//        System.out.println(i);

//        for(int i=0;i<arr.length;i++){
//            if(arr[i] > arr[i+1]){
//                System.out.println(i);
//            }
//        }

        int low = 0;
        int high = arr.length-1;
        int mid;

        while(low < high){
            mid = low + (high-low) /2;

            if(arr[mid] < arr[mid+1]){
                low = mid + 1;
            }
            else {
                high = mid;
            }
        }
        System.out.println(high);

    }
}
