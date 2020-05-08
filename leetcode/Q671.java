/**
 * 二叉树中第二小的节点
 */
public class Q671 {

    private int dfs(TreeNode node, int val) {
        if (node == null) {
            return -1;
        }

        if (node.val > val) {
            return node.val;
        }

        int left = dfs(node.left, val);
        int right = dfs(node.right, val);
        if (left == -1) {
            return right;
        }
        if (right == -1) {
            return left;
        }

        return Math.min(left, right);
    }

    public int findSecondMinimumValue(TreeNode root) {
        if (root == null) {
            return -1;
        }

        return dfs(root, root.val);
    }
}
