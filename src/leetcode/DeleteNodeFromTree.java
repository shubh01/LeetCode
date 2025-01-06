package leetcode;

public class DeleteNodeFromTree {

    public static void main(String[] args) {

    }


    private static void deleteNode (TreeNode node, int key, TreeNode root, Boolean isLeft, Boolean isRight){

        if(node == null){
            return ;

        }

        if(node.val == key && root == null)
            return ;

        if(node.val == key){

            if(node.left == null && node.right == null){
                if(isLeft)
                    root.left=null;
                else root.right=null;
                return;
            }else if(node.left == null || node.right == null){
                if(isLeft){
                    if(node.left == null) {
                        root.left = node.right;
                    }else root.left = node.left;
                }
                if(isRight){
                    if(node.left == null) {
                        root.right = node.right;
                    }else root.right = node.left;
                }
                return;
            }else{
                if(node.left.val> node.val){
                    if(isLeft) {
                        root.left = node.left;
                        root.right.right=node.right;
                    }
                    else{
                        root.right=node.left;
                        root.right.right = node.right;
                    }
                }else{
                    if(isLeft){
                        root.left=node.right;
                        root.left.left=node.left;
                    }
                    else{
                        root.right=node.right;
                        root.left.left = node.left;
                    }
                }
                return;
            }
        }
        deleteNode(node.left,key,node,true,false);
        deleteNode(node.right,key,node,false,true);
    }

}
