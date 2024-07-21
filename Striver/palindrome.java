 class palindrome {
    public static void main(String[] args) {
        String s1 = "madam";
        String s2 = "mada";
        System.out.println("String 1 is :  " + isPalindrome(s1));
        System.out.println("String 2 is :  " + isPalindrome(s2));
    }
    public static boolean isPalindrome(String word) {
        if(word.length()<=1) return true;
        if(word.charAt(0) != word.charAt(word.length()-1)) return false;
        return isPalindrome(word.substring(1,word.length()-1));
      }
    }
        

    // public static boolean isPalindrome(String word) {
    //     int start = 0;
    //     int end = word.length()-1;
    //     while(start<end)
    //     {
    //         if(word.charAt(start) != word.charAt(end)) return false;
    //         start++;
    //         end--;
    //     }
    //     return true;
    //   }
    // }

    


