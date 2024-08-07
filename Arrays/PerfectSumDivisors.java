import java.util.ArrayList;

public class PerfectSumDivisors {
    public static void main(String[] args) {
        int[]  arr = {3,5,6,28};
        int n = arr.length;

        for(int i = 0; i < n; i++) {
            ArrayList<Integer> al = new ArrayList<Integer>();
            int sum =0;

            for(int j = 1; j <= arr[i]/2; j++){
                if(arr[i] % j == 0){
                    al.add(j);
                    sum += j;
                }
            }

            if(sum == arr[i]){
                System.out.println("yes");
            }
            else System.out.println("No");
        }
    }
}
