import java.util.Arrays;
import java.util.HashSet;

public class Contains_Duplicate_217 {
    public static boolean containsDuplicate(int[] arr){
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int ans : arr){
            if(!hs.add(ans))  return true;
        }
        return false;

//        Arrays.sort(arr);
//        int n = arr.length-1;
//        for(int i=0;i<n;i++) {
//            if(arr[i] == arr[i + 1]) return true;
//        }
//        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,1};
        System.out.println(containsDuplicate(arr));
    }
}
