package LeetCode.LinkedList;

/**
 * @author zenli
 */
public class SortLIst_148 {
    //使用归并排序
    public ListNode sortList(ListNode head){
        if(head == null || head.next == null) return null;
        ListNode mid = findMid(head);
        ListNode head1 = head;
        ListNode head2 = mid.next;
        mid.next = null;
        ListNode left = sortList(head1);
        ListNode right = sortList(head2);
        return merge(left, right);
    }

    //find middle
    public ListNode findMid(ListNode head){
        if(head == null || head.next == null) return null;
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast !=  null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    //merge
    public ListNode merge(ListNode head1, ListNode head2){
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        while(head1 != null || head2 != null){
            int a = head1 == null? Integer.MAX_VALUE : head1.val;
            int b = head2 == null? Integer.MAX_VALUE : head2.val;
            if(a < b){
                head.next = new ListNode(a);
                if(head1 != null) head1 = head1.next;
            }else {
                head.next = new ListNode(b);
                if(head2 != null) head2 = head2.next;
            }
            head = head.next;
        }
        return dummy.next;
    }

}
