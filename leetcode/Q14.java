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

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        new Q14().longestCommonPrefix(strs);
    }
}
