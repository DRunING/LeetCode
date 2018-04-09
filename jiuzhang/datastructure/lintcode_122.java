package jiuzhang.datastructure;

import org.junit.Test;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author zenli
 *
 * O(n)
 * 数组复制函数的使用
 */
public class lintcode_122 {
    public int largestRectangleArea2(int[] height) {
        Stack<Integer> stack = new Stack<Integer>();
        int i = 0;
        int maxArea = 0;
        //创建的新数组末尾添加0，
        int[] h = new int[height.length + 1];
        h = Arrays.copyOf(height, height.length + 1);
        while(i < h.length){
            if(stack.isEmpty() || h[stack.peek()] <= h[i]){
                stack.push(i++);
            }else {
                int t = stack.pop();
                maxArea = Math.max(maxArea, h[t] * (stack.isEmpty() ? i : i - stack.peek() - 1));
            }
        }
        return maxArea;
    }

    public int exam(int[] height){
        int maxArea = 0;
        Stack<Integer> stack = new Stack<Integer>();
        int[] h = new int[height.length + 1];
        h = Arrays.copyOf(height, height.length + 1);
        for(int i = 0; i < h.length;){
            if(stack.isEmpty() || h[stack.peek()] <= h[i]){
                stack.push(i++);
            }else {
                //t是当前弹出的元素的索引值
                int t = stack.pop();
                maxArea = Math.max(maxArea, h[t] * (stack.isEmpty()? i : i - stack.peek() -1));
                System.out.println(i + " 和   "  +   (stack.isEmpty()? "null" : stack.peek() )+ "  "   + maxArea);
            }
        }
        return maxArea;
    }

    @Test
    public void test(){
        exam(new int[]{3, 2,1,5,6,2,3, 1, 1, 1, 1,1, 1});
    }
}
