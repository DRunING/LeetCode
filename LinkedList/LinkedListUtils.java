package LinkedList;

import org.junit.Test;

/**
 * @author zenli
 */
public class GenerateLinkedList {
    public static ListNode generate(int[] nums){
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for(int i : nums){
            ListNode node = new ListNode(i);
            curr.next = node;
            curr = curr.next;
        }
        return dummy.next;
    }
    @Test
    public void test(){
        ListNode result =  generate(new int[]{1, 7, 2, 4, 0});
        ListNode curr = result;
        while(curr != null){
            System.out.println(curr.val);
            curr = curr.next;
        }
    }
    public static void PrintLinkedList(ListNode head){
        ListNode curr = head;
        while(curr != null){
            System.out.println(curr.val);
            curr = curr.next;
        }
    }
}
