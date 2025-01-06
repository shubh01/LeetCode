package leetcode;

public class SameTree {


    public static void main(String[] args) {
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode root = new TreeNode(1);

        root.right=treeNode2;
        treeNode2.left=treeNode3;

//        printPreOrder(root);
        System.out.println(isSameTree(root,root));
    }


    public static boolean isSameTree(TreeNode p, TreeNode q) {

        StringBuilder order1 = new StringBuilder();
        StringBuilder order2 = new StringBuilder();
        printPreOrder(p,order1);
        printPreOrder(q,order2);
        System.out.println("order1: "+order1+" order2: "+order2);
        return order1.equals(order2);
    }

    private static void printPreOrder(TreeNode node,StringBuilder order){
        if(node==null){
            order.append("null");
            return;
        }
        order.append(node.val);
        printPreOrder(node.left,order);
        printPreOrder(node.right,order);

    }


    private static void printPreOrder(TreeNode node){
        if(node==null){
            System.out.println("null");
            return;
        }

        System.out.println(node.val);
        printPreOrder(node.left);
        printPreOrder(node.right);
    }


/*    private static String getPreOrder(TreeNode node, String order){

        if(node==null){
            order+="null";
            return order;
        }

        order+=node.val;
        getPreOrder(node.left,order);
        getPreOrder(node.right,order);
        return order;
    }*/

}
