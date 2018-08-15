package LeetCode.Tree;

import java.util.*;

/**
 * @author zenli
 */

//自底而上层序遍历二叉树
public class BinaryTreeLevelOrderTraversal_107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        Queue<TreeNode> q = new LinkedList<>();
        Stack<List<Integer>> stack = new Stack<>();
        q.offer(root);
        while(!q.isEmpty()){
            List<Integer> tmp = new ArrayList<>();
            int qSize = q.size();
            for(int i = 0;i < qSize; i++){
                TreeNode node = q.poll();
                tmp.add(node.val);
                if(node.left != null) q.offer(node.left);
                if(node.right != null) q.offer(node.right);
            }
            stack.push(tmp);
        }
        int sSize = stack.size();
        for(int i = 0; i < sSize; i++){
            result.add(stack.pop());
        }
        return result;
    }
}
