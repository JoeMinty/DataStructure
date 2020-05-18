/**
 * 最后一个单词的长度
 */
public class Q58 {
    public int lengthOfLastWord(String s) {
        String[] strs = s.split(" ");
        if (strs.length <= 0) {
            return 0;
        }

        return strs[strs.length - 1].length();
    }

    /**
     * 优化版本
     *
     * @param s 字符串
     * @return 长度
     */
    public int lengthOfLastWord1(String s) {
        int end = s.length() - 1;
        while (end >= 0 && s.charAt(end) == ' ') {
            end--;
        }

        if (end < 0) {
            return 0;
        }

        int start = end;
        while (start >= 0 && s.charAt(start) != ' ') {
            start--;
        }

        return end - start;
    }
}
