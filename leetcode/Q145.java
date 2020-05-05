import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 二叉树的后序遍历
 */
public class Q145 {
    private List<Integer> res = new ArrayList<>();

    private void postOrder(TreeNode node) {
        if (node == null) {
            return;
        }

        postOrder(node.left);
        postOrder(node.right);
        res.add(node.val);
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) {
            return res;
        }
        postOrder(root);
        return res;
    }

    public List<Integer> postoderByIterator(TreeNode root) {
        if (root == null) {
            return res;
        }

        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> stackRes = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node.left != null) {
                stack.push(node.left);
            }
            if (node.right != null) {
                stack.push(node.right);
            }

            stackRes.add(node.val);
        }

        while (!stackRes.isEmpty()) {
            res.add(stackRes.pop());
        }
        return res;
    }
}
