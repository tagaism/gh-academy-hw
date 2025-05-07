package LeetCode;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        ListNode ln1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode ln2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode res = solution(ln1, ln2);
        while(res != null) {
            System.out.println(res.val);
            res = res.next;
        }
    }

    private static ListNode solution (ListNode list1, ListNode list2) {
        ListNode res = new ListNode(0);
        ListNode curr = res;
        
        while(list1 != null && list2 != null) {
            if(list1.val < list2.val) {
                curr.next = list1;
                list1 = list1.next;
            } else {
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }

        if(list1 != null) {
            curr.next = list1;
        }
        if(list2 != null) {
            curr.next = list2;
        }
        return res.next;


    }
}
