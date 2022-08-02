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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {  
    List<List<Integer>> ll =new ArrayList<>();
    if(root ==null) return ll;
    Queue<TreeNode> q=new LinkedList<TreeNode>();
    q.add(root);
    Stack<List<Integer>> st= new Stack<List<Integer>>();
    while(!q.isEmpty()){
        List<Integer> res=new ArrayList<Integer>();
        int count=q.size();
        for(int i=0;i<count;i++){
            TreeNode curr=q.poll();
            res.add(curr.val);
            if(curr.left!=null) q.add(curr.left);
            if(curr.right!=null) q.add(curr.right);
        }
        st.push(res);
    }
    while(!st.isEmpty()){
        ll.add(st.pop());
    }
    return ll;
        
    }
}