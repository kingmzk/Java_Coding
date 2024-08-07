import java.util.HashMap;
import java.util.HashSet;

public class First_Unique_Character_in_a_String_387 {
    public static int firstUniqChar(String s){
        /*
        int[] arr = new int[26];
        int len = s.length();

        for(int i = 0; i < len; i++){
            arr[s.charAt(i) - 'a'] ++;
        }

        for(int i = 0; i < len; i++){
            if(arr[s.charAt(i) - 'a'] == 1 ) return i;
        }

        return -1;
        */
        HashMap<Character,Integer> hs = new HashMap<Character,Integer>();
        int len = s.length();
        for(int i = 0; i < len; i++){
            char ch = s.charAt(i);
            if(hs.containsKey(s.charAt(i))){
                hs.put(ch, hs.get(ch) + 1);
            }
            else {
                hs.put(ch, 1);
            }
        }

        for(int i = 0; i < len; i++){
            if(hs.get(s.charAt(i)) == 1) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        String s = "loveleetcode";
        System.out.println(firstUniqChar(s));    }
}
