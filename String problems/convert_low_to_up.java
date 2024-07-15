package spring_Pract;

public class convert_low_to_up
{
    public static void main(String[] args)
    {
        String S = "welcome to orchard";
        S =  S.replaceAll("\\s" , "");
        System.out.println(S);

        StringBuffer Sb = new StringBuffer(S);

        for(int i = 0 ; i<S.length() ; i++)
        if(Character.isLowerCase(S.charAt(i)))
        {
            Sb.setCharAt(i, Character.toUpperCase(S.charAt(i)));
        }
        else if(Character.isUpperCase(S.charAt(i)))
        {
              Sb.setCharAt( i , Character.toLowerCase(S.charAt(i)));
        }

        System.out.println("String after conversion is : " + Sb);

    }
}
