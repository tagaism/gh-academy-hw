package LeetCode;

public class MergeTwoSortedList {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);
        ListNode test = solution(list1, list2);
        while(test != null) {
            System.out.println(test.val);
            test = test.next;
        }
    }

    private static ListNode solution(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode cur = res;
        while(l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                cur = l1;
                l1 = l1.next;
            } else {
                cur = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        return res.next;
    }
}
