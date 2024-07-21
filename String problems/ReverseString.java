public class ReverseString
{
    public static void main(String[] args)
    {

        String word = "MILLIONOIRE";
        String ans = " ";

        for(int i = word.length()-1 ; i>=0 ; i--)
        {
            ans = ans + word.charAt(i) + " ";
        }

        System.out.println(ans);


/*

        String word = "I  am MILLIONOIRE";
        StringBuffer sb = new StringBuffer(word);
        sb.reverse();
        System.out.println(sb);
*/

    }
}
