package spring_Pract;

public class Count_Char
{
    public static void main(String[] args)
    {
       String str = "hello world";
       int count = 0;

       for(int i=0;i<str.length();i++)
       {
           if(str.charAt(i) != ' ')
           {
               count  = count + 1 ;
           }
       }
        System.out.println(count);
    }
}
