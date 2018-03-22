package LinkedList;

/**
 * @author zenli
 */
public class PalindromeLinkedList_234 {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true; //排除特殊性情况，注意debug
        ListNode slow = head;
        ListNode fast = head;

        //找中点，
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        //判断奇偶性，奇数fast != null，判断回文不需要中点，跳过中点
        if(fast != null){
            slow = slow.next;
        }

        //原地反转后半部分链表
        ListNode prev = null;
        while(slow != null){
            ListNode tmp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = tmp;
        }

        ListNode rHead = prev;
        ListNode lHead = head;

        //比较两个部分链表，此时链表等长
        while(rHead != null){
            if(rHead.val != lHead.val){
                return false;
            }else{
                rHead = rHead.next;
                lHead = lHead.next;
            }
        }
        return true;
    }
}
