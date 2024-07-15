public class fabonacci {
    public static void main(String[] args) {
        int a = 0;
        System.out.println(a);
        int b = 1;
        System.out.println(b);
        int c;
        for (int i = 0; i <= 13; i++) {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}
