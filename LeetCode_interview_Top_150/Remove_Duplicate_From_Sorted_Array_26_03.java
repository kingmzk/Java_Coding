package LeetCode_interview_Top_150;

public class Remove_Duplicate_From_Sorted_Array_26_03 {
    public static int removeDuplicates(int[] nums){
      int len = nums.length;
      int index = 1;
      for(int i = 1; i < len; i++){
          if(nums[index - 1] != nums[i]){
                nums[index] = nums[i];
                index++;
          }
      }
      return index;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2};
        System.out.println(removeDuplicates(arr));
    }
}
