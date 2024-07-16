public class Second_largest {
    public static void main(String[] args) {
        int a[] = { 12, 32, 4, 32, 45, 435, 3, 647, 6, 7, 64, 5, 3, 4, 534 };
        int temp = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;

                }
            }
        }
        for (int arr : a) {
            System.out.print(arr + "  ");
        }
    }

}
