package LinkedList;

// Define the ListNode class
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}

// Define the Solution class with the addTwoNumbers method
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode(0);
        int carry = 0;
        ListNode head = temp;

        while (l1 != null || l2 != null) {
            if (l1 != null) {
                carry += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                carry += l2.val;
                l2 = l2.next;
            }
            temp.next = new ListNode(carry % 10);
            temp = temp.next;
            carry = carry / 10;
        }
        if (carry == 1) {
            temp.next = new ListNode(1);
        }
        return head.next;
    }
}

public class Add_Two_Numbers_2 {
    public static void main(String[] args) {
        // Create instances of ListNode for testing
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        // Create an instance of Solution
        Solution solution = new Solution();

        // Call the addTwoNumbers method
        ListNode result = solution.addTwoNumbers(l1, l2);

        // Print the result
        printList(result);
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
