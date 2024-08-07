package LinkedList;

// Define the ListNode class
class ListNodes {
    int val;
    ListNode next;
    ListNodes(int x) {
        val = x;
    }
}

// Define the Solution class with the reverseList method
class Solutions {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;

        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}

public class Reverse_Linked_List_206 {
    public static void main(String[] args) {
        // Create an instance of ListNode for testing reverseList
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Create an instance of Solution
        Solutions solution = new Solutions();

        // Call the reverseList method
        ListNode reversed = solution.reverseList(head);

        // Print the result of reverseList
        System.out.print("Reversed list: ");
        printList(reversed);
    }

    // Helper method to print the linked list
    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val);
            node = node.next;
            if (node != null) {
                System.out.print(" -> ");
            }
        }
        System.out.println();
    }
}
