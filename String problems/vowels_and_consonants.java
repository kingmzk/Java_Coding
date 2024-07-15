package spring_Pract;

import java.util.Locale;

public class vowels_and_consonants
{
    public static void main(String[] args)
    {
        String s = ("Welcome to Orchard");
        int constantCount  = 0;
        int vowelsCount = 0;
        s.toLowerCase();
        for(int i = 0 ;i<s.length();i++)
        {
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u')
            {
                vowelsCount++;
            }
            else if(s.charAt(i) > 'a' && s.charAt(i) <= 'z')
            {
                constantCount++;
            }
        }

        System.out.println("number of vowels in string is : " + vowelsCount);
        System.out.println("Number of constrains in a string is : "+ constantCount);
    }
}
