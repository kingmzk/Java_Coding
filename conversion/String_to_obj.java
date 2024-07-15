package conversion;

public class String_to_obj
{
    public static void main(String[] args)
    {
        String s ="hello";
        Object o = s;
        System.out.println(o);
        System.out.println(o.getClass().getSimpleName());
    }
}
