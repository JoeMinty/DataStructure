/**
 * 新21点
 */
public class Q837 {
    public double new21Game(int N, int K, int W) {
        if (N - K + 1 >= W) {
            return 1.0;
        }

        double[] dp = new double[K + W];
        for (int i = K; i <= N; i++) {
            dp[i] = 1.0;
        }

        double sumProb = N - K + 1;
        for (int i = K - 1; i >= 0; i--) {
            dp[i] = sumProb / W;
            sumProb = sumProb - dp[i + W] + dp[i];
        }

        return dp[0];
    }
}
