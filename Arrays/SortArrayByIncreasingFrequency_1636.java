import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class SortArrayByIncreasingFrequency_1636 {

    public static int[] frequencySort(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int n = arr.length;
        for(int i = 0; i < n; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+ 1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        ArrayList<Integer> list = new ArrayList<Integer>(map.keySet());
        Collections.sort(list, (a,b) -> {
            if(map.get(a) == map.get(b)){
                return b - a;
            }
            else{
                return map.get(a) - map.get(b);
            }
        });

        int[] result = new int[n];
        int index = 0;

        for(int ans : list){
            for(int i = 0; i < map.get(ans); i++){
                result[index++] = ans;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3};
        int[] res = frequencySort(arr);
        for(int ans : res){
            System.out.print(ans + " ");
        }

    }
}
