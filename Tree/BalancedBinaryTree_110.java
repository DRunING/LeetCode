package Tree;

/**
 * @author zenli
 */

//判断二叉树是否平衡
public class BalancedBinaryTree_110 {
    public boolean isBalanced(TreeNode root) {
        return maxDepth(root) != -1;
    }

    private int maxDepth(TreeNode root){
        //递归终结条件, 根节点等于0
        if(root == null) return 0;
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root. right);

        if(leftDepth == -1 || rightDepth == -1 || Math.abs(leftDepth - rightDepth) > 1)
            return -1;
        return 1 + Math.max(leftDepth, rightDepth);
    }
}
