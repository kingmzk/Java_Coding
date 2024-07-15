public class fabonacci_recur {
    static int a = 0, b = 1,c;

    public static void main(String[] args) {
        int n = 10;
        fabonacci_recur r = new fabonacci_recur();
        r.recur(10);
    }

    void recur(int n) {
        if (n > 0) {
            int c = a + b;
            System.out.println(c);
            a = b;
            b = c;
            recur(n - 1);
        }
    }

}
