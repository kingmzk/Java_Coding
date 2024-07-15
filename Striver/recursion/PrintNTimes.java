class PrintNTimes
{
    static int i = 1;

    public static void PrintToN(int n)
    {

        if(i<=n)
        {
            System.out.print("MZK"+" ");
            i++;
            PrintToN(n);
        }
    }

    public static void main(String[] args)
    {
        PrintToN(5);
    }
}