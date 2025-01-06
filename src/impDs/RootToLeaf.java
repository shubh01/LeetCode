package impDs;

import leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class RootToLeaf {

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
        List<List<Integer>> ans = new ArrayList<>();
        rootToLeaf(root,ans,new ArrayList<>());
        System.out.println(ans);
    }

    private static void rootToLeaf(TreeNode root, List<List<Integer>> ans, List<Integer> tmp){

        if(root == null){
            return;
        }

        tmp.add(root.val);

        if(root.left == null && root.right == null){
            ans.add(new ArrayList<>(tmp));
        }

        if(root.left != null){
            rootToLeaf(root.left,ans,tmp);
        }
        if(root.right != null){
            rootToLeaf(root.right,ans,tmp);
        }

        tmp.remove(tmp.size()-1);
    }

}
