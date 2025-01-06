package leetcode;

public class ConvertSortedArrayToBinarySearchTree {


    public static void main(String[] args) {


        int[] nums = new int[] {0,1,2,3,4,5};

        TreeNode treeNode = sortedArrayToBST(nums);

        printTree(treeNode);


    }

    public static void printTree(TreeNode root){

        if(root == null)
            return;

        System.out.println(root.val);
        printTree(root.left);
        printTree(root.right);
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        int mid = nums[nums.length/2];
        TreeNode root = new TreeNode(mid);
        for (int i: nums){
            addNode(root,new TreeNode(i));
        }
        return root;
    }

    private static void addNode(TreeNode root, TreeNode node){
        if(root.val> node.val){
            if(root.left != null){
                addNode(root.left,node);
            }else{
                root.left=node;
                return;
            }
        }
        if(root.val< node.val){
            if(root.right != null){
                addNode(root.right,node);
            }else{
                root.right=node;
                return;
            }
        }
    }

}
