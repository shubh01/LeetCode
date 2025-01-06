package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {

    public static void main(String[] args) {

        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode root = new TreeNode(1);

        root.right=treeNode2;
        treeNode2.left=treeNode3;

/*        List<Integer> integerList = new ArrayList<>();

        printInorder(root,integerList);

        System.out.println(integerList);*/

        printInorderIterate(root);

    }

    public static void printInorder(TreeNode treeNode){
        if(treeNode == null)
            return;
        printInorder(treeNode.left);
        System.out.println(treeNode.val);
        printInorder(treeNode.right);
    }

    public static void printInorder(TreeNode treeNode, List<Integer> inOrderValues){
        if(treeNode == null)
            return;
        printInorder(treeNode.left,inOrderValues);
        inOrderValues.add(treeNode.val);
        printInorder(treeNode.right,inOrderValues);
    }

    public static void printInorderIterate(TreeNode treeNode){
        ArrayList<Integer> integers = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = treeNode;
        while(true){
            if(current != null){
                stack.push(current);
                current=current.left;
            }else if(!stack.empty()){
                TreeNode node = stack.pop();
                integers.add(node.val);
                current=node.right;
            }else{
                break;
            }
        }
        System.out.println(integers);
    }
}
