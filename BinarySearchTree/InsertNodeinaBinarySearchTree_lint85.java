package BinarySearchTree;

/**
 * @author zenli
 */
public class InsertNodeinaBinarySearchTree_lint85 {
    public static void main(String[] args){

    }

    public TreeNode insertNode(TreeNode root, TreeNode node) {
        // write your code here
        TreeNode result = reCur(root, node);

        return result;
    }

    public TreeNode reCur(TreeNode root, TreeNode node){
        //终止条件
        if(null == root) return node;
        if(root.val > node.val)
            root.left  = reCur(root.left, node);
        if(root.val < node.val)
            root.right = reCur(root.right, node);

        return root;
    }

    public TreeNode iter(TreeNode root, TreeNode node){
        //corner case
        if(root == null)  return node;
        if(node == null)  return root;
        TreeNode rootCopy = root;
        while(root != null){
            if(root.val > node.val && root.left == null){
                root.left = node;
                break;
            }else if(root.val < node.val && root.right == null){
                root.right = node;
                break;
            }else if(root.val > node.val){
                root = root.left;
            }else {
                root = root.right;
            }
        }
        return rootCopy;
    }
}
