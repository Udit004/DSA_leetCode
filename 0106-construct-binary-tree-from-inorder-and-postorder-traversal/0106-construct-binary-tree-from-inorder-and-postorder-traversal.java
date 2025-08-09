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

    private int postIndex;
    private Map <Integer, Integer> inorderMap;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        inorderMap = new HashMap<>();

        for(int i = 0; i<inorder.length; i++){
            inorderMap.put(inorder[i], i);
        }

        postIndex = postorder.length - 1;

        return build(inorder, postorder, 0, postorder.length-1);
        
    }

    private TreeNode build(int[] inorder, int[] postorder, int isStart, int isEnd){
        if(isStart > isEnd) return null;

        int rootValue = postorder[postIndex--];
        TreeNode root = new TreeNode(rootValue);
        int Index = inorderMap.get(rootValue);

        root.right = build(inorder, postorder, Index+1, isEnd); //order of this two line is very important
        root.left = build(inorder, postorder, isStart, Index-1);

        return root;
    }
}