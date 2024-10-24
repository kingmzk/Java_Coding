import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = { 12, 34, 34, 5, 23, 4, 45, 435, 45, 345, 356, 467, 567, 4, 654, 5634, 5 };
        int temp = 0;
        int len = arr.length;

        for(int i = 0; i < len ; i++ ){
            for(int j = 0; j < len - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int ans : arr){
            System.out.print(ans + " ");
        }
    }
}
