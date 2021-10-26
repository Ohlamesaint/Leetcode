package question_226.invert_binary_tree;

class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        reverse(root);
        return root;
    };

    public void reverse(TreeNode root){
        TreeNode temp = root.right;
        root.right = root.left;
        root.left = temp;
        if(root.right != null) reverse(root.right);
        if(root.left != null) reverse(root.left);
    }

}