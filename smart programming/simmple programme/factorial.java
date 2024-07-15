public class factorial {
    public static void main(String[] args) {
        int n = 5;
        int res = 1;
        for (int i = 5; i > 0; i--) {
            res = res * i;
        }
        System.out.println(res);

        int m = 7;
        int res1 = 1;
        for (int k = 1; k <= m; k++) {
            res1 = res1 * k;
        }
        System.out.println(res1);

    }
}
