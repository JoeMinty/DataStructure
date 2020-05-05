import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 二叉树的层次遍历
 */
public class Q102 {
    private List<List<Integer>> res = new ArrayList<>();

    private void dfs(TreeNode node, int depth) {
        // terminate condition
        if (node == null) {
            return;
        }

        // process
        while (res.size() <= depth) {
            res.add(new ArrayList<>());
        }

        res.get(depth).add(node.val);
        dfs(node.left, depth + 1);
        dfs(node.right, depth + 1);
    }

    private void bfs(TreeNode node) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> subRes = new ArrayList<>(size);
            for (int i = 0; i < size; i++) {
                TreeNode curr = queue.poll();
                if (curr.left != null) {
                    queue.add(curr.left);
                }
                if (curr.right != null) {
                    queue.add(curr.right);
                }
                subRes.add(curr.val);
            }
            res.add(subRes);
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return res;
        }

        bfs(root);
        // dfs(root, 0);
        return res;
    }

    public static void main(String[] args) {
        new Q102().levelOrder(new TreeNode(3));
    }
}
