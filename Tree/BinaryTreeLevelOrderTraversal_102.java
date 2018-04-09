package Tree;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author zenli
 * 典型的层序遍历(自上而下)
 */

//返回值是一个二维数组
public class BinaryTreeLevelOrderTraversal_102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            List<Integer> list = new ArrayList<>();
            int qSize = q.size();
            for(int i =0 ; i < qSize; i++){
                //从队列中弹出一个，检查左右子节点，压入队列
                TreeNode node = q.poll();
                list.add(node.val);
                if(node.left != null) q.offer(node.left);
                if(node.right != null) q.offer(node.right );
            }
            //写入结果数组
            result.add(new ArrayList<Integer>(list));
        }
        return result;
    }

    //当返回值是一个数组时
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(root == null) return result;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(root);
        while(!q.isEmpty()){
            for(int i = 0; i < q.size(); i++){
                //弹出并删除一个元素
                TreeNode node = q.poll();
                result.add(node.val);
                if(node.left != null) q.offer(node.left);
                if(node.right != null) q.offer(node.right);
            }
        }
        return result;
    }

    public ArrayList<Integer> examPrint(TreeNode root){
        if(root == null) return null;
        ArrayList<Integer> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        TreeNode curr = root;
        q.offer(root);
        while(!q.isEmpty()){
            for(int i = 0; i < q.size(); i++){
                TreeNode node = q.poll();
                list.add(node.val);
                if(node.left != null) q.offer(node.left);
                if(node.right != null) q.offer(node.right);
            }
        }
        return list;
    }
}

//        队列使用（前面添加，后面使用）
//        添加元素用offer
//        q.offer(null)；
//        获取并删除元素用poll
//        q.poll();
//        使用前端而不移除元素
//        q.element();
//        q.peek();
