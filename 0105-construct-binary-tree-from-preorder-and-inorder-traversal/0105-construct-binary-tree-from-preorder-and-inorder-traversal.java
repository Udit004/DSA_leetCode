/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private int preorderIndex = 0;
    private Map<Integer, Integer> inorderIndexMap = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i=0; i<inorder.length; i++){
            inorderIndexMap.put(inorder[i], i);
        }

        return buildsubTree(preorder, 0, inorder.length-1);
    }

    private TreeNode buildsubTree(int[] preorder, int leftorderIndex, int rightorderIndex){
        if(leftorderIndex > rightorderIndex) return null;

        int rootValue = preorder[preorderIndex++];
        TreeNode root = new TreeNode(rootValue);
        int inorderRootIndex = inorderIndexMap.get(rootValue);

        root.left = buildsubTree(preorder, leftorderIndex, inorderRootIndex - 1);
        root.right = buildsubTree(preorder,inorderRootIndex + 1, rightorderIndex);

        return root;
    }
}