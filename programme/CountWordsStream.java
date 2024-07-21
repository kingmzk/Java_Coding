package programme;
import java.util.*;

public class CountWordsStream {
    public static void main(String[] args) {
        String str = "hello world";
        int length = (int) Arrays.stream(str.split("\\s")).count();
        System.out.println(length);
    }
}
