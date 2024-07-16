import java.util.*;

public class Even_odd {
    public static void main(String[] args) {

        int a[] = {20, 14, 12, 8 ,4, 5, 7 ,9 ,19 ,2};

        int temp = 0;
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length ; j++) {
                if ((a[i] % a[j]) % 2 == 0) {
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;

                }

            }
        }

        for (int h = 0; h < a.length; h++) {
            System.out.print(a[h] + " ");
        }
    }

}