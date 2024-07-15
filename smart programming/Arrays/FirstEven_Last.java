public class FirstEven_Last {
    public static void main(String[] args) {
        int a[] = { 12, 23, 34, 35, 4, 5, 65, 534, 53, 24, 243, 34 };
        int b[] = new int[a.length];
        int c[] = new int[a.length];
        int d[] = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                b = a;
            }

        }
        for (int j = 0; j < a.length; j++) {
            if (a[j] % 2 != 0) {
                c = a;
            }
        }

        for (int even : b) {
            System.out.print(even+" ");
        }
        // for (int odd : c) {
        //     System.out.print(odd+" ");
        // }

    }

}
