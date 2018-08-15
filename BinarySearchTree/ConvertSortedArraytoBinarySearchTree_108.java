package LeetCode.BinarySearchTree;

/**
 * @author zenli
 */
public class ConvertSortedArraytoBinarySearchTree_108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums == null || nums.length == 0) return null;
        return helper(nums, 0, nums.length - 1);
    }
    private TreeNode helper(int[] nums ,int start, int end){
        //注意递归终止条件，不能遗漏数组元素
        if(start > end) return null;
        int mid = start + (end - start) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = helper(nums, start, mid - 1);
        root.right = helper(nums, mid + 1, end);
        return root;
    }
}
