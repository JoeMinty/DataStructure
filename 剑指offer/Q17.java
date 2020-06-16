/**
 * 面试题17. 打印从1到最大的n位数
 */
 
 public class Q17 {
     public int[] printNumbers(int n) {
        int size = (int) Math.pow(10, n);
        int[] ans = new int[size - 1];
        for (int i = 0; i < size - 1; i++) {
            ans[i] = i + 1;
        }
        return ans;
    }
}
