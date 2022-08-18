package question_94.binary_tree_inorder_traversal;

import java.util.ArrayList;
import java.util.List;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        traverse(root, list);
        return list;
    }

    private void traverse(TreeNode subRoot, List<Integer> list){
        if(subRoot == null) return;
        traverse(subRoot.left, list);
        list.add(subRoot.val);
        traverse(subRoot.right, list);
        return;
    }
}
