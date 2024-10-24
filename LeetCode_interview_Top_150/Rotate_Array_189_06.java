package LeetCode_interview_Top_150;
public class Rotate_Array_189_06 {
    public static void Rotate(int[] nums,int k){
        Reverse(nums, 0, nums.length-1);
        Reverse(nums, 0, k-1);
        Reverse(nums, k,  nums.length - 1);
    }
    public static void Reverse(int[] arr, int i, int j)
    {
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int k = 3;

        Rotate(arr, k);

        for(int ans : arr){
            System.out.println(ans);
        }
    }
}