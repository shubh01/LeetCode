package leetcode;

import java.util.ArrayList;

public class BinaryTreePath {



    private static void paths(TreeNode node, String path, ArrayList<String> paths){
        if(node.left == null && node.right == null){
            path+=node.val;
            paths.add(path);
            return;
        }

        if(node.left != null)
            paths(node.left,"->",paths);
        if(node.right != null)
            paths(node.right,"->",paths);
    }


}
