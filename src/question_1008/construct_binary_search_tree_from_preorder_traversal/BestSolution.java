package question_1008.construct_binary_search_tree_from_preorder_traversal;

public class BestSolution {

    public TreeNode bstFromPreorder(int[] preorder) {

        TreeNode resultTree = setTree(preorder, 0, preorder.length);
        return resultTree;
    }

    private TreeNode setTree(int[] inputList, int start, int end){
        if(start == end){
            return null;
        } else if(start == end-1){
            return new TreeNode(inputList[start], null, null);
        } else {
            TreeNode root = new TreeNode(inputList[start]);
            for(int i=start+1; i<end; i++){
                if(inputList[i]>inputList[start]){
                    root.left = setTree(inputList, start+1, i);
                    root.right = setTree(inputList, i, end);
                    return root;
                }
            }
            root.left = setTree(inputList, start+1, end);
            root.right = null;
            return root;
        }
    }
}
