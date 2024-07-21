import java.util.*;

class ArrayLists
{
    public static void main(String[] args)
    {

    // Write a Java program to create an array list, add some colors (strings) and print out the collection.
    ArrayList<String> list = new ArrayList<String>();
    list.add("Red");
    list.add("Blue");
    list.add("Green");
    list.add("Yellow");    
    list.add("Pink");
    list.add("Black");
    // for(String ans : list) {
    //     System.out.print(ans+" ");
    // }

    //  Write a Java program to iterate through all elements in an array list.
    //  Iterator itr = list.iterator();
    // while(itr.hasNext()){
    //     System.out.print(itr.next()+" ");
    // }

    // Write a Java program to insert an element into the array list at the first position.
    // list.add(0,"Orange");

    // Write a Java program to retrieve an element (at a specified index) from a given array list.
    //System.out.print(list.get(0));

    // Write a Java program to update an array element by the given element
    // System.out.print(list.set(0,"Purple"));

   // Write a Java program to remove the third element from an array list.
   // System.out.print(list.remove(2));
  

   // Write a Java program to search for an element in an array list.
   // System.out.print(list.contains("Blue"));

   // Write a Java program to sort a given array list.
   // Collections.sort(list);

   // Write a Java program to copy one array list into another.
    // ArrayList<String> list1 = new ArrayList<String>();
    // list1.add("Hello");
    // list1.add("world");
    // list.addAll(list1);


    // Write a Java program to shuffle elements in an array list.
    // Collections.shuffle(list);
    // System.out.print(list);


    // Write a Java program to reverse elements in an array list.
    // Collections.reverse(list);
    // System.out.print(list);


    // Write a Java program to extract a portion of an array list.
    // System.out.print(list.subList(0,3));


    // Write a Java program to compare two array lists.
    // ArrayList<String> list2 = new ArrayList<String>();
    // list2.add("red");
    // list2.add("blue");
    // list2.add("green");
    // System.out.print(list.equals(list2));


    // Write a Java program that swaps two elements in an array list.
    //  Collections.swap(list,0,3);
    //  System.out.print(list);

   //  Write a Java program to join two array lists.
     ArrayList<String> list3 = new ArrayList<String>();
     list3.add("Hello");
     list3.add("world");
     list.addAll(list3);
     System.out.print(list);


    // Write a Java program to clone an array list to another array list.
    // ArrayList<String> list4 = (ArrayList<String>) list.clone();
    // System.out.print(list4);  //OR
    // ArrayList<String> list4 = new ArrayList<>(list);
    // System.out.print(list4);


    //  Write a Java program to empty an array list.
    //  list.clear();

    // Write a Java program to test whether an array list is empty or not.
    // System.out.println(list.isEmpty());
    
    // Write a Java program for trimming the capacity of an array list.
    // ArrayList<String> list6 = new ArrayList<>(10); // Initial capacity is 10
    // list6.add("Red");
    // list6.add("Blue");
    // list6.trimToSize();  //Basically reduces the capacity to the current size
    // System.out.print(list6);


    // Write a Java program to increase an array list size.
    // ArrayList<String> list7 = new ArrayList<>(3);
    // list7.add("india");
    // list7.add("pakistan");
    // list7.add("bharat");
    // System.out.println("Size before increasing capacity: " + list7.size());
    // list7.ensureCapacity(8);
    // list7.add("china");
    // list7.add("australia");
    // System.out.println("Size after increasing capacity: " + list7.size());

    }
}









/*
       //List<String> list = Arrays.asList(new String[] {"aaple","ball","cat","dog"});
    //    Iterator iterator = list.iterator();
    //    while(iterator.hasNext())
    //    {
    //       System.out.print(iterator.next() + " ");
    //    }
 */