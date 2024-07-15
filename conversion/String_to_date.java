package conversion;//  TO CONVERT STRING IN TO DATE

import java.util.Date;
import java.text.SimpleDateFormat;

class String_to_date
{
    public static void main(String[] args) throws Exception
    {
        String date = "10/10/1999";
        Date d = new  SimpleDateFormat("dd/MM/yyyy").parse(date);
        System.out.println(date+"\t"+d);

        System.out.println(d.getClass().getSimpleName());
    }
}
