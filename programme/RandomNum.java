package programme;

public class RandomNum
{
    public static void main(String[] args)
    {
        int min = 200;
        int max = 500;

        System.out.println("the random values betwweem " + min + " "+ max + " is : ");
        int a  =(int) (Math.random() * (max - min + 1) + min);
        System.out.println(a);

        System.out.println("the random values betwweem " + min + " "+ max + " is : ");
        double b = Math.random() * (max - min + 1) + min;
        System.out.println(b);
    }
}
