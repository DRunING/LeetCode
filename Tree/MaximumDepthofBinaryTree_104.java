package LeetCode.Tree;

import org.junit.Test;
import sun.reflect.generics.tree.Tree;

/**
 * @author Druning
 */
public class MaximumDepthofBinaryTree_104 {
    @Test
    public void test(){
        TreeNode t1 = new TreeNode(8);
        TreeNode t2 = new TreeNode(5);
        t1.left = t2;
        TreeNode t3 = new TreeNode(9);
        t2.right = t3;
        int result = maxDepth(t1);
        System.out.println(result);
    }

    /**
     *
     * @param root 根节点
     * @return
     */
    public int maxDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
