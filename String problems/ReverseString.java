package spring_Pract;

public class ReverseString
{
    public static void main(String[] args)
    {
        String word = "I  WILL BECOME MILLIONOIRE";
        String[] arr = word.split(" ");
        String ans = " ";

        for(int i =arr.length-1 ; i>=0 ; i--)
        {
            ans = ans + arr[i] + " ";
        }

        System.out.println(ans);


    }
}
