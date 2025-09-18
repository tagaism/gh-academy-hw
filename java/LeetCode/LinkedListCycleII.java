package LeetCode;

public class LinkedListCycleII {
    public static void main(String[] args) {
        
    }
    private static ListNode solution(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                break;
            }
        }
        if(fast == null || fast.next == null) {
            //there is no cycle;
            return null;
        }
        slow = head;
        while(slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }
    //implement Floyd's algorithm
}
