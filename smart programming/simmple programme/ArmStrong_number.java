public class ArmStrong_number {
    public static void main(String[] args) {
        int no = 153;
        int temp = no;
        int rem = 0;
        int length = 0;
        while (temp != 0) {
            rem = temp % 10;
            length = length + 1;
            temp = temp / 10;
        }
        System.out.println(length);
        int temp2 = no;
       
        int arm = 0;

        while (temp2 != 0) {
            int remainder = temp2 % 10;
            int result = 1;
            for (int i = 0; i < length; i++) {
                result = result * remainder;
            }
            arm = arm + result;
            temp2 = temp2 / 10;
        }
        if (arm == no) {
            System.out.println("it is a armstrong number");
        } else {
            System.out.println("it is not a armstrong number");
        }
    }
}
