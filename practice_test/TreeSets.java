package practice_test;
import java.util.*;

public class TreeSets
{
    public static void main(String[] args)
    {

        TreeSet ts = new TreeSet();
        ts.add(40);
        ts.add(60);
        ts.add(20);
        ts.add(30);
        ts.add(50);
        ts.add(10);

        System.out.println(ts);


        //Using Comparator
        TreeSet treeSet = new TreeSet(new LengthComparator());

        treeSet.add("banana");
        treeSet.add("apple");
        System.out.println("TreeSet with Comparator: " + treeSet);


    }

    static class LengthComparator implements Comparator<String>
    {
        @Override
        public int compare(String s1, String s2)
        {
            return Integer.compare(s2.length(),s1.length());
        }
    }

}
