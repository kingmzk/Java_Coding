public class prime_or_not {
    public static void main(String[] args) {
        int no = 79;
        int temp = 0;
        for (int i = 2; i < no; i++) {
            if (no % i == 0) {
                temp = temp + 1;
            }
        }
        if (temp > 0) {
            System.out.println("it is not a prime number");
        } else {
            System.out.println(" it is a prime number ");
        }
    }

}
