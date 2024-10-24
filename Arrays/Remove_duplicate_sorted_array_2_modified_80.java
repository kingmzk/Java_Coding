import java.util.*;

public class Remove_duplicate_sorted_array_2_modified_80 {

    public static List<Integer> countAndRepeatTwice(List<Integer> nums) {
       Map<Integer, Integer> map = new HashMap<Integer, Integer>();

       for(int ans : nums) {
           map.put(ans, map.getOrDefault(ans, 0) + 1);
       }

       List<Integer> result = new ArrayList<Integer>();

       for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
           int num = entry.getKey();
           int count = entry.getValue();

           for(int i = 0; i < Math.min(count, 2); i++) {
               result.add(num);
           }
       }

       return result;
    }
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 4, 4);
        List<Integer> result = countAndRepeatTwice(nums);

        System.out.println("Input: " + nums);
        System.out.println("Output: " + result);
    }
}