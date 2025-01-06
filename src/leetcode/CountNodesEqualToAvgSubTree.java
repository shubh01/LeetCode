package leetcode;

public class CountNodesEqualToAvgSubTree {

    static int count =0;

    public static void main(String[] args) {




    }

    private static int[] fnc(TreeNode node){
        if(node == null){
            return new int[]{0,0};
        }
        int[] lt = fnc(node.left);
        int[] rt = fnc(node.right);
        int sum = lt[0]+rt[0]+node.val;
        int avg = sum/(lt[1]+rt[1]+1);
        if(avg == node.val){
            count++;
        }
        return new int[]{sum,lt[1]+rt[1]+1};
    }

}
