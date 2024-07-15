package spring_Pract;

public class DivideString
{
    public static void main(String[] args)
    {
        String str = "aaaabbbbcccc";
        int len = str.length();
        int temp = 0;
        int n = 3;
        int cha = len/n;

        String[] st = new String[n];

        if(len%n != 0)
        {
            System.out.println("this string cannot be converted in to equal string");
        }
        else
        {
            for(int i=0;i<len; i = i+cha)
            {
                String part = str.substring(i,i+cha);
                st[temp] = part;
                temp++;

            }
            System.out.println(n + " equal number of strings are ");
        }

        for(int j=0;j<st.length;j++)
        {
            System.out.println(st[j]);
        }
    }
}
