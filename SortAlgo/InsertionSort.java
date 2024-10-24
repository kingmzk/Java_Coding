public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5,1,6,2,3,4};
        int len = arr.length;

        for(int i = 0; i < len ; i++){

            int temp = arr[i];
            int j = i;

            while(j > 0 && arr[j-1] > temp){
                arr[j] = arr[j-1];
                j=j-1;
            }
            arr[j] = temp;
        }

        for(int ans : arr){
            System.out.print(ans+" ");
        }

    }

}
