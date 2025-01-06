package leetcode;

public class MinimumDepthOfBinaryTree {

    public static void main(String[] args) {



    }

    public static int minDepth(TreeNode root) {
        return lengthOfTree(root);
    }


    public static int lengthOfTree(TreeNode treeNode){
        if(treeNode == null){
            return 0;
        }

        if(treeNode.left==null)
           return lengthOfTree(treeNode.right)+1;

        if(treeNode.right==null)
           return lengthOfTree(treeNode.left)+1;

        return Math.min(lengthOfTree(treeNode.left),lengthOfTree(treeNode.right))+1;

    }

}
