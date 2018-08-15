package LeetCode.Stack;

import org.junit.Test;

import java.util.Stack;

/**
 * @author zenli
 *
 * 判断压入弹出队列是否合法(用一个辅助栈进行判断)
 */
public class PreOrder {
    public boolean isPreOrder(int[] pushA, int[] popA){
        Stack<Integer> stack = new Stack<Integer>();
        for(int i = 0, j = 0; i < pushA.length; i++){
            stack.push(pushA[i]);
            while((!stack.isEmpty()) && stack.peek() == popA[j]){
                stack.pop();
                j++;
            }
        }
        return stack.isEmpty();
    }

    @Test
    public void test(){
        int[] preOder = new int[]{1,2,3,4,5};
        int[] popOrder = new int[]{3, 2, 4, 5, 1};
        System.out.println(isPreOrder(preOder, popOrder));
    }
}
