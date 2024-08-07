public class Rotate_Array_189 {
    public static void rotate(int[] arr, int i,int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};  //5 6 7 1 2 3 4
        int k = 3;

        int len = arr.length - 1;
        k = k % arr.length;

        rotate(arr, 0, len);
        rotate(arr,0, k-1);
        rotate(arr, k, len);

       for(int ans : arr){
           System.out.print(ans+ " ");
       }
    }
}
