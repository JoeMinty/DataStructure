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

    public boolean isPalindrome1(int x) {
        if (x < 0) {
            return false;
        }

        if (x % 10 == 0 && x != 0) {
            return false;
        }

        int revertedNum = 0;
        while (x > revertedNum) {
            revertedNum = revertedNum * 10 + x % 10;
            x /= 10;
        }

        return x == revertedNum || x == revertedNum / 10;
    }

    public static void main(String[] args) {
        boolean res = new Q9().isPalindrome(123321);
        System.out.println(res);
    }
}
