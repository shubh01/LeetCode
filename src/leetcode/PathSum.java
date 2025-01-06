package leetcode;

public class PathSum {

    public static void main(String[] args) {

    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        return checkPathSum(root,0,targetSum);
    }

    public boolean checkPathSum(TreeNode root, int currentSum, int targetSum) {
        if(root == null)
            return false;
        if(root.right == null && root.left == null){
            currentSum+=root.val;
            return currentSum == targetSum;
        }
        return checkPathSum(root.left,currentSum+root.val,targetSum) || checkPathSum(root.right,currentSum+root.val,targetSum);
    }

}
