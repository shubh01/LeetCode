package leetcode;

public class SumOfLeftLeaves {

    static int sum =0;
    public static void main(String[] args) {




    }

    public static int sumOfLeftLeaves(TreeNode treeNode){
        if(treeNode == null){
            return 0;
        }
        else {
            if(treeNode.left == null && treeNode.right == null)
                sum+=treeNode.val;
            else{
                sumOfLeftLeaves(treeNode.left);
            }
        }
        if(treeNode.right != null)
            sumOfLeftLeaves(treeNode.right);
        return sum;
    }


}
