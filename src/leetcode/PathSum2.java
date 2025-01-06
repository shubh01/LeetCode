package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PathSum2 {

    public static void main(String[] args) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();

        sum(null,ans,tempList,0,0);

    }

    public static void sum(TreeNode node, List<List<Integer>> ans, List<Integer> tempList, int sum, int target){

        if(node == null){
            return ;
        }

        System.out.println("sum: "+sum);

        if(node.left == null && node.right == null && sum == target){
            ans.add(tempList);
            return;
        }

        sum(node.left,ans,new ArrayList<>(tempList), sum+node.val,target);
        sum(node.right,ans,new ArrayList<>(tempList), sum+node.val,target);

    }


}
