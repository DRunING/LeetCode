package LeetCode.LinkedList;

import java.util.HashMap;

/**
 * @author zenli
 */
public class RemoveDuplicatesfromUnsortedList {

    //暴力破解 双重循环
    //复杂度为1/2n2
    public ListNode solution(ListNode head){
        ListNode curr = head;
        while(curr != null){
            ListNode inner = curr;
            while(inner.next != null){
                if(curr.val == inner.next.val){
                    inner.next = inner.next.next;
                }else {
                    inner = inner.next;
                }
            }
        }
        return head;
    }

    //使用hashTable
    public ListNode solutionByHash(ListNode head){
        if(head == null) return null;
        ListNode curr = head;
        HashMap<Integer, Boolean> hashMap = new HashMap<>();
        hashMap.put(curr.val, true);
        while(curr.next != null){
            if(hashMap.get(curr.next.val)){
                curr.next = curr.next.next;
            }else {
                hashMap.put(curr.next.val, true);
                curr = curr.next;
            }
        }
        return head;
    }
}
