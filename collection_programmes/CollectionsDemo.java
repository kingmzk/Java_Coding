import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(3, 5, 1, 4, 2));
        
        // Sorting
        Collections.sort(list);
        System.out.println("Sorted list: " + list);
        
        // Shuffling
        Collections.shuffle(list);
        System.out.println("Shuffled list: " + list);
        
        // Reverse
        Collections.reverse(list);
        System.out.println("Reversed list: " + list);
        
        // Rotate
        Collections.rotate(list, 2);
        System.out.println("Rotated list: " + list);
        
        // Swap
        Collections.swap(list, 0, 1);
        System.out.println("List after swap: " + list);
        
        // Frequency
        int freq = Collections.frequency(list, 2);
        System.out.println("Frequency of 2: " + freq);
        
        // Min and Max
        int min = Collections.min(list);
        int max = Collections.max(list);
        System.out.println("Min: " + min + ", Max: " + max);
        
        // Unmodifiable List
        List<Integer> unmodifiableList = Collections.unmodifiableList(list);
        System.out.println("Unmodifiable list: " + unmodifiableList);
        
        // Checked List
        List<String> stringList = new ArrayList<>();
        List<String> checkedList = Collections.checkedList(stringList, String.class);
        checkedList.add("Hello");
        checkedList.add("World");
        System.out.println("Checked list: " + checkedList);
    }
}
