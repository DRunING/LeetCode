package LeetCode.LinkedList;

/**
 * @author zenli
 */


//删除有序链表节点
public class RemoveDuplicatesfromSortedList_83 {
    public ListNode solution(ListNode head){
        ListNode curr = head;
        while(curr != null){
            while (curr.next != null && curr.next.val == curr.val){
                curr.next = curr.next.next;
            }
            curr = curr.next;
        }
        return head;
    }
}
