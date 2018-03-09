package LinkedList;

/**
 * @author zenli
 */

//使用dummy节点进行处理（因为头节点可能会变）
public class RemoveDuplicatesfromSortedListII_ {
    public ListNode solution(ListNode head){
        if(head == null) return null;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy;
        while(curr.next != null && curr.next.next != null){
            if(curr.next.val == curr.next.next.val){
                int val_prev = curr.next.val;
                while(curr.next != null && curr.next.val == val_prev){
                    curr.next = curr.next.next;
                }
            }else {
                curr = curr.next;
            }
        }
        return dummy.next;
    }
}
