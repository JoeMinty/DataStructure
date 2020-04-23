/**
 * 全排列
 */
public class Q46 {

    private void dfs(int pos, int[] nums, List<List<Integer>> res, List<Integer> subRes, boolean[] visited) {
        if (pos == nums.length) {
            res.add(new ArrayList<>(subRes));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                subRes.add(nums[i]);
                dfs(pos + 1, nums, res, subRes, visited);
                subRes.remove(subRes.size() - 1);
                visited[i] = false;
            }
        }

    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        dfs(0, nums, res, new ArrayList<>(), visited);
        return res;
    }
}
