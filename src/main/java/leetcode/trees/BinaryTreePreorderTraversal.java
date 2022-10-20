package leetcode.trees;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> visitedNodes = new ArrayList<>();
        if(root == null){
            return visitedNodes;
        }
        else{
            traverse(root,visitedNodes);
        }
        return visitedNodes;
    }
    private void traverse(TreeNode root, List<Integer> visitedNodes){
        if(root == null){
            return;
        }
        //Add root
        visitedNodes.add(root.val);
        //Go left
        traverse(root.left,visitedNodes);
        //Go right
        traverse(root.right,visitedNodes);
    }
}
