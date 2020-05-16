class Q560 {
    public int subarraySum(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            int target = k;
            for (int j = i; j < nums.length; j++) {
                target -= nums[j];
                if (target == 0) {
                    res++;
                }
            }
        }
        return res;
    }
    
    // 优化
    public int subarraySum2(int[] nums, int k) {
        int prev = 0;
        int count = 0;
        Map<Integer, Integer> map = new HashMap();
        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            prev = prev + nums[i];
            if (map.containsKey(prev - k))
                count += map.get(prev - k);
            map.put(prev, map.getOrDefault(prev, 0) + 1);
        }
        return count;
    }
}
