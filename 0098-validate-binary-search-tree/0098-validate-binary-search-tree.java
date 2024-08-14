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
    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer> nodeValues = new ArrayList<>();
        inOrderTraversal(root, nodeValues);
        
        for (int i = 1; i < nodeValues.size(); i++) {
            if (nodeValues.get(i) <= nodeValues.get(i - 1)) {
                return false;
            }
        }
        return true;
    }
    
    private void inOrderTraversal(TreeNode node, ArrayList<Integer> results) {
        if (node == null) return;
        
        inOrderTraversal(node.left, results);
        results.add(node.val);
        inOrderTraversal(node.right, results);
    }
}
