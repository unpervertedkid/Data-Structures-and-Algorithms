package leetcode.trees.traversal;


import java.util.ArrayList;
import java.util.List;

public class PreOrderTraversal {
    public static void main(String[] args) {
        Node root = new Node(1);
        List<Node> children = new ArrayList<>();
        children.add(new Node(3));
        children.add(new Node(2));
        children.add(new Node(4));
        root.children = children;
        List<Node> children2 = new ArrayList<>();
        children2.add(new Node(5));
        children2.add(new Node(6));
        root.children.get(0).children = children2;
        System.out.println(preorder(root));
    }
    public static List<Integer> preorder(Node root) {
        List<Integer> res = new ArrayList<>();
        preOrder(root,res);
        return res;
    }
    private static void preOrder(Node root,List<Integer> res){
        if(root == null){
            return;
        }
        res.add(root.val);
        for(Node child:root.children){
            preOrder(child,res);
        }
    }
}
