package LinkedList;

/**
 * @author zenli
 */
public class ReorderList_143 {
    public ListNode reorderList(ListNode head){
        if(head == null || head.next == null) return null;


        //find middle 找中点, 使用快慢指针
        ListNode slow = head, fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode rHead = slow.next;
        slow.next = null;

        //reverse linkedList
        ListNode prev = null;
        while(rHead != null){
            ListNode tmp = rHead.next;
            rHead.next = prev;
            prev = rHead;
            rHead = tmp;
        }

        //merge two list
        rHead = prev;
        ListNode lHead = head;
        while(rHead != null && lHead != null){
            ListNode tmp1 = lHead.next;
            lHead.next = rHead;
            rHead = rHead.next;
            lHead.next.next = tmp1;
            lHead = tmp1;
        }
        return head;
    }
}
