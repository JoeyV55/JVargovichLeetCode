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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> traversals = new ArrayList<>();
        if(root == null){
         return traversals;   
        }
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        TreeNode currentNode = null;
        nodeQueue.add(root);
        
        while(!nodeQueue.isEmpty()){
            List<Integer> thisTraversal = new ArrayList<>();
            int size = nodeQueue.size();
            
            traversals.add(thisTraversal);
            
            for(int i = 0; i < size; i++){             
            currentNode = nodeQueue.poll();
            thisTraversal.add(currentNode.val);        
            
            if(currentNode.left != null){
                nodeQueue.add(currentNode.left);
            }
            
            if(currentNode.right != null){
                nodeQueue.add(currentNode.right);
            }
    
            } 
        }
        
        
        
        return traversals;
    }
}
