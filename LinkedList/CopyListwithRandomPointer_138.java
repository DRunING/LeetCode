package LeetCode.LinkedList;

import java.util.HashMap;

/**
 * @author zenli
 */
public class CopyListwithRandomPointer_138 {

    //两次循环复杂度为o(2n)
    public RandomListNode copyRandomList(RandomListNode head) {
        if(head == null) return null;
        RandomListNode dummy = new RandomListNode(0);
        RandomListNode curNode = dummy;
        HashMap<RandomListNode, RandomListNode> randomMap = new HashMap<>();
        while(head != null){
            //link new node to new list
            RandomListNode newNode = new RandomListNode(head.label);
            curNode.next = newNode;
            //map old and new node
            randomMap.put(head, newNode);
            newNode.random = head.random;
            head = head.next;
            curNode = curNode.next;
        }
        curNode = dummy.next;
        while(curNode != null){
            if(curNode.random != null){
                curNode.random = randomMap.get(curNode.random);
            }
            curNode = curNode.next;
        }
        return dummy.next;
    }

}
class  RandomListNode{
    int label;
    RandomListNode next, random;
    RandomListNode(int x) { this.label = x; }
}
