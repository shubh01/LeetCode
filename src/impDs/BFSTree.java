package impDs;

import leetcode.TreeNode;

public class BFSTree {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode root1 = new TreeNode(2);
        TreeNode root2 = new TreeNode(3);
        TreeNode root3 = new TreeNode(4);
        TreeNode root4 = new TreeNode(5);
        TreeNode root5 = new TreeNode(6);
        TreeNode root6 = new TreeNode(7);

        root.left=root1;
        root.right=root2;

        root1.left=root3;
        root1.right=root4;

        root2.left=root5;
        root2.right=root6;

        bfs(root);

    }


    private static void bfs(TreeNode root){
        int height = heightOfTree(root);

        for(int i=1;i<=height;i++) {
            System.out.println();
            printCurrentLevel(root, i);
        }
    }


    private static void printCurrentLevel(TreeNode node, int level){

        if(level == 1)
            System.out.print(node.val);

        if(node != null && node.left != null )
        printCurrentLevel(node.left,level-1);
        if(node != null && node.right != null )
        printCurrentLevel(node.right,level-1);

    }

    private static int heightOfTree(TreeNode root){

        if(root == null){
            return 0;
        }

        int leftHeight = heightOfTree(root.left)+1;
        int rightHeight = heightOfTree(root.right)+1;

        if(leftHeight>rightHeight)
            return leftHeight;
        else return rightHeight;

    }

}
