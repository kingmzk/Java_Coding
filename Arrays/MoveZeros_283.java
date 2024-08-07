import java.util.ArrayList;

public class MoveZeros_283 {


    public static void moveZeroes(int[] arr) {

        int nonZeroIndex = 0;
        int len = arr.length;

        for (int i = 0; i < len; i++) {
            if (arr[i] != 0) {
                arr[nonZeroIndex] = arr[i];
                nonZeroIndex++;
            }
        }

        for (int i = nonZeroIndex; i < len; i++) {
            arr[i] = 0;
        }
    }


    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZeroes(arr);
        for (int ans : arr) {
            System.out.print(ans + " ");
        }
    }
}


    /*
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        int len = arr.length;
        ArrayList<Integer> al = new ArrayList<>();

        for(int i = 0; i < len; i++){
            if(arr[i] != 0){
              al.add(arr[i]);
            }
        }

        while(al.size() < len){
            al.add(0);
        }

        for(int i = 0; i < al.size(); i++){
            arr[i] = al.get(i);
        }

        for(int ans : arr){
            System.out.print(ans+" ");
        }

    }

}
*/