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
    public TreeNode invertTree(TreeNode root) {
        if(root==null) return null;
        if(root.left==null && root.right==null){
            return root;
        }

        TreeNode leftS=invertTree(root.left);
        TreeNode rightS=invertTree(root.right);

        root.left=rightS;
        root.right=leftS;
        
        return root;
    }
}