class factorial_by_recursion {
    static int res = 1;

    public static void main(String[] args) {
        int n = 5;
        factorial_by_recursion r = new factorial_by_recursion();
        r.recur(n);
        System.out.println("factorial of  " + n + "  is " + res);

    }

    void recur(int n) {
        if (n >= 1) {
            res = res * n;
            recur(n - 1);
        }
    }
}
