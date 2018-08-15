package LeetCode.LinkedList;

import org.junit.Test;

/**
 * @author zenli
 */
public class LinkedListUtils {
     static ListNode generate(int[] nums){
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for(int i : nums){
            curr.next = new ListNode(i);
            curr = curr.next;
        }
        return dummy.next;
    }

    static void printLinkedList(ListNode head){
        ListNode curr = head;
        while(curr != null){
            System.out.println(curr.val);
            curr = curr.next;
        }
    }
}
