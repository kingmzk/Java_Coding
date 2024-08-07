public class Find_Peak_Element_162 {

    public static int findPeakElement(int[] arr){
        if(arr.length == 1) return 0;
        if(arr[0] > arr[1]) return 0;
        if(arr[arr.length - 1] > arr[arr.length - 2]) return arr.length;

        int low = 1;
        int high  = arr.length - 2;
        int mid = 0;

        while(low <= high) {
            mid = low + (high - low) / 2;

            if(arr[mid] > arr[mid+1] && arr[mid] > arr[mid - 1]) return mid;
            else if(arr[mid] < arr[mid+1]){
                low = mid + 1;
            }
            else if(arr[mid] < arr[mid - 1]){
                high = mid - 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,1,3,5,6,4};
        System.out.print(findPeakElement(arr));

    }
}
