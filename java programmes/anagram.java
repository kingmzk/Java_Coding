
import java.util.*;
public class anagram
{
    public static void main(String[] args)
    {
        String s1= "hello";
        String s2 = "lloeh";

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        if(s1.length() != s2.length())
        {
            System.out.println("both words are not anagram");
        }
        else
        {
          char[] c1 = s1.toCharArray();
          char[]  c2 = s2.toCharArray();

          Arrays.sort(c1);
          Arrays.sort(c2);

          if(Arrays.equals(c1, c2) == true)
          {
              System.out.println("both the words are anagram ");
          }
          else
          {
              System.out.println("both the words are not anagram ");
          }
        }

    }
    
}
