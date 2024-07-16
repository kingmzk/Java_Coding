import java.util.*;

public class Kth_largest {
    public static void main(String[] args) {
        int[] a = { 12, 34, 34, 43, 4, 34, 45, 54656, 7, 5, 4, 5, 43, 2, 3, 2132, 2323 };
        int temp = 0;
        int k = 5;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            if (i == k - 1) {
                System.out.println("kth largest element is " + a[i]);
            }
        }
        Arrays.sort(a);
       for(int ko : a)
       {
           System.out.println(ko);
       }
    }

}
