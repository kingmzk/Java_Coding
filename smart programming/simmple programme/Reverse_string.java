class Reverse_string {
    // public static void main(String[] args) {
    // String s = "mindtree";
    // String res = "";

    // for(int i = s.length()-1; i >= 0 ; i--)
    // {
    // res = res +s.charAt(i);
    // }
    // System.out.println(res);
    // }
    // }
    public static void main(String[] args) {
        String s = "abrar";
        StringBuffer sb = new StringBuffer(s);
        String st = sb.reverse().toString();
        System.out.println(sb.reverse());
        System.out.println(st);

    }

}