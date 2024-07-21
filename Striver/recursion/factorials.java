
class factorials
{
     public static int printN(int n)
     {
       if(n==1) return 1;
       return (n * printN(n-1));
     }

    public static void main(String[] args) {
        System.out.print(printN(5));
    }
}


/*
 * 
 * class factorial
{
      static int res = 1;

static void printN(int n)
{
    if(n>=1){
        res = res * n;
        n--;
        printN(n);
    }
   else System.out.println(res);
}
    public static void main(String[] args) {
    printN(5);    
    }
}


class factorial
{
     public static void printN(int n,int res)
     {
        if(n<1){
            System.out.println(res);
            return;
        }
        printN(n-1, res*n);
     }


    public static void main(String[] args) {
        printN(5,1);
    }
}

 */
