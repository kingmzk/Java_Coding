package spring_Pract;

public class punctuationString
{
    public static void main(String[] args)
    {
       String s = ("hey hi! how are you!??");
       int count = 0;

       for(int i=0;i<s.length();i++) {
           if(s.charAt(i)!=' ')
           {
               if (s.charAt(i) == '!' || s.charAt(i) == '?') {
                   count++;
               }
           }
       }
        System.out.println("the punctuationString in string is "+ count);
    }
}
