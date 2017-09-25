package LinkedList;

/**
 * Created by Druning on 2017/9/21.
 */

public class LinkedNode {
    int val;
    LinkedNode next;
    LinkedNode(int val){
        this.val = val;
        this.next = null;
    }

     static int getLength(LinkedNode head){
        int length = 0;
        while(head != null){
            length++;
            head =head.next;
        }
        return length;
    }
}
