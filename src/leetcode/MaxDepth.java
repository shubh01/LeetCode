package leetcode;

public class MaxDepth {

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

        System.out.println(maxDepth(root));

    }


    private static int maxDepth(TreeNode node){

        if(node == null)
            return 0;

        int lDepth = maxDepth(node.left);
        int rDepth = maxDepth(node.right);

        if(lDepth>rDepth)
            return rDepth+1;
        else return lDepth+1;

    }

}
