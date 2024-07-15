
import java.util.*;

public class HashMaps {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("khan", "khans");
        map.put("anuj", "anujs");
        map.put("rahul", "rahuls");
        map.put("ankita", "ankitas");
        map.put("adnan", "adnans");

        //1. Write a Java program to associate the specified value with the specified key in a HashMap.
        // System.out.println(map);
        //   for(Map.Entry<String,String> ans: map.entrySet()){
        //     System.out.println(ans.getKey()+" "+ ans.getValue());
        // }


        //2. Write a Java program to count the number of key-value (size) mappings in a map.
        // System.out.println(map.size());

        //3. Write a Java program to copy all mappings from the specified map to another map.
        //  HashMap<String, String> map1 = new HashMap<String, String>();
        //  map1.put("key1", "value1");
        //  map1.put("key2", "value2");
        //  map.putAll(map1);
        //  System.out.println(map);

        //4. Write a Java program to remove all mappings from a map.
         //    map.clear();
         //    System.out.println(map);


         //5. Write a Java program to check whether a map contains key-value mappings (empty) or no
        // map.isEmpty();


        //6. Write a Java program to get a shallow copy of a HashMap instance.clone
        // HashMap<String, String> map2 = new HashMap<String, String>();
        // map2 = (HashMap) map.clone();
        // System.out.println(map2);



        //7. Write a Java program to test if a map contains a mapping for the specified key.
        // System.out.println(map.containsKey("khan"));



        //8. Write a Java program to test if a map contains a mapping for the specified value.
        // System.out.println(map.containsValue("khans"));


        //9. Write a Java program to create a set view of the mappings contained in a map.
        // Set set = map.entrySet();
        // System.out.println(set);


       // 10. Write a Java program to get the value of a specified key in a map.
        // System.out.println(map.get("khan"));


        //11. Write a Java program to get a set view of the keys contained in this map.
        // Set set = map.keySet();
        // System.out.println(set);


        //12. Write a Java program to get a collection view of the values contained in this map.
        System.out.println(map.values());
        System.out.println(map.keySet());



    }
}
