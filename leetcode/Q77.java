/**
 * 组合
 */
public class Q77 {

    private void dfs(int n, int k, int pos, List<List<Integer>> res, List<Integer> subRes) {
        if (subRes.size() == k) {
            res.add(new ArrayList<>(subRes));
            return;
        }

        if (pos > n) {
            return;
        }

//        subRes.add(pos);
//        dfs(n, k, pos + 1, res, subRes);
//        subRes.remove(subRes.size() - 1);
//        dfs(n, k, pos + 1, res, subRes);

        for (int i = pos; i <= n; i++) {
            subRes.add(i);
            dfs(n, k, pos + 1, res, subRes);
            subRes.remove(subRes.size() - 1);
        }

    }

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(n, k, 1 ,res, new ArrayList<>());
        return res;
    }
}
