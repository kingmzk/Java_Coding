class String_Palindrome {
    public static void main(String[] args) {
        String s = "11211";
        String temp = s;

        StringBuffer sb = new StringBuffer(s);

        if ((sb.reverse().toString()).equals(s)) {
            System.out.println("it is a String_Palindrome");
        } else {
            System.out.println("it is a not a Palindrome");
        }
    }

}