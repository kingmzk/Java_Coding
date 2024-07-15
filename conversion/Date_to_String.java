package conversion;
import  java.util.*;
import java.text.*;
public class Date_to_String
{
    public static void main(String[] args) {
        Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("yyyy/mm/dd  hh:mm:ss");
        String strDate = dateFormat.format(date);

        System.out.println("Converted String: " + strDate);
        System.out.println(strDate.getClass().getSimpleName());
    }
}
