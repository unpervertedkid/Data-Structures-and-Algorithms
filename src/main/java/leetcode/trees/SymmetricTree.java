package leetcode.trees;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        /*
        If the root is null, return true
        Otherwise, check if the left and right nodes are equal
        */
        return root == null || isSymmetry(root.right,root.left);
    }
    private boolean isSymmetry(TreeNode left, TreeNode right){
        /*
        If all the nodes are null, return true
        Else if only one of the nodes is null, that means they are not equal so return false
        */
        if(left == null || right == null){
            return left == right;
        }
        /*
        If the value of the right node is not equal to the value of the left node,
        return false
        */
        if(left.val != right.val){
            return false;
        }
        /*
        Check the children of the current nodes
        */
        return isSymmetry(left.left,right.right) && isSymmetry(left.right,right.left);
    }
}
