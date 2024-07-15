
import java.util.*;

public class TreeSets {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<String>();
        set.add("khan");
        set.add("anuj");
        set.add("rahul");
        set.add("ankita");
        set.add("adnan");
      //  set.add("");

        //1. Write a Java program to create a tree set, add strings and print out the tree set.
        // System.out.println(set);

        //2. Write a Java program to iterate through all elements in a tree set.
        // Iterator itr = set.iterator();
        // while(itr.hasNext()){
        //     System.out.println(itr.next());
        // }

        //3. Write a Java program to add all the elements of a specified tree set to another tree set.
        // TreeSet<String> set1 = new TreeSet<String>();
        // set1.add("kingMZK");
        // set1.add("queen");
        // set.addAll(set1);
        // System.out.println(set);

        //4. Write a Java program to create a reverse order view of the elements contained in a given tree set.
        // Iterator it = set.descendingIterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }

        //5. Write a Java program to get the first and last elements in a tree set
        // System.out.println(set.first());
        // System.out.println(set.last());

        //6. Write a Java program to clone a tree set list to another tree set.
        // TreeSet<String> set2 = new TreeSet<String>();
        // set2 = (TreeSet) set.clone();
        // System.out.println(set2);

        //7. Write a Java program to get the number of elements in a tree set.
        // System.out.println(set.size());

        //8. Write a Java program to compare two tree sets.
        // TreeSet<String> set2 = new TreeSet<String>();
        // set2.add("anuj");
        // set2.add("hi");

        // TreeSet<String> set3 = new TreeSet<String>();
        // for(String ans : set){
        //    set3.add(set2.contains(ans) ? "Yes" : "No");
        // }
        // System.out.println(set3);


       //9. Write a Java program to find numbers less than 7 in a tree set.
    //    TreeSet<Integer> set2 = new TreeSet<Integer>();
    //    set2.add(1);set2.add(2);set2.add(3); set2.add(4);set2.add(5);set2.add(6);set2.add(7); set2.add(8);set2.add(9);set2.add(10);
    //    TreeSet<Integer> set3 = new TreeSet<Integer>();
    //    //set3 = (TreeSet) set2.headSet(7);
    //    set3 = (TreeSet) set2.headSet(7,true);
    //    System.out.println(set3);

     

    //10. Write a Java program to get the element in a tree set which is greater than or equal to the given element.
        // TreeSet<Integer> set2 = new TreeSet<Integer>();
        // set2.add(10);set2.add(20);set2.add(30); set2.add(40);set2.add(50);
        // TreeSet<Integer> set3 = new TreeSet<Integer>();
        // System.out.println(set2.ceiling(27)); 

    //11. Write a Java program to get the element in a tree set less than or equal to the given element.
    //  TreeSet<Integer> set2 = new TreeSet<Integer>();
    //    set2.add(10);set2.add(20);set2.add(30); set2.add(40);set2.add(50);
    //    TreeSet<Integer> set3 = new TreeSet<Integer>();
    //    System.out.println(set2.floor(14)); 


    //12. Write a Java program to get the element in a tree set strictly greater than or equal to the given element.
    //    TreeSet<Integer> set2 = new TreeSet<Integer>();
    //    set2.add(10);set2.add(20);set2.add(30); set2.add(40);set2.add(50);
    //    TreeSet<Integer> set3 = new TreeSet<Integer>();
    //    System.out.println(set2.higher(14)); 
    //    System.out.println(set2.ceiling(14)); 
    // //13.   System.out.println(set2.lower(14)); 
    //    System.out.println(set2.floor(14)); 


    //14. Write a Java program to retrieve and remove the first element of a tree set
    // System.out.println(set.pollFirst());
    // System.out.println(set);

    //15. Write a Java program to retrieve and remove the last element of a tree set.
    // System.out.println(set.pollLast());
    // System.out.println(set);


    //16.Write a Java program to remove a given element from a tree set.
    // set.remove("anuj");
    // System.out.println(set);





      


    }
}
