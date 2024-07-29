
import java.util.HashMap;
public class TwoSum_1 {
    public static int[] TwoSum(int[] arr, int target){
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int n = arr.length;
        for(int i = 0;i < n;i++){
            if(map.containsKey(arr[i])){
                return new int [] {map.get(arr[i]),i};
            }
            else {
                map.put(target - arr[i],i);
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] arr = new int[] {3,2,4};
        int target = 6;

        int[] result = TwoSum(arr,target);

        for(int ans: result){
            System.out.print(ans+" ");
        }
    }
}
