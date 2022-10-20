package leetcode.trees;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostOrderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
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
        //Visit right
        traverse(root.right,visitedNodes);
        //Add root
        visitedNodes.add(root.val);
    }
}
