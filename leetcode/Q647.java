class Q647 {
    private boolean isValid(String s) {
        int len = s.length();
        int mid = len / 2;
        for (int i = 0; i < mid; i++) {
            if (s.charAt(i) != s.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }
    
    public int countSubstrings(String s) {
         int n = s.length(), ans = 0;
        for (int i = 0; i < 2 * n - 1; ++i) {
            int l = i / 2, r = i / 2 + i % 2;
            while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
                --l;
                ++r;
                ++ans;
            }
        }
        return ans;

        // if (s == null || s.length() == 0) {
        //     return 0;
        // }

        // if (s.length() == 1) {
        //     return 1;
        // }

        // int res = 0;
        // for (int i = 0 ; i < s.length(); i++) {
        //     for (int j = i + 1; j <= s.length(); j++) {
        //         String subStr = s.substring(i,j);
        //         if (isValid(subStr)) {
        //             System.out.println(subStr);
        //             res++;
        //         }
        //     }
        // }

        // return res;
    }
}
