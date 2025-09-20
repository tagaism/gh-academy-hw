package LeetCode;

public class LinkedListCycleII {
    public static void main(String[] args) {
        
    }

    //implement Floyd's algorithm
    /**
        * Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.
        * There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer.
        *
        * Use Floyd's Cycle Finding Algorithm:
        * 1. Use two pointers, slow and fast, to detect the cycle. The slow pointer moves one step at a time, and the fast pointer moves two steps at a time.
        * 2. If there is no cycle, the fast pointer will reach the end of the list (null).
        * 3. If there is a cycle, the fast pointer will eventually meet the slow pointer.
        * 4. Reset the slow pointer to the head of the list, and move both pointers one step at a time until they meet again.
        * 5. The meeting point is the node where the cycle begins.
        *
        * @param head The head of the linked list.
        * @return The node where the cycle begins, or null if there is no cycle.
        */
    private static ListNode solution(ListNode head) {
        if(head == null) return null;
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
                break;
            }
        }
        if(fast == null || fast.next == null) {
            return null;
        }
        slow = head;
        while(slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
