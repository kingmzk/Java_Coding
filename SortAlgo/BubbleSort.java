import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int a[] = { 12, 34, 34, 5, 23, 4, 45, 435, 45, 345, 356, 467, 567, 4, 654, 5634, 5 };
        int temp = 0;
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1])  {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        for (int element : a) {
            System.out.print(element+" ");
        }
    }

}
