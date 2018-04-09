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


    public List<Integer> exam(TreeNode root){
        if(root == null) return null;
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();
        TreeNode curr = root;
        while(curr != null || !s.isEmpty()){
            while (curr != null){
                s.add(curr);
                curr = curr.left;
            }
            TreeNode node =  s.pop();
            list.add(node.val);
            curr =node.right;
        }
        return list;
    }

    ArrayList<Integer> list = new ArrayList<Integer>();
    public List<Integer> examRecur(TreeNode root){
        if(root != null){
            examRecur(root.left);
            list.add(root.val);
            examRecur(root.right);
        }
        return list;
    }



}
