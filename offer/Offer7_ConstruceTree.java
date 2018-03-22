package offer;

/**
 * @author zenli
 */
public class Offer7_ConstruceTree {
    public TreeNode contructTreeFromPreAndInOrder(int[] preOrder, int[] inOrder){
        if(preOrder == null || inOrder ==null) return null;
        if(preOrder.length == 0 || inOrder.length == 0) return null;
        if(preOrder.length != inOrder.length) return null;
        TreeNode root = helper(preOrder, 0, preOrder.length -1, inOrder, 0, inOrder.length -1);
        return root;
    }
    private TreeNode helper(int[] preOrder, int preStart, int preEnd,
                            int[] inOrder, int inStart, int inEnd){

        //corner case
        if(preStart > preEnd || inStart > inEnd) return null;
        int root_val = preOrder[preStart];
        TreeNode root = new TreeNode(root_val);
        int index =findIndex(inOrder, inStart, inEnd, root_val);
        //preEnd左子树在preOrder中的节点
        root.left = helper(preOrder, preStart + 1, preStart + index - inStart, inOrder, inStart, index - 1 );
        //构造右子树
        root.right = helper(preOrder, preStart + index - inStart + 1, preEnd, inOrder, index + 1, inEnd);
        return root;
    }

    //查询根节点在inorder中的索引
    private int findIndex(int[] nums, int start , int end, int target){
        for(int i = start; i <= end; i++){
            if(nums[i] == target) return i;
        }
        return -1;
    }
}
class TreeNode{
    int var;
    TreeNode left;
    TreeNode right;
    public TreeNode(int var){
        this.var = var;
    }
}
