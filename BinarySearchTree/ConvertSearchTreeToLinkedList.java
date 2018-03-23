package BinarySearchTree;

import java.util.Stack;

/**
 * @author zenli
 */

public class ConvertSearchTreeToLinkedList {
    //非递归中序遍历一个二叉树
    public TreeNode convert(TreeNode pRootOfTree){
        if(pRootOfTree == null) return null;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = pRootOfTree;
        stack.push(curr);
        while(curr != null || !stack.isEmpty()){
            while(curr != null){
                stack.push(curr);
                curr = curr.left;
            }
            //弹出curr
            curr = stack.pop();

            curr = curr.right;
        }


        return null;
    }
}
