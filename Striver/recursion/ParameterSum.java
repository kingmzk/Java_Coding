
class ParameterSum {

    public static void printN(int n, int sum) {
        if (n < 1) {
            System.err.println("Sum = " + sum);
            return;
        }
        printN(n - 1, sum + n);
    }

    public static void main(String[] args) {
        printN(3, 0);
    }
}
