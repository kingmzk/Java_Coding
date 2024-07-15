package programme;

public class factorial
{
    public static void main(String[] args)
    {
        int n = 5;
        int res = 1;
//        for(int i = n;i>=1;i--)
//        {
//            res = res * i;
//        }
//        System.out.println(res);

        for(int i = 1;i<=n;i++)
        {
            res = res * i;
        }
        System.out.println(res);
    }


}
