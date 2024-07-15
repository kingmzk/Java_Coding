
class BackTrace {

    public static void printN(int i, int n) {
        if (n <= i) {
            printN(i, n+1);
            System.out.print(n);
        }
    }

    public static void main(String[] args) {
        printN(5, 1);
    }
}



/*
class BackTrace{
    public static void printN(int i,int n)
    {
        if(i<1) return;
        printN(i-1,n);
        System.out.print(i);
    }
public static void main(String[] args)
{
    printN(5,5);
}
}
*/
