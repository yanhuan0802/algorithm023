/**
 * 解码方法
 *
 * @author YanHuan
 * @date 2021-02-15 16:45
 */
public class NumDecodings {

    /**
     * 动态规划
     * <p>
     * 时间复杂度：O(n)
     * 空间复杂度：O(n)
     *
     * @param s 字符串
     * @return 解码方法
     */
    public int numDecodings(String s) {
        if (s.startsWith("0")) {
            return 0;
        }
        int n = s.length();
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            int first = Integer.parseInt(s.substring(i - 1, i));
            int second = Integer.parseInt(s.substring(i - 2, i));
            if (first >= 1 && first <= 9) {
                dp[i] = dp[i] + dp[i - 1];
            }
            if (second >= 10 && second <= 26) {
                dp[i] = dp[i] + dp[i - 2];
            }
        }
        return dp[n];
    }
}
