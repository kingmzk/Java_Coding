package programme;

public class reverseNum
{
    public static void main(String[] args)
    {
        int  num = 12345;
        int temp = num;
        int rem = 0;
        int reverse = 0;

        while(temp != 0)
        {
            rem = temp % 10;
            reverse = reverse * 10 + rem;
            temp = temp / 10;
        }
        System.out.println(reverse);
    }
}