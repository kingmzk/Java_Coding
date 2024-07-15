import java.util.*;

class PriorityQueues{
    public static void main(String[] args) {
       PriorityQueue<String> que = new PriorityQueue<String>();
       que.add("red");
       que.add("blue");
       que.add("green");
       que.add("yellow");
       que.add("pink");
       que.add("black");


       //1. Write a Java program to create a priority queue, add some colors (strings) and print out the elements of the priority queue. 
       // System.out.println(que);

       //2. Write a Java program to iterate through all elements in the priority queue.
        //    Iterator<String> iter = que.iterator();
        //    while(iter.hasNext()) {
        //        System.out.println(iter.next());
        //    }



        //3. Write a Java program to add all the elements of a priority queue to another priority queue.
        // PriorityQueue<String> que2 = new PriorityQueue<String>();
        // que2.add("KingMzk");
        // que2.add("Queen");
        // que.addAll(que2);
        // System.out.println(que);

        //4. Write a Java program to insert a given element into a priority queue
        // que.offer("codm");
        // System.out.println(que);

        //5. Write a Java program to remove all elements from a priority queue.
        // que.clear();
        // System.out.println(que);


        //6. Write a Java program to count the number of elements in a priority queue.
        //System.out.println(que.size());

        //7. Write a Java program to compare two priority queues.
        //     PriorityQueue<String> que2 = new PriorityQueue<String>();
        //     PriorityQueue<String> que3 = new PriorityQueue<String>();
        //     que2.add("red");
        //     que2.add("blue");
        //     for(String ans : que)
        //     {
        //     //    que3.add(que2.contains(ans) ? "Yes" : "NO");
        //     System.out.println(ans + ": " + (que2.contains(ans) ? "Yes" : "No"));
        //     }
        //    // System.out.println(que3);


        //8. Write a Java program to retrieve the first element of the priority queue.
        // System.out.println(que.peek());

        //9. Write a Java program to retrieve and remove the first element
        // System.out.println(que.poll());
        // System.out.println(que);

        //10. Write a Java program to convert a priority queue to an array containing all its elements.
        //    List<String> arr = new ArrayList<String>(que);
        //    System.out.println(arr);

        //11. Write a Java program to convert a Priority Queue element to string representations
        // String str = que.toString();
        // System.out.println(str);


        //12.Write a Java program to change priorityQueue to maximum priority queue.
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(10, Collections.reverseOrder());
        pq1.add(10);
        pq1.add(22);
        pq1.add(36);
        pq1.add(25);
        pq1.add(16);
        pq1.add(70);
        pq1.add(82);
        pq1.add(89);
        pq1.add(14);
        System.out.println("\nOriginal Priority Queue: "+pq1);

        Integer value = null;

        while((value = pq1.poll()) != null){ //the polling order is guaranteed to be in descending order due to the reverse 
            System.out.print(value+"  ");
        }


    }
}