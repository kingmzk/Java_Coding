package programme;

public class palindrome
{
    public static void main(String[] args)
    {
//        String s = "madam";
//        String temp = "";
//        for(int i = 0 ; i<s.length(); i++)
//        {
//            temp = temp + s.charAt(i);
//        }
//        System.out.println(temp);
//        if(temp.equals(s))
//        {
//            System.out.println("it is a palindrome");
//        }
//        else
//        {
//            System.out.println("it is not a palindrome");
//        }



        //using stringbuffer

        String s = "121";
        StringBuffer sb  = new StringBuffer(s);

        if(sb.reverse().toString().equals(s))
        {
            System.out.println("it is palindrome");
        }
        else
        {
            System.out.println("it is not a palindrome");
        }
    }
}
