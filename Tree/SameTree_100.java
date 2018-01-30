package Tree;

import org.junit.Test;

/**
 * Created by Druning on 2017/9/25.
 */
public class SameTree_100 {
    public boolean isSameTree(TreeNode p, TreeNode q){
        if(p == null && q == null) return true;
        return p != null && q != null && q.val == p.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
