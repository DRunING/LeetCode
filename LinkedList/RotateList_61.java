package LeetCode.LinkedList;


/**
 * 旋转链表， 会改变链表结构
 */
public class RotateList_61 {
    private static LinkedNode solution(LinkedNode head, int k){

//step 1        空链表或者单结点链表直接返回头结点
        if(head  == null || head.next == null){
            return head;
        }
//step 3  生成dummy节点
        LinkedNode dummy = new LinkedNode(0);
        dummy.next = head;
        LinkedNode fast = dummy, slow = dummy;

//        int length = 0;
//step 4  求链表长度（fast指针指向尾节点）
        int i;
        for(i = 0; fast.next != null; i++){
            fast = fast.next;
        }

//step 5 slow指针指向尾节点（考虑到k可能会大于链表长度）
        for(int j = i - k%i; j > 0; j--){
            slow = slow.next;
        }

//step 6 旋转链表
        fast.next = dummy.next;
        dummy.next = slow.next;
        slow.next = null;
        return dummy.next;
    }

    public static void main(String[] args){
        LinkedNode a = new LinkedNode(1);
        LinkedNode b = new LinkedNode(2);
        LinkedNode c = new LinkedNode(3);
        LinkedNode d = new LinkedNode(4);
        a.next =b;
        b.next = c;
        c.next = d;
        LinkedNode head = solution(a, 2);
        for(int i = 0; head!= null; i++){
            System.out.println(head.val);
            head = head.next;
        }
    }
}
