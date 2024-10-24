package LeetCode_interview_Top_150;
public class Merge_Sorted_Array_88_01 {
    public static void solutions(int[] num1 , int[] num2 , int m, int n)
    {
        int p = m + n - 1;
        int p1 = m - 1;
        int p2 = n - 1;

        while(p1 >= 0 && p2 >= 0){
            if(num1[p1] >= 0 && num2[p2] >= 0){
                num1[p] = num1[p1];
                p1--;
                p--;
            }
            else {
                num1[p1] = num2[p2];
                p2--;
                p--;
            }
        }

        while(p2 >= 0){
            num1[p1] = num2[p2];
            p2--;
            p--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,0,0,0};
        int[] arr1 = {2,5,6};
        int m = arr.length;
        int n = arr1.length;

        solutions(arr, arr1, m, n);
    }
}
