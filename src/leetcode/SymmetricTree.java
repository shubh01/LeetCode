package leetcode;

public class SymmetricTree {


    public static void main(String[] args) {
        /*TreeNode root = new TreeNode(1);

        TreeNode treeNode1 = new TreeNode(2);
        TreeNode treeNode2 = new TreeNode(2);

        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);

        TreeNode treeNode5 = new TreeNode(4);
        TreeNode treeNode6 = new TreeNode(3);

        root.left=treeNode1;
        root.right=treeNode2;

        treeNode1.left=treeNode3;
        treeNode1.right=treeNode4;

        treeNode2.left=treeNode5;
        treeNode2.right=treeNode6;
*/

        TreeNode root = new TreeNode(1);

        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(2);

        TreeNode treeNode1 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(2);


        root.left=left;
        root.right=right;
        left.left=treeNode1;
        right.left=treeNode3;

        System.out.println(isSymmetric(root));


    }

    public static boolean isSymmetric(TreeNode root) {
        if(root == null)
            return true;
        return isSymmetric(root.right,root.right);
    }


    private static boolean isSymmetric(TreeNode n1, TreeNode n2){
        if(n1 == null && n2 == null)
            return true;
        if(n1 ==null || n2 == null)
            return false;

        return n1.val==n2.val && isSymmetric(n1.left,n2.right) && isSymmetric(n1.right,n2.left);
    }

/*
    private static void preOrderLeftTree(TreeNode treeNode, StringBuilder order){
        if(treeNode == null){
            order.append("null");
            return;
        }
        preOrderLeftTree(treeNode.left,order);
        order.append(treeNode.val);
        preOrderLeftTree(treeNode.right,order);
    }

    private static void preOrderRightTree(TreeNode treeNode, StringBuilder order){
        if(treeNode == null){
            order.append("null");
            return;
        }
        preOrderRightTree(treeNode.right,order);
        order.append(treeNode.val);
        preOrderRightTree(treeNode.left,order);
    }
*/


}
