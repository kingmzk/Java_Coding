public class Longest_Palindrome_409 {
    public static int longestPalindrome(String s){
        char[] ch = new char[128];
        int res = 0;
        int n = ch.length;

        for(char ans : s.toCharArray()){
            ch[ans]++;
        }

        for(int i = 0; i < n; i++ ){
            int value = ch[i];
            res = res + (value/2) * 2;
            if(res % 2 == 0 && value % 2 == 1){
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "abccccdd";
        int ans = longestPalindrome(s);
        System.out.println(ans);
    }
}
