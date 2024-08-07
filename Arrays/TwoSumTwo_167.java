import java.util.HashMap;

public class TwoSumTwo_167 {
    public static int[] TwoSum(int[] numbers, int target) {
/*
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                return new int[]{map.get(arr[i]), i};
            } else {
                map.put(target - arr[i], i);
            }
        }
        return new int[0];
        */
        int left  = 0;
        int right = numbers.length - 1;

        while(left < right){
            int sum = numbers[left] + numbers[right];
            if(sum > target){
                right--;
            }
            else if(sum < target){
                left++;
            }
            else{
                break;
            }
        }
        return new int[] {left + 1 , right + 1};
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 4};
        int target = 6;

        int[] result = TwoSum(arr, target);

        for (int ans : result) {
            System.out.print(ans + " ");
        }
    }
}