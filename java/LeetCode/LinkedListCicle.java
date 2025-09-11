package LeetCode;

import LinkedList.LinkedList;

/**
 * This class provides a solution to detect a cycle in a linked list.
 * The `solution` method uses the fast and slow pointer approach (Floyd's Cycle-Finding Algorithm)
 * to determine if a cycle exists in the given linked list.
 */
public class LinkedListCicle {
    public static void main(String[] args) {

    }
    static boolean solution(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast) {
                return true;
            }
        }
        return false;
    }
}
