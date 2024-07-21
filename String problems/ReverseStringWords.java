public class ReverseStringWords {
    public static void main(String[] args) {
        String word = "I am MILLIONOIRE";
        String[] arr = word.split(" ");
        String ans = "";

        for(int i =arr.length-1 ; i>=0 ; i--)
        {
            ans += arr[i] + " ";
        }

        System.out.println(ans.trim());




        String word1 = "I am MILLIONOIRE";
        StringBuffer sb = new StringBuffer(word1);
        sb.reverse();
        System.out.println(sb);

        /*
        MILLIONOIRE am I
        ERIONOILLIM ma I
         */
    }
}
