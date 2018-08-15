package LeetCode.LinkedList;

/**
 * @author zenli
 */
public class AddTwoNumbers_2 {
    public ListNode solution(ListNode l1,  ListNode l2){
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int carry = 0;


        //注意迭代条件 carry不为0时 说明有进位， 还需要迭代
        while((l1 != null || l2 != null || carry != 0)){
            int l1Val = (l1 != null)? l1.val:0;
            int l2Val = (l2 != null)? l2.val:0;
            int sum = l1Val + l2Val + carry;
            //update carry
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);

            curr = curr.next;
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }
        return dummy.next;
    }
}
