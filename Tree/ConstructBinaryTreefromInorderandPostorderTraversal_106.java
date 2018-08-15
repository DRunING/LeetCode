package LeetCode.Tree;

import org.junit.Test;

/**
 * @author Druning
 *
 * O(n2)
 *
 */
public class ConstructBinaryTreefromInorderandPostorderTraversal_106 {
    @Test
    public void test(){

    }
    public static TreeNode buildTree(int[] inorder, int[] postorder){
        if(inorder  == null || postorder == null) return null;
        if(inorder.length == 0 || postorder.length == 0) return null;
        if(inorder.length != postorder.length) return null;
        TreeNode root  = helper(inorder, 0, inorder.length - 1, postorder, 0, postorder.length -1);
        return root;
    }
    private static TreeNode helper(int[] inorder, int inStart, int inEnd,
                                   int[] postorder, int postStart, int postEnd){
        if(inStart > inEnd || postStart > postEnd) return null;

        //新建根节点
        int root_val = postorder[postEnd];
        TreeNode root = new TreeNode(root_val);

        int index = findIndex(inorder, inStart, inEnd, root_val);

        //构建左子树,注意递归调用细节
        root.left =  helper(inorder, inStart, index - 1, postorder, postStart, postStart + index - inStart - 1);

        //构建右子树,注意递归调用细节
        root.right = helper(inorder, index + 1, inEnd, postorder, postStart + index - inStart, postEnd - 1);

        return root;
//        return root;
    }
    private static int findIndex(int[] nums, int start, int end, int target){
        if(start > end || start < 0) return -1;
        for(int i = start ; i <= end; i++){
            if(nums[i] == target)
                return i;
        }
        return -1;
    }
}
