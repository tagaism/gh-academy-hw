package LeetCode;

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode ln = new ListNode(1);
        ln.next = new ListNode(2);
        ln.next.next = new ListNode(3);
        ln.next.next.next = new ListNode(4);
        ln.next.next.next.next = new ListNode(5);

        ListNode cur = ln;
        while(cur != null) {
            System.out.println(cur.val);
            cur = cur.next;
        }
        cur = reverseLL(ln);
        while(cur != null) {
            System.out.println(cur.val);
            cur = cur.next;
        }
    }

    private static ListNode reverseLL(ListNode head) {
        // p 5->4->3->2->1->null
        // c null
        // n null
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
