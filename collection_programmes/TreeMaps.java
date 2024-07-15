import java.util.*;

public class TreeMaps {
    public static void main(String[] args) {
        TreeMap<Integer,String> map=new TreeMap<Integer,String>();      
        map.put(1, "Red");
        map.put(2, "Green");
        map.put(3, "Black");
        map.put(4, "White");
        map.put(5, "Blue");
      

       //1. Write a Java program to associate the specified value with the specified key in a Tree Map.
        // System.out.println(map);
        //   for(Map.Entry<Integer, String> ans : map.entrySet()){
        //     System.out.println(ans.getKey()+" "+ ans.getValue());
        //   }

        //2. Write a Java program to copy Tree Map's content to another Tree Map.
        // TreeMap<Integer,String> map1=new TreeMap<Integer,String>();
        // map1.put(10,"Tree");
        // map1.put(20,"Map");
        // map1.putAll(map);
        // System.out.println(map1);


        //3. Write a Java program to search for a key in a Tree Map.
        //System.out.println(map.containsKey(5));


        //4. Write a Java program to search for a value in a Tree Map
        // System.out.println(map.containsValue("Black"));

        //5. Write a Java program to get all keys from a Tree Map.
        // System.out.println(map.keySet());
        // System.out.println(map.values());
       

        //6. Write a Java program to delete all elements from a Tree Map.
        // map.clear();
        // System.out.println(map);

        //7. Write a Java program to sort keys in a Tree Map by using a comparator.
        // TreeMap<String,String> tree_map1 = new TreeMap<String,String>(new sortKey());
        // tree_map1.put("C2", "Red");
        // tree_map1.put("C4", "Green");
        // tree_map1.put("C3", "Black");
        // tree_map1.put("C1", "White"); 
        // System.out.println(tree_map1); 



        //8. Write a Java program to get a  key-value mapping associated with the greatest key and the least key in a map.
        // System.out.println(map);
        // System.out.println(map.firstEntry());
        // System.out.println(map.lastEntry());


        //9. Write a Java program to get the first (lowest) key and the last (highest) key currently in a map.
        // System.out.println(map);
        // System.out.println(map.firstKey());
        // System.out.println(map.lastKey());
        

        //10. Write a Java program to get a reverse order view of the keys contained in a given map.
        //System.out.println(map.descendingKeySet());

        //11. Write a Java program to get a  key-value mapping associated with the greatest key less than or equal to the given key
        TreeMap < Integer, String > map2 = new TreeMap < Integer, String > ();
        map2.put(10, "Red");
        map2.put(20, "Green");
        map2.put(40, "Black");
        map2.put(50, "White");
        map2.put(60, "Pink");
       // System.out.println(map2.floorEntry(39));


       //12. Write a Java program to get the greatest key less than or equal to the given key.
       //System.out.println(map2.floorKey(21));


       //13. Write a Java program to get the portion of a map whose keys are strictly less than a given key.
      // System.out.println(map2.headMap(21));

      //14. Write a Java program to get the portion of this map whose keys are less than (or equal to, if inclusive is true) a given key.
      // System.out.println(map2.headMap(20, true));


      //15.Write a Java program to get the least key strictly greater than the given key. Return null if there is no such key.
    //   System.out.println(map2.higherKey(20));
    //   System.out.println(map2.higherEntry(40));


    //16. Write a Java program to get a  key-value mapping associated with the greatest key strictly less than the given key. Return null if there is no such key.
    // System.out.println("Key(s): "+ map2.lowerEntry(10));

   //17. Write a Java program to get a NavigableSet view of keys in a map.
    //    System.out.println("Orginal TreeMap content: " + map);
    //    System.out.println("Orginal TreeMap content: " + map.navigableKeySet());


    //18. . Write a Java program to remove and get a  key-value mapping associated with the least key in a map.
    // System.out.println(map2.pollFirstEntry());
    // System.out.println(map2);

    //19.  Write a Java program to remove and get a key-value mapping associated with the greatest key in this map.
    // System.out.println(map2.pollLastEntry());


    //20.Write a Java program to get the portion of a map whose keys range from a given key (inclusive) to another key (exclusive).
    // TreeMap<Integer, String> map3 = new TreeMap<Integer, String>();
    // map3 = (TreeMap<Integer, String>) map2.subMap(10, 40);
    // System.out.println(map3);

    // Map<Integer, String> map3 = map2.subMap(10, 40);
    // System.out.println(map3);
    

    //21. Write a Java program to get the portion of a map whose keys range from a given key to another key.
    //  Map<Integer, String> map3 = map2.subMap(20, true, 40, true);
    //  System.out.println(map3);


    //22. Write a Java program to get a portion of a map whose keys are greater than or equal to a given key.
    //   Map<Integer, String> map3 = map2.tailMap(20);
    //   System.out.println(map3);

    //23.Write a Java program to get a portion of a map whose keys are greater than a given key
    // System.out.println(map2.tailMap(20, false));


        
    //24. Write a Java program to get a  key-value mapping associated with the least key greater than or equal to the given key. Return null if there is no such key.
    // System.out.println("Keys greater than or equal to 20: " + map2.ceilingEntry(20));
    // System.out.println("Keys greater than or equal to 40: " + map2.ceilingEntry(41));
        


    //25. Write a Java program to get the least key greater than or equal to the given key. Returns null if there is no such key.
    System.out.println("Keys greater than or equal to 20: " + map2.ceilingKey(20));
    System.out.println("Keys greater than or equal to 40: " + map2.ceilingKey(41));


    }

}
    class sortKey implements Comparator<String>{
        @Override
        public int compare(String str1, String str2) {
            return str1.compareTo(str2);
        }
    } 