import java.util.*;

class SumOfN{

static int ans = 0;
public static void printN(int n)
{
    if(n>=1)
    {
        int pow =(int) Math.pow(n,3);
        ans = ans +  pow;
        pow=0;
        printN(--n);
    }
       else System.out.print(ans);
}



    public static void main(String[] args)
    {
        printN(7);
    }
}