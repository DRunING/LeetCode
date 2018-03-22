package offer;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author zenli
 *
 *倒序打印链表， 一般考虑不改变链表结构
 */
public class Offer6_ReversePrintNode {
    public void solution(){

    }

    //使用栈
    public List<ListNode>  print(ListNode head){
        List<ListNode> listNodes = new ArrayList<>();
        if(null == head) return null;
        Stack<ListNode> stack = new Stack<>();
        while(null != head){
            stack.push(head);
            head = head.next;
        }
        while(!stack.isEmpty()){
            listNodes.add(stack.pop());
        }
        return listNodes;
    }

    //使用递归方式
    //todo 使用递归方式实现，可能会造成内存溢出，没有使用栈的鲁棒性佳
}
class ListNode{
    int var;
    ListNode next;
}