package conversion;

public class int_to_string
{
    public static void main(String[] args)
    {
        //  1st method
        int i = 12345;
        String s = String.valueOf(i);

        System.out.println(s);

//       2nd method
        int io = 15890;
        String str = Integer.toString(io);

        System.out.println(str);

        //3rd method

        int ot = 6789;
        String st = String.format( "%d", ot );

        System.out.println(st);
        System.out.println(st.getClass().getSimpleName());
    }
}
