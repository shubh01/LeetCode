package leetcode;

import java.util.Stack;

public class FlattenBinaryTreeToLinkedList {


    static Stack<TreeNode> integers = new Stack<>();

    public static void main(String[] args) {

        //[1,2,5,3,4,null,6]

        TreeNode root = new TreeNode(1);
        root.left= new TreeNode(2);
        root.right = new TreeNode(5);

        root.left.left= new TreeNode(3);
        root.left.right = new TreeNode(4);

        root.right.right = new TreeNode(6);

        inOrderTraversal(root);
        TreeNode temp = root;
        int i=1;
        while (i<5) {
            TreeNode nextNode = integers.pop();
            temp.left = null;
            TreeNode prev = temp.right;
            temp.right = nextNode;
            temp.right.right=prev;
            i+=1;
        }

        System.out.println(temp);
        System.out.println(root);
    }

    public static void inOrderTraversal(TreeNode node){
        if(node == null)
            return;

        integers.add(new TreeNode(node.val));
        inOrderTraversal(node.left);
        inOrderTraversal(node.right);
    }

}
