
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 10;
        System.out.println("Enter the numbers: ");
        int arr[] = new int[N];
        int arr1[] = new int[N];
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                while (a < (arr1.length / 2)) {
                    arr1[a] = arr[i];
                    a++;
                    break;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                while (a < arr1.length) {
                    arr1[a] = arr[i];
                    a++;
                    break;
                }
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}
