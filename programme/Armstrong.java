package programme;

public class Armstrong
{
    public static void main(String[] args)
    {
        int n = 153;
        int temp = n;
        int length = 0;
        while (temp != 0)
        {
              length = length + 1;
              temp = temp / 10;
        }
        System.out.println(length);
        int temp1 = n;
        int armstrong = 0;
        int rem;
        while(temp1 != 0)
        {
            int mul = 1;
            rem = temp1 % 10;
            for(int i=1;i<=length;i++)
            {
                mul = mul * rem  ;
            }
            armstrong = armstrong + mul;
            temp1 = temp1 / 10;
        }
        System.out.println(armstrong);

        if(armstrong == n)
        {
            System.out.println("it is armstrong number");
        }
        else
        {
            System.out.println(" it is not a armstrong number");
        }
    }
}
