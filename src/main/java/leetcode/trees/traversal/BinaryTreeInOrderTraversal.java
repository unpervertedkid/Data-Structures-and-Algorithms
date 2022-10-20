package leetcode.trees.traversal;

import leetcode.trees.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInOrderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> visitedNodes = new ArrayList<>();
        traverse(root,visitedNodes);
        return visitedNodes;
    }
    private void traverse(TreeNode root, List<Integer> visitedNodes){
        if(root == null){
            return;
        }

        //Visit left
        traverse(root.left,visitedNodes);
        //Add root
        visitedNodes.add(root.val);
        //Visit right
        traverse(root.right,visitedNodes);
    }
}
