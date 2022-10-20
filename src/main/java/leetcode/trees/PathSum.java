package leetcode.trees;

public class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;

        return isValidSum(root,0,targetSum);
    }
    private boolean isValidSum(TreeNode node, int currentSum, int targetSum){
        if(node == null){
            return false;
        }

        currentSum += node.val;
        //If the current node is the leaf node return if the sum up to it is equal to target sum
        if(node.left == null && node.right == null){
            return currentSum == targetSum;
        }
        return isValidSum(node.left,currentSum,targetSum) || isValidSum(node.right,currentSum,targetSum);
    }
}
