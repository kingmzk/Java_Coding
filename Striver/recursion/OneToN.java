
class OneToN
{           
       public static void PrintToN(int n)
        {
            if(n>=1)
            {
                System.out.println(n+" ");
                PrintToN(--n);
            }
            
        }
    public static void main(String[] args)
    {
       PrintToN(5);
    }
}






/*
//n to 1
class OneToN
{           
       public static void PrintToN(int n)
        {
            if(n<=0) return;
            System.out.println(n+" ");
           // n--;
            PrintToN(--n);
        }
    public static void main(String[] args)
    {
       PrintToN(5);
    }
}

*/




/*
class OneToN
{
    static int i = 1;                       
       public static void PrintToN(int n)
        {
            if(i>n) return;
            System.out.println(i+" ");
            i++;
            PrintToN(n);
        }
    public static void main(String[] args)
    {
       PrintToN(5);
    }
}

*/







/*
class OneToN
{
    static int i = 1;         
       public static void PrintToN(int n)
        {
              if(i<=n)
              {
                  System.out.print(i+" ");
                  i++;
                  PrintToN(n);
              }
              else return;
        }
    public static void main(String[] args)
    {
       PrintToN(5);
    }
}
*/