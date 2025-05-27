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
    public int diameterOfBinaryTree(TreeNode root) {
        return diameter(root);
    }

    public int diameter(TreeNode root){
        if(root==null) return 0;
        
        int leftDia=diameter(root.left);
        int leftht=heightOfTree(root.left);
        int rightDia=diameter(root.right);
        int rightht=heightOfTree(root.right);

        int self=leftht+rightht;

        return Math.max(self,Math.max(leftDia,rightDia));

    }

    public int heightOfTree(TreeNode root){
        if(root==null) return 0;

        int leftht=heightOfTree(root.left);
        int rightht=heightOfTree(root.right);

        return Math.max(leftht,rightht)+1;
    }
}