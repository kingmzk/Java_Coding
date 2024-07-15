package practice_test;

public class func
{
    public static int Fun(int a ,int b)
    {
      a = 100;
      b=200;
      return a+b;
    }

    public static void main(String[] args)
    {
        int  res = Fun(20,40);
        System.out.println(res);
    }
}
