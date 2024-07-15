package spring_Pract;

public class remove_spaces
{
    public static void main(String[] args)
    {
        String s = "hello i am a millionire";
        s = s.replaceAll("\\s" , "");
        System.out.println(s);
    }
}
