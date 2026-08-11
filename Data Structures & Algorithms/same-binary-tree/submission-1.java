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
    public boolean isSameTree(TreeNode p, TreeNode q) {

        Stack<TreeNode> stackP = new Stack<>();
        Stack<TreeNode> stackQ = new Stack<>();

        stackP.push(p);
        stackQ.push(q);

        while(!stackP.isEmpty() && !stackQ.isEmpty()){

            TreeNode p1 = stackP.pop();
            TreeNode q1 = stackQ.pop();

            if(p1 == null && q1 ==null){
               continue;
            }
            if(p1 == null || q1 == null){
                return false;
            }

            if(p1.val == q1.val){
                stackP.push(p1.left);
                stackP.push(p1.right);
                stackQ.push(q1.left);
                stackQ.push(q1.right);
            }
            else{
                return false;
            }

        }
        return true;
        
    }
}
