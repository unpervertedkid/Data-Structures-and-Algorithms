package leetcode.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> visitedLevels = new ArrayList<>();
        //Queue of all the nodes per level
        Queue<TreeNode> levels = new LinkedList<>();
        if(root == null){
            return visitedLevels;
        }
        levels.offer(root);

        while(!levels.isEmpty()){
            //List to hold values of the nodes at each level
            List<Integer> level = new ArrayList<>();
            //The size of the current level
            int levelSize = levels.size();
            /*For every node in the level, if it has child nodes,
            add them to the level below and remove it from
            the queue and add their value to the level's list
            */
            for(int i = 0; i < levelSize; i++){
                assert levels.peek() != null;
                TreeNode left = levels.peek().left;
                TreeNode right = levels.peek().right;

                if(left != null) levels.offer(left);
                if(right != null) levels.offer(right);

                level.add(levels.poll().val);
            }
            //Add the levels node's values list to the final list
            visitedLevels.add(level);
        }
        return visitedLevels;
    }
}
