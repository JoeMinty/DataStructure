
/**
 * 目标和
 */
public class Q494 {
    private int res = 0;

    private void dfs(int[] nums, int index, int target) {
        if (index == nums.length && target == 0) {
            res++;
            return;
        }

        if (index == nums.length) {
            return;
        }


        dfs(nums, index + 1, target + nums[index]);
        dfs(nums, index + 1, target - nums[index]);

    }

    public int findTargetSumWays(int[] nums, int S) {
        dfs(nums, 0, S);
        return res;
    }

    // 优化，dp
    public int findTargetSumWaysByDP(int[] nums, int S) {
        int[] dp = new int[];

        return dp[S];
    }


    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1};
        System.out.println(new Q494().findTargetSumWays(nums, 3));
    }
}
