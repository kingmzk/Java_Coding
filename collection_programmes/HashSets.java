import java.util.*;

class HashSets{
    public static void main(String[] args) {
       HashSet<String> set = new HashSet<String>();
       set.add("khan");
       set.add("anuj");
       set.add("rahul");
       set.add("ankita");
       set.add("adnan");
       set.add("");


       
    //    System.out.println("The hash set: " + set);


    // 1. Write a Java program to append the specified element to the end of a hash set.
    //    set.add("adnan");
    //    System.out.println("The hash set: " + set);


    // 2. Write a Java program to iterate through all elements in a hash list.
    // Iterator<String> itr  = set.iterator();
    // while(itr.hasNext()) {
    //     System.out.print(itr.next() + " ");
    // }


    //3. Write a Java program to get the number of elements in a hash set.
    //System.out.println(set.size());

    //4. Write a Java program to empty an hash set.
    // set.clear();
    // System.out.println(set);


    //5. Write a Java program to test if a hash set is empty or not.
    // System.out.println(set.isEmpty());

    // 6. Write a Java program to clone a hash set to another hash set.
    // HashSet<String> set1 = new HashSet<String>();
    // set1 = (HashSet) set.clone();
    // System.out.println(set1);


    //7. Write a Java program to convert a hash set to an array.
    // String[] arr = new String[set.size()];
    // set.toArray(arr);
    // System.out.println(Arrays.toString(arr));
    // for(String a : arr){
    //     System.out.println(a);
    // }

    //8.  Write a Java program to convert a hash set to a tree set.
    // Set<String> sets = new TreeSet<String>(set);
    // System.out.println(sets);

    //9.Write a Java program to convert a hash set to a List/ArrayList
    // List<String> list = new ArrayList<String>(set);
    // System.out.println(list);


    //10. Write a Java program to compare two hash set.
    // HashSet<String> set2 = new HashSet<String>();
    // set2.add("anuj");
    // set2.add("hi");

    // HashSet<String> set3 = new HashSet<String>();

    // for(String ans : set){
    //     System.out.println(set3.add(set2.contains(ans) ? "Yes" : "No"));
    // }


    //11. Write a Java program to compare two sets and retain elements that are the same.
    HashSet<String> set2 = new HashSet<String>();
    set2.add("anuj");
    set2.add("hi");
    set.retainAll(set2);
    System.out.println(set);


    //12. Write a Java program to remove all elements from a hash set.
    // set.clear();
    // System.out.println(set);





  }
}