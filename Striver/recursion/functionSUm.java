public class functionSUm {

    public static int printN(int n)
    {
        if (n == 0) {
            return 0;
        }
        return (n + printN(n - 1));
    }

    public static void main(String[] args) {
       
        System.out.print(printN(5));
    }
}
