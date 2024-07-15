import java.util.Scanner;
public class calculator
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println(" please enter the first number ");
        int n1 = sc.nextInt();
        System.out.println(" please enter the second number ");
        int n2 = sc.nextInt();
        System.out.println("enter the following symbol ->  + , -  , * .");
        int res ;
        String sy = sc.next();
        
        switch(sy)
        {
            case "+" : res = n1 + n2;
            System.out.println(res);
            break;
        
            case "-"  : res = n1- n2;
             System.out.println( res);
             break;
             
            case "*" : res = n1 * n2;
            System.out.println(res);
            break;

            default : System.out.println(" the symbol which u have mentioned is invalid ");
    }
 }
}
