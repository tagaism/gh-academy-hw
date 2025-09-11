package LeetCode;

import LinkedList.LinkedList;

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
