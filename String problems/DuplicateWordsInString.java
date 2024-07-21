import java.util.HashSet;
import java.util.HashMap;
public class DuplicateWordsInString {
    public static void main(String[] args) {

        /*  //HashSet
        String str = "dsa is a dsa because it is a dsa";
        String[] arr = str.trim().split("\\s+"); // Split by one or more spaces
        int count = 0;

        HashSet<String> hs = new HashSet<>();
        for (String ans : arr) {
            if (hs.contains(ans)) {
                count++;
            } else {
                hs.add(ans);
            }
        }
        System.out.println(count);
        */



        //HashMap

        String str = "dsa is a dsa because it is a dsa";
        String[] arr = str.trim().split("\\s+"); // Split by one or more spaces
        int count = 0;

        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        for(String words : arr){
            if(hm.containsKey(words)){
                hm.put(words,hm.get(words)+1);
                count++;
            }else{
                hm.put(words,1);
            }
        }
        System.out.println(hm);
        System.out.println(count);

    }
}
