package LeetCode_interview_Top_150;

public class Remove_Duplicate_From_Sorted_Array_2_80_04 {

    public static int removeDuplicates(int[] nums){
        int index = 0;
        for(int ans : nums)
        {
            if(index == 0 || index == 1 || nums[index - 2] != ans){
                nums[index] = ans;
                index++;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3};
        System.out.println(removeDuplicates(arr));
    }
}
