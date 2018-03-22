package LinkedList;

import org.junit.Test;

/**
 * @author zenli
 */
public class ReverseLinkedlist_206 {
    public ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode tmp = curr.next;
            curr.next = prev;
            prev = curr;

            //最后curr和tmp指向的是null，所以返回prev指向的节点
            curr = tmp;
        }
        head = prev;
        return head;
    }

    public ListNode examReverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode tmp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tmp;
        }
        head = prev;
        return head;
    }
}
