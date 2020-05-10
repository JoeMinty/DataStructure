/**
 * 二叉树的直径
 */
 public class Q543 {
    private int res = 0;
    
    private int depth(TreeNode root) {
      if (root == null) {
        return 0;
      }
      
      int l = depth(root.left);
      int r = depth(root.right);
      res = Math.max(res, l + r + 1);
      return Math.max(l, r) + 1;
    }
    
    public int diameterOfBinaryTree(TreeNode root) {
      if (root == null) {
        return 0;
      }
      
      depth(root);
      return res - 1;
    }
 }
