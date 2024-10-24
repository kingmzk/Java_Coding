public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = { 12, 34, 34, 5, 23, 4, 45, 435, 45, 345, 356, 467, 567, 4, 654, 5634, 5 };
        int temp = 0;
        int len = arr.length;
        int min = 0;

        for (int i = 0; i < len; i++)
        {
            min = i;
            for(int j = i + 1; j < len ; j++){
                if(arr[j] < arr[min])
                {
                    min = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        for(int ans : arr){
            System.out.print(ans + " ");
        }
    }
}
