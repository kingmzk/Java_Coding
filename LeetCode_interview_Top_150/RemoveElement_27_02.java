package LeetCode_interview_Top_150;

public class RemoveElement_27_02 {
    public static int removeElement(int[] nums, int val){
        int len = nums.length;
        int j = 0;
        for(int i = 0; i < len; i++){
            if(nums[i] != val){
                nums[j] = nums[i];
                j++;
            }
        }

        return j;
    }

    public static void main(String[] args) {
        int[] arr = {3,2,2,3};
        int val = 3;

        int res =  removeElement(arr, val);
    }
}
