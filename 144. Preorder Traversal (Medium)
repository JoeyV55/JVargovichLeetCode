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
    
    //Iterative (stack)
    public List<Integer> preorderTraversal(TreeNode root) {
     List<Integer> traversalList = new ArrayList<>();
        if(root == null)
        return traversalList;
     
     Stack<TreeNode> traversalStack = new Stack<>();
     traversalStack.push(root);
     TreeNode currentNode = root;
    
     while(!traversalStack.isEmpty()){
      currentNode = traversalStack.pop();
      traversalList.add(currentNode.val);
      if(currentNode.right != null)
          traversalStack.push(currentNode.right);
      if(currentNode.left != null)
          traversalStack.push(currentNode.left);
     }
     return traversalList;  
    }
    
    
    
    
    /*Recursive
    public List<Integer> preorderTraversal(TreeNode root) {
     List<Integer> traversalList = new ArrayList<>();
     return preorderHelper(root, traversalList);
        
    }
    
    
    public List<Integer> preorderHelper(TreeNode root, List<Integer> returnList){
        if(root != null){
            preorderHelper(root.left, returnList);
            returnList.add(root.val);
            preorderHelper(root.right, returnList);
        }
        return returnList;
    }*/
        
}
