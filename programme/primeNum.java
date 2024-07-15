package programme;

public class primeNum
{
    public static void main(String[] args)
    {
        int n = 43;
        int temp = 0;

        for(int i  = 2; i < n ; i++)
        {
            if(n%i==0)
            {
                temp = temp + 1 ;
            }
        }

        if(temp == 0)
        {
            System.out.println("yes it is a prime number");
        }
        else
        {
            System.out.println("it is not a prime number");
        }
    }
}
