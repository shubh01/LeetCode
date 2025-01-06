package leetcode;

public class BSTGreaterSum {

    public static void main(String[] args) {

    }


    public static void inOrder(TreeNode root){

        if(root == null)
            return;

        inOrder(root.left);
        System.out.println(root.val);
        inOrder(root.right);

    }

}
