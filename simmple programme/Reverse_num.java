public class Reverse_num {
    public static void main(String[] args) {
        int n = 12345;
        int rem;
        int res = 0;
        while (n != 0) {
            rem = n % 10;
            res = res * 10 + rem;
            n = n / 10;
        }
        System.out.println(res);
    }

}
