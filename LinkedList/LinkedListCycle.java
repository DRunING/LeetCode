package LeetCode.LinkedList;

/**
 * @author zenli
 */
public class LinkedListCycle {
    public ListNode solution(ListNode head){
        if(head == null || head.next == null) return null;
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast){
                fast = head;
                while(fast != slow){
                    fast = fast.next;
                    slow = slow.next;
                }
                return fast;
            }
        }
        return null;
    }
}
