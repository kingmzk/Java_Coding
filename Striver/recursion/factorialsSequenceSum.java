class factorialsSequenceSum
{
      static int res = 1;

static void printN(int n)
{
    int ans = n-1;
    if(n>=1){

        res = res + ans * n;
        n--;
        printN(n);
    }
   else System.out.println(res);
}
    public static void main(String[] args) {
    printN(5);    
    }
}