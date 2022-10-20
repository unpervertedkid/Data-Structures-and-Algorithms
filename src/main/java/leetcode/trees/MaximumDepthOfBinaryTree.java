package leetcode.trees;

public class MaximumDepthOfBinaryTree {
    //Variable to hold maximum depth
    int maxDepth = 0;
    public int maxDepth(TreeNode root) {
        int depth = 0;
        if(root == null){
            return depth;
        }
        //Start if root is not null
        findDepth(root,depth+1);
        return maxDepth;
    }
    private void findDepth(TreeNode root, int depth){
        //If the current root is null return
        if(root == null){
            return;
        }
        //Compare to max depth and update accordingly
        maxDepth = Math.max(maxDepth,depth);
        //Increase depth as we go down by one
        findDepth(root.left,depth+1);
        findDepth(root.right,depth+1);
    }
}
