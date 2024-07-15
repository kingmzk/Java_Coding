public class Palindrome {
    public static void main(String[] args) {

        int no = 121;
        int temp = no;
        int rem ;
        int res = 0;
       while (temp != 0) {
            rem = temp % 10;
            res = res * 10 + rem;
            temp = temp / 10;
        }
        
        if (no == res) {
            System.out.println("it is a palindrome number");
        } else {
            System.out.println("it is not a palindrome number");
        }

    }
}
