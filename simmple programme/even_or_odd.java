import java.util.Scanner;

public class even_or_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        int a = sc.nextInt();

        if (a % 2 == 0) {
            System.out.println(" the given number is even number");
        } else {
            System.out.println(" it is a odd number");
        }
    }

}
