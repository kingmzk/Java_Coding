package conversion;

public class String_to_char
{
    public static void main(String[] args)
    {
        String s = "hello";
        for(int i=0;i<s.length();i++)
        {
            //char c= s.charAt(i);
            System.out.println("the character at posiotio  " + i + " is " + s.charAt(i));
        }
    }
}
