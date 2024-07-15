import java.util.*;

public class LinkedLists {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<String>();
        list.add("Khan");
        list.add("anuj");
        list.add("rahul");
        list.add("ankita");
       

    //    Write a Java program to append the specified element to the end of a linked list.
    //    list.addLast("adnan");
    //    System.out.println("The linked list: " + list);


    // Write a Java program to iterate through all elements in a linked list.
    //    for(String ans : list) {
    //        System.out.print(ans + " ");
    //    }

 //   Write a Java program to iterate through all elements in a linked list starting at the specified position.
    // Iterator iter = list.listIterator(1);
    // while(iter.hasNext()) {
    //     System.out.print(iter.next() + " ");
    // }


    //Write a Java program to iterate a linked list in reverse order
    // Iterator iter = list.descendingIterator();
    // while(iter.hasNext()) {
    //     System.out.print(iter.next() + " ");
    // }


    // Write a Java program to insert the specified element at the specified position in the linked list.
    //list.add(4,"burhan");
   

    //Write a Java program to insert elements into the linked list at the first and last positions.
    // list.addFirst("ayaan");
    // list.addLast("Neha");
    // System.out.println("The linked list: " + list);


    // Write a Java program to insert the specified element at the front of a linked list.
        // System.out.println(list.offerFirst("first"));
        // System.out.println("The linked list: " + list);


    // Write a Java program to insert the specified element at the end of a linked list.
        // System.out.println(list.offerLast("last"));
        // System.out.println("The linked list: " + list);


    //Write a Java program to insert some elements at the specified position into a linked list.
    // LinkedList<String> list1 = new LinkedList<String>();
    // list1.add("King");
    // list1.add("mzk");
    // list.addAll(1, list1);
    // System.out.println("The linked list: " + list);


    //Write a Java program to get the first and last occurrence of the specified elements in a linked list.
    // System.out.print(list.getFirst());
    // System.out.print(list.getLast());


    //  Write a Java program to remove a specified element from a linked list.  
    // System.out.println(list.remove(1));

    //Write a Java program to remove the first and last elements from a linked list.
    // list.removeFirst();
    // list.removeLast();
    // System.out.println("The linked list: " + list);


    //14. Write a Java program to remove all elements from a linked list.
    // list.clear();
    // System.out.println("The linked list: " + list);


    // 15. Write a Java program that swaps two elements in a linked list.
    // Collections.swap(list,0,3);
    // System.out.println("The linked list: " + list);


    // 16. Write a Java program to shuffle elements in a linked list.
    // Collections.shuffle(list);
    // System.out.println("The linked list: " + list);

    //17  Write a Java program to join two linked lists.
    // LinkedList<String> list2 = new LinkedList<String>();
    // list2.add("khan");
    // list2.add("anuj");
    // list.addAll(list2);
    // System.out.println("The linked list: " + list);

   // 18. Write a Java program to copy a linked list to another linked list
   //    LinkedList list3 = new LinkedList<String>();
   //    list3 = (LinkedList)list.clone();
   //    System.out.println("The linked list: " + list3);


     //19 Write a Java program to remove and return the first element of a linked list.
    // System.out.println(list.pop());

     //20. Write a Java program to retrieve, but not remove, the first element of a linked list.
    //  System.out.println(list.peek());


    //21.Write a Java program to retrieve, but not remove, the last element of a linked list.
    // System.out.println(list.peekLast());

    //22 . Write a Java program to check if a particular element exists in a linked list.
    // System.out.println(list.contains("rahul"));


    //23. Write a Java program to convert a linked list to an array list.
    // ArrayList<String> list1 = new ArrayList<String>(list);
    // System.out.println("The array list: " + list1);

    //24. Write a Java program to compare two linked lists.
    // LinkedList<String> list1 = new LinkedList<String>();
    // list1.add("Khan");
    // list1.add("ankita");
    // LinkedList<String> list2 = new LinkedList<String>();
    // for(String l : list){
    //     list2.add(list1.contains(l) ? "yes" : "no" );
    //     System.out.println(list2);
    // }

    //25. Write a Java program to check if a linked list is empty or not.
    // System.out.println(list.isEmpty());

    //26.Write a Java program to replace an element in a linked list.
    list.set(1,"Anuj the Guggu");
    System.out.println(list);

    }
}
