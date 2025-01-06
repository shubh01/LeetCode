package leetcode;

public class LevelOrderTraversal {


    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println(height(root));

    }



    public static void levelOrderTraversal(){



    }


    public static int height(TreeNode node){
        if(node == null)
            return 0;
        int l = height(node.left)+1;
        int r = height(node.right)+1;
        return Math.max(l,r);


    }

}
