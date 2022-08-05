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
    public int countNodes(TreeNode root) {
        int l=0,r=0;
        TreeNode curr=root;
        while(curr!=null){
            l++;
            curr=curr.left;
        }
        curr=root;
        while(curr!=null){
            r++;
            curr=curr.right;
        }
        if(l==r){
            return (int)Math.pow(2,l)-1;
        }
    return 1+countNodes(root.left)+countNodes(root.right);
        
    }
}