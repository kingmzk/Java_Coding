
    import java.util.Arrays;
    import java.util.Scanner;
    
    public class Test_even_odd
    {
    
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Array Size.");
        int size = scanner.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter Array elements");
        for (int i = 0; i < size; i++) {
          arr[i] = scanner.nextInt();
        }
        System.out.println("Array Elements are:" + Arrays.toString(arr));
        System.out.println("Array elements after separating odd and even numbers are");
        int left = 0, right = arr.length - 1;
        while (arr[left] % 2 == 0) {
          left++;
        }
        while (arr[right] % 2 == 1) {
          right--;
        }
        if (left < right) {
          int temp = arr[left];
          arr[left] = arr[right];
          arr[right] = temp;
        }
        System.out.println(Arrays.toString(arr));
      }
    }
    
