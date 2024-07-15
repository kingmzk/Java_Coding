package practice_test;


import java.util.*;

public class HashSets
{
    public static void main(String[] args)
    {
        HashSet hs  = new HashSet();
        hs.add(10);
        hs.add("deepak");
        hs.add("100.55");
        hs.add("zakria");
        hs.add("zakria");
        hs.add("true");

//        System.out.println(hs);

        Iterator itr = hs.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

        ArrayList list = new ArrayList();
        list.add("apple");
        list.add("banana");
        list.add("orange");

        hs.addAll(list);

        hs.size();

        System.out.println(hs);

        HashSet hs1  = new HashSet(list);
        hs1.add("khan");
        hs1.add("Pasha");

        System.out.println(hs1);

    }
}
