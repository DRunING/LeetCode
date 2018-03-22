package LinkedList;

import org.junit.Test;

import java.util.Stack;

/**
 * Created by Druning on 2017/9/21.
 */

//经典题，使用快慢指针，当慢指针比快指针迟走n步
public class RemoveNthNodeFromEndofList_19 {
    static ListNode solution(ListNode head, int n){
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;

        //快指针先走n步
        for(int i = 0;i < n ; i++){
            fast = fast.next;
        }

        //当fast的下一个节点是null, 即fast指向最后一个节点时，停止循环
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }

        //删除slow.next节点
        slow.next = slow.next.next;
        return dummy.next;
    }

    @Test
    public void test(){
        ListNode l = LinkedListUtils.generate(new int[]{1, 8, 3, 2});
        ListNode result =  solution(l, 1);
        LinkedListUtils.printLinkedList(result);
    }
}