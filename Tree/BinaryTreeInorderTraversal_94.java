package Tree;

//import sun.reflect.generics.tree.Tree;

import org.junit.Test;
import sun.reflect.generics.tree.Tree;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 *@author Druning
 */
public class BinaryTreeInorderTraversal_94 {
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

    static List<Integer> result = new ArrayList<>();

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


    public List<Integer> examRecur(TreeNode root) {
        if(root == null) return result;
        while(root != null){
            examRecur(root.left);
            result.add(root.val);
            examRecur(root.right);
        }
        return result;
    }


    public List<Integer> examIter(TreeNode root){
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while(cur != null || !stack.isEmpty()){
            if(cur != null){
                stack.push(cur);
                cur = cur.left;
            }else {
                cur = stack.pop();
                result.add(root.val);
                cur = cur.right;
            }
        }
        return result;
    }



}
