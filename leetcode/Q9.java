/**
 * 回文数
 */
public class Q9 {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        int left = 0;
        int right = str.length() - 1;
        while (left <= right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            } else {
                left++;
                right--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean res = new Q9().isPalindrome(123321);
        System.out.println(res);
    }
}
