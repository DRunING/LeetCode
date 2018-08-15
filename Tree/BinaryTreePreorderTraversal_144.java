package LeetCode.Tree;


import java.util.*;

/**
 * @author zenli
 *
 * 遍历二叉树通常不推荐使用递归的方法
 */
public class BinaryTreePreorderTraversal_144 {
    //递归根据对结果的处理方式可分为分治和遍历两种方法，递归调用栈可能会溢出，利用堆内存进行迭代会比较好

    //递归的分治方法
    public List<Integer> solutionByRecur(TreeNode root){
        List<Integer> result = new ArrayList<>();
        if(root != null){
            List<Integer> left = solutionByRecur(root.left);
            List<Integer> right = solutionByRecur(root.right);

            //前序遍历左中右的顺序添加序列
            result.add(root.val);
            result.addAll(left);
            result.addAll(right);
        }
        return result;
    }


    List<Integer> result = new ArrayList<>();
    //递归的遍历方法
    public List<Integer> solutionByRecur1(TreeNode root){
        if(root != null){
            result.add(root.val);
            solutionByRecur1(root.left);
            solutionByRecur1(root.right);
        }
        //这个返回值在递归的子函数中是被丢弃的
        return result;
    }


    /**
     *
     * @param root
     *
     * @return
     */
    public List<Integer> sulotionByIter(TreeNode root){
        List<Integer> result = new ArrayList<>();

        //leetcode没有Deque类型
//        Deque<TreeNode> stack = new ArrayDeque<>();
        Stack<TreeNode> stack = new Stack<>();
        if(root != null) stack.push(root);
        while(!stack.isEmpty()){
            //弹出栈顶元素
            root = stack.pop();
            result.add(root.val);
            //此处注意判断条件和入栈顺序
            if(root.right != null)  stack.push(root.right);
            if(root.left != null) stack.push(root.left);
        }
        return result;
    }

    public List<Integer> examIter(TreeNode root){
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        if(root != null) stack.push(root);
        while(!stack.isEmpty()){
            root = stack.pop();
            result.add(root.val);
            if(root.right != null) stack.push(root.right);
            if(root.left != null) stack.push(root.left);
        }
        return result;
    }

}
