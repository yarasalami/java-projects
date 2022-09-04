class Solution {
   /** Left -> Node -> Right order of inorder traversal means
    *  for BST that each element should be smaller than the next one.
    */
    private Integer prev;
    public boolean isValidBST(TreeNode root){
        prev = null;
        return inorder(root);
    }
    private boolean inorder(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (!inorder(root.left)) {
            return false;
        }
        if (prev != null && root.val <= prev) {
            return false;
        }
        prev = root.val;
        return inorder(root.right);
    }
  /*
   *   private void inOrder(TreeNode node) {
   *          if (node == null) {
   *            return; 
   *           } 
   *           inOrder(node.left); 
   *           System.out.printf("%s ", node.data); 
   *           inOrder(node.right); 
   *    }
   */
}
