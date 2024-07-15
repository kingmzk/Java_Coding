import java.util.Arrays;

class Anaagram {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "olleh";

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        if (s1.length() != s2.length()) {
            System.out.println("both the strings are not Anagram");
        } else {
            char[] s11 = s1.toCharArray();
            char[] s22 = s2.toCharArray();

            Arrays.sort(s11);
            Arrays.sort(s22);

            if (Arrays.equals(s11, s22) == true) {
                System.out.println("Both the strings are Anagram yes");
            } else {
                System.out.println("both the strings are not Anagram");
            }
        }
    }
}
