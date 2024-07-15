import java.util.Scanner;

public class multiplication_table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to get multiplication table ");
        int n = sc.nextInt();
        int res;

        for (int i = 0; i <= 10; i++) {
            res = n * i;
            System.out.println(n + " * " + i + " = " + res);
        }
    }
}
