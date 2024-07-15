package spring_Pract;

public class Rotation_Of_String {
    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "deabc";

        if (str1.length() != str2.length()) {
            System.out.println("No these String will never be Rotation because of difference in length ");
        } else {
            str1 = str1.concat(str1);


            if (str1.indexOf(str2) != -1) {
                System.out.println("it is a rotation of string ");
            } else {
                System.out.println("it is not a rotation of string ");
            }

        }

    }
}
