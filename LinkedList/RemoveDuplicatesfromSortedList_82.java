package LeetCode.LinkedList;

/**
 * @author zenli
 */

//使用dummy节点进行处理（因为头节点可能）
public class RemoveDuplicatesfromSortedList_82 {
    public ListNode solution(ListNode head){
        if(head == null) return null;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy;

        //比较curr.next节点和curr.next.next节点，所以循环条件是curr.next.next以及curr.next
        while(curr.next != null && curr.next.next != null){
            if(curr.next.val == curr.next.next.val){
                //保存前一个节点的值
                int val_prev = curr.next.val;
                //迭代删除curr.next
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
