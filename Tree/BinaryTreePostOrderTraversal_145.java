package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author zenli
 */
public class BinaryTreePostOrderTraversal_145 {

    private List<Integer> result = new ArrayList<>();
    //使用递归-遍历
    public List<Integer> solutionByRecur(TreeNode root){
        if(root != null){
            solutionByRecur(root.left);
            solutionByRecur(root.right);
            result.add(root.val);
        }
        return result;
    }

    //使用迭代
    public List<Integer> solution(TreeNode root){
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if(root != null) stack.push(root);

        TreeNode prev = null;

        //迭代使用标记进行，记录该节点的左右子节点是否已经被遍历
        while(!stack.isEmpty()){
            TreeNode curr  = stack.peek();
            boolean noChild = (curr.left == null && curr.right == null);
            boolean childVisited = false;
            if(prev != null && (curr.left == prev || curr.right == prev)){
                childVisited = true;
            }
            if(noChild || childVisited){
                curr = stack.pop();
                result.add(curr.val);
                prev = curr;
            }else {
                if(curr.right != null) stack.push(curr.right);
                if(curr.left != null) stack.push(curr.left);
            }
        }
        return result;
    }
}
