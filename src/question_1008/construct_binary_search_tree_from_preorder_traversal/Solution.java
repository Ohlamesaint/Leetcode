package question_1008.construct_binary_search_tree_from_preorder_traversal;

import java.util.ArrayList;

public class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
        ArrayList<Integer> preorder_list = new ArrayList<>();
        for(int i=0; i<preorder.length; i++){
            preorder_list.add(preorder[i]);
        }
        TreeNode resultTree = setTree(preorder_list);
        return resultTree;
    }

    private TreeNode setTree(ArrayList<Integer> inputList){
        if(inputList == null || inputList.size() == 0){
            return null;
        } else if(inputList.size() == 1){
            return new TreeNode(inputList.get(0), null, null);
        } else {
            ArrayList<Integer> leftTree = new ArrayList<>();
            ArrayList<Integer> rightTree = new ArrayList<>();
            for(int i=1; i<inputList.size(); i++){
                if(inputList.get(i)<inputList.get(0)){
                    leftTree.add(inputList.get(i));
                } else {
                    rightTree.add(inputList.get(i));
                }
            }
            TreeNode root = new TreeNode(inputList.get(0), setTree(leftTree), setTree(rightTree));
            return root;
        }
    }




}