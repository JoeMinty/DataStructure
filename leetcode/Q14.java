/**
 * https://leetcode-cn.com/problems/longest-common-prefix
 *
 * 最长公共前缀
 *
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 *
 */
public class Q14 {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null) {
            return "";
        }

        if (strs.length == 1) {
            return strs[0];
        }

        int minLen = Integer.MAX_VALUE;
        String res = "";
        for (String str : strs) {
            if (str.length() < minLen) {
                minLen = str.length();
                res = str;
            }
        }

        while (res.length() > 0) {
            boolean flag = true;
            for (String str : strs) {

                if (!str.substring(0, minLen).equals(res)) {
                    minLen--;
                    res = res.substring(0, minLen);
                    flag = false;
                    break;
                }
            }

            if (flag) {
                return res;
            }
        }

        return "";
    }
    
    public String longestCommonPrefix1(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String ans = strs[0];
        for (int i = 1; i < strs.length; i++) {
            int j = 0;
            for (; j < ans.length() && j < strs[i].length(); j++) {
                if (ans.charAt(j) != strs[i].charAt(j)) {
                    break;
                }
            }

            ans = ans.substring(0, j);
            if ("".equals(ans)) {
                return "";
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        new Q14().longestCommonPrefix(strs);
    }
}
