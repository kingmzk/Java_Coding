package LeetCode_interview_Top_150;

import java.util.ArrayList;
import java.util.HashMap;

public class MajorityElement_169_05 {

    public static int majorityElement(int[] nums)
    {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int ans : nums)
        {
            map.put(ans, map.getOrDefault(ans, 0)+1);
        }

        int total = nums.length/2;

       for(int key : map.keySet()){
           if(map.get(key) > total){
               return key;
           }
       }

        return -1;

//        int count = 0;
//        int candidate = 0;
//
//        for(int ans : nums){
//            if(count == 0){
//                candidate = ans;
//            }
//            count = count + ((ans == candidate) ? 1 : -1);
//        }
//        return candidate;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
}
