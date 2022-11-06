package leetcode.trees;

public class LowestCommonAncestor {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        TreeNode p = new TreeNode(5);
        TreeNode q = new TreeNode(1);
        System.out.println(lowestCommonAncestor(root, p, q).val);
    }
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null){
            return null;
        }
        // If the current node is the ancestor of both p and q, then return the current node
        if(p.val <= root.val && q.val >= root.val || q.val <= root.val && p.val >= root.val){
            return root;
        }
        // If the current node is greater than both p and q, then the LCA lies in the left subtree
        else if(p.val < root.val && q.val < root.val){
            return lowestCommonAncestor(root.left,p,q);
        }
        // If the current node is lesser than both p and q, then the LCA lies in the right subtree
        else{
            return lowestCommonAncestor(root.right,p,q);
        }


    }
}
