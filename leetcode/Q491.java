class Q491 {
    private List<List<Integer>> ans = new ArrayList<List<Integer>>();

    public List<List<Integer>> findSubsequences(int[] nums) {
        dfs(0, Integer.MIN_VALUE, nums, new ArrayList<>());
        return ans;
    }

    public void dfs(int cur, int last, int[] nums, List<Integer> subRes) {
        if (cur == nums.length) {
            if (subRes.size() >= 2) {
                ans.add(new ArrayList<Integer>(subRes));
            }
            return;
        }
        if (nums[cur] >= last) {
            subRes.add(nums[cur]);
            dfs(cur + 1, nums[cur], nums, subRes);
            subRes.remove(subRes.size() - 1);
        }
        if (nums[cur] != last) {
            dfs(cur + 1, last, nums, subRes);
        }
    }
}
