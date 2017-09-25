package LinkedList;

import java.util.Stack;

/**
 * Created by Druning on 2017/9/21.
 */
public class RemoveNthNodeFromEndofList {
    public static void main(String[] args){
        LinkedNode n1 = new LinkedNode(1);
        LinkedNode n2 = new LinkedNode(4);
        LinkedNode n3 = new LinkedNode(3);
        n1.next = n2;
        n2.next = n3;
        LinkedNode result = sulotion(n1, 2);
        System.out.println("the answer is..");
        System.out.println(result.val);

    }
    static LinkedNode sulotion(LinkedNode head, int n){
        int length = LinkedNode.getLength(head);
        System.out.println(length);
//        Stack<LinkedNode> s= new Stack<>();
//        LinkedNode tmp = head;
//        while(tmp != null){
//            s.add(tmp);
//            tmp = tmp.next;
//        }
//
//        LinkedNode tmp1 = null;
//        for(int i = 1; i <= n ; i++){
//            tmp1 = s.pop();
//        }
//        s.pop();
//        s.pop().next = tmp1;

        return head;
    }
}
