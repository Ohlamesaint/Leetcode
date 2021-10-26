package question_98.validate_binary_search_tree;

class Solution {
    public boolean isValidBST(TreeNode root) {
        return validate(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public boolean validate(TreeNode root, int min, int max){

        if(root==null) return true;
        else if(root.val == Integer.MIN_VALUE) {
            if(root.left != null) return false;
        } else if(root.val == Integer.MAX_VALUE) {
            if(root.right != null) return false;
        }
        // left
        if(!validate(root.left, min, root.val-1)){
            return false;
        }
        // right
        if(!validate(root.right,  root.val+1, max)){
            return false;
        }
        // mid
        if(root.val>=min && root.val<=max){
            return true;
        }
        return false;
    }
}