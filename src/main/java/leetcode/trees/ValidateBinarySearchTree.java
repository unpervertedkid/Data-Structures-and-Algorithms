package leetcode.trees;

public class ValidateBinarySearchTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(6);
        System.out.println(isValidBST(root));
    }
    public static boolean isValidBST(TreeNode root) {
        if(root == null){
            return true;
        }
        return isValidBST(root,null,null);
    }
    private static boolean isValidBST(TreeNode root, TreeNode min, TreeNode max){
        if(root == null) return true;

        if(min != null && root.val <= min.val ||max != null && root.val >= max.val) return false;

        return isValidBST(root.left,min,root) && isValidBST(root.right,root,max);
    }
}
