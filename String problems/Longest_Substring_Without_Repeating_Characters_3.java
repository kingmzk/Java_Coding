import java.util.HashMap;
import java.util.HashSet;

public class Longest_Substring_Without_Repeating_Characters_3 {
    public static int lengthOfLongestSubstring(String s){
        /*
        int left = 0, right = 0, maxLength = 0;
        HashSet<Character> set = new HashSet<Character>();
        int n = s.length();

        while(right < n){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                right++;
                maxLength = Math.max(maxLength, right - left);
            }
            else{
                set.remove(s.charAt(left));
                left++;
            }
        }
        return maxLength;
        */

        int left = 0, right = 0, maxLength = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int n = s.length();

        while(right < n){
            char current_char = s.charAt(right);

            if(map.containsKey(current_char)){
                left = Math.max(map.get(current_char) + 1 , left);
            }

            map.put(current_char, right);

            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }
         return maxLength;

    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println("The length of the longest substring without repeating characters is: " + lengthOfLongestSubstring(s)); // Output: 3

        s = "bbbbb";
        System.out.println("The length of the longest substring without repeating characters is: " + lengthOfLongestSubstring(s)); // Output: 1

        s = "pwwkew";
        System.out.println("The length of the longest substring without repeating characters is: " + lengthOfLongestSubstring(s)); // Output: 3
    }
}
