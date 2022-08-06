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
    TreeNode prev=new TreeNode(Integer.MIN_VALUE);
    TreeNode f=null,s=null;
    public void recoverTree(TreeNode root) {
        
        traverse(root);
        
        int temp=f.val;
        f.val=s.val;
        s.val=temp;
    }
    
    public void traverse(TreeNode root){
        if(root==null) return;
            
        traverse(root.left);
        if(prev!=null && root.val<prev.val){
            if(f==null) f=prev;
            s=root;
        }
        
        prev=root;
        
        traverse(root.right);
    }
}