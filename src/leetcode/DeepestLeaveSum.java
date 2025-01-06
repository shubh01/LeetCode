package leetcode;

import com.sun.source.tree.Tree;

public class DeepestLeaveSum {


    public static void main(String[] args) {



    }

    public static int deepestLeavesSum(TreeNode root) {
        int height = height(root);
        return sum(root,height,0);
    }

    public static int sum(TreeNode root, int height, int sum){
        if(root == null)
            return sum;
        if(height==1){
            sum+=root.val;
            return sum;
        }

        if (height>1){
            sum+= sum(root.left,height-1,sum) + sum(root.right,height-1,sum);
        }
        return sum;
    }


    public static int height(TreeNode root){

        if(root == null)
            return 0;

        int hf = height(root.left)+1;
        int hr = height(root.right)+1;

        if(hf>hr)
            return hf;
        return hr;
    }

}
