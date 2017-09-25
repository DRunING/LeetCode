package Tree;

//import sun.reflect.generics.tree.Tree;

import sun.reflect.generics.tree.Tree;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by Druning on 2017/9/21.
 * LEETCODE 94
 */
public class BinaryTreeInorderTraversal {
    public static List<Integer> sulution(TreeNode a){
        ArrayList<Integer> result = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();
        TreeNode cur = a;
        while(cur != null || !s.empty()){
            while(cur != null){
                s.add(cur);
                cur = cur.left;
            }
            cur = s.pop();
            result.add(cur.val);
            cur = cur.right;
        }
        return result;
    }
    public static void main(String[] args){
        TreeNode a= new TreeNode(2);
        TreeNode b= new TreeNode(4);
        TreeNode c = new TreeNode(6);
        a.right = b;
        b.left = c;
        List<Integer> result = sulution(a);
        for(Integer num : result){
            System.out.println(num);
        }
    }
}
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
    }
}
