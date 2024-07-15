package spring_Pract;

import java.util.Arrays;
import java.util.Objects;

public class Amagram
{
    public static void main(String[] args)
    {
        String s1 = "Hello";
        String s2 = "ollhe";

       s1 =  s1.toLowerCase();
       s2 = s2.toLowerCase();

        if(s1.length() != s2.length())
        {
            System.out.println("both the String are not anagram");
        }
        else {
            char[] s11 = s1.toCharArray();
            char[] s22 = s2.toCharArray();


            Arrays.sort(s11);
            Arrays.sort(s22);

            if(Arrays.equals(s11 , s22) == true)
            {
                System.out.println("the given word is anagram");
            }
            else
            {
                System.out.println("the given word is not anagram");
            }

        }
    }
}
