/**
 * 爬楼梯
 *
 * @author YanHuan
 * @date 2021-02-21 23:04
 */
public class ClimbStairs {

    /**
     * 动态规划  滚动变量
     * <p>
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     *
     * @param n n
     * @return 方法数
     */
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int first = 1;
        int second = 2;
        for (int i = 3; i <= n; i++) {
            int tmp = first + second;
            first = second;
            second = tmp;
        }
        return second;
    }
}
