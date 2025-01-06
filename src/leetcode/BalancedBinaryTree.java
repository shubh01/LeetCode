package leetcode;

public class BalancedBinaryTree {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(2);

        TreeNode treeNode1 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(2);


        root.left=left;
        root.right=right;
        left.left=treeNode1;
        right.left=treeNode3;

        System.out.println(isBalanced(root));
    }


    public static boolean isBalanced(TreeNode root) {
        if(root==null)
            return true;




        int ld = maxDepth(root.left);
        int rd = maxDepth(root.right);

        System.out.println("ld: "+ld+" rd: "+rd);

        return Math.abs(ld-rd)<=1;

    }

    public static int height(TreeNode root){

        if(root == null)
            return 0;

        int ld = height(root.left);
        int rd = height(root.right);

        if(ld == -1 || rd ==-1 || Math.abs(ld-rd)>1)
            return -1;
        else return Math.max(ld,rd)+1;
    }


    public static int maxDepth(TreeNode root){

        if(root == null)
            return 0;

        int ld = maxDepth(root.left);
        int rd = maxDepth(root.right);

        if(ld>rd)
            return ld+1;
        return rd+1;
    }

}
