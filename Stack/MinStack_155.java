package Stack;

import LinkedList.LinkedNode;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;
import org.w3c.dom.ls.LSException;

import java.util.ArrayList;

/**
 * Created by Druning on 2017/9/24.
 */
public class MinStack_155 {
    public static void main(String[] args){
        MinStack_155 obj = new MinStack_155();
        obj.push(-3);
        obj.push(0);
        obj.push(-2);
        System.out.println(obj.getMin());
        obj.pop();
        System.out.println(obj.top());
    }

// 以下用单链表实现栈
//内部类表示Stack的节点Node
    private class Node{
        int val;
        Node next;
//用一个整数记录当前栈的最小值，压栈时通过去的最小值进行判断
        int min;

        private Node(int val, int min){
            this(val, min, null);
        }
        private Node(int val, int min, Node next){
            this.val = val;
            this.min = min;
            this.next = next;
        }
    }
//指针，指向栈顶节点(内部用链表实现):从栈顶元素到栈底元素的单链表
    private Node innerHead;

//压栈 分为第一个节点和第n个节点
    public void push(int x){
        if(innerHead == null){
            innerHead = new Node(x, x);
        }
        else{
            innerHead = new Node(x, Math.min(x, innerHead.min), innerHead);
        }
    }

    public void pop(){
        innerHead = innerHead.next;
    }

    public int top(){
        return innerHead.val;
    }

    public int getMin(){
        return innerHead.min;
    }
}
