/**
 * 翻转字符串里的单词
 */
public class Q151 {
    public String reverseWords(String s) {

        String res = "";
        String[] words = s.trim().split(" ");
        for (int i = words.length - 1; i > -1; i--) {
            if (words[i].equals(" ") || words[i].length() == 0) {
                continue;
            }

            res += words[i] + " ";
        }

        return res.trim();
    }
}
