package leetcode.trees;

public class MaximumDepthOfBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(maxDepth(root));
    }
    //Variable to hold maximum depth
    static int maxDepth = 0;
    public static int maxDepth(TreeNode root) {
        int depth = 0;
        if(root == null){
            return depth;
        }
        //Start if root is not null
        findDepth(root,depth+1);
        return maxDepth;
    }
    private static void findDepth(TreeNode root, int depth){
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
