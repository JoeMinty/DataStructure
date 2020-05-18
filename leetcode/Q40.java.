import java.util.*;

/**
 * 组合总数
 * https://leetcode-cn.com/problems/combination-sum-ii/
 */
public class Q40 {

    List<List<Integer>> res = new ArrayList<>();

    public void process(int start, int[] candidates, int target, Deque<Integer> subRes) {
        if (target == 0) {
            res.add(new ArrayList<>(subRes));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            target = target - candidates[i];
            if (target < 0) {
                break;
            }
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }
            subRes.addLast(candidates[i]);
            process(i + 1, candidates, target + candidates[i], subRes);
            subRes.removeLast();
        }

    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        process(0, candidates, target, new ArrayDeque<>());
        return res;
    }

    public static void main(String[] args) {
        int[] candidates = {10,1,2,7,6,1,5};
        int target = 8;
        new Q40().combinationSum2(candidates, target);
    }
}
