package LinkedList;

import org.junit.Test;

/**
 * @author zenli
 */
public class PartitionList_86 {
    public static ListNode solution(ListNode head, int x){
        ListNode leftDummy = new ListNode(0);
        ListNode rightDummy = new ListNode(0);
        ListNode leftCurr = leftDummy;
        ListNode rightCurr = rightDummy;
        ListNode curr = head;
        while(curr != null){
            if(curr.val >= x){
                rightCurr.next = curr;
                rightCurr = rightCurr.next;
            }else {
                leftCurr.next =curr;
                leftCurr = leftCurr.next;
            }
            curr = curr.next;
        }
        //初始化尾节点
        rightCurr.next = null;
        leftCurr.next = rightDummy.next;
        return leftDummy.next;
    }


    @Test
    public void test(){
        ListNode head =  LinkedListUtils.generate(new int[]{1, 3, 2, 3, 6, 7});
//        LinkedListUtils.printLinkedList(head);
        ListNode result =  solution(head, 3);
        LinkedListUtils.printLinkedList(result);
    }
}
