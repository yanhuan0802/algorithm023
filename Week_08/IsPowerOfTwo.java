/**
 * 2的幂
 *
 * @author YanHuan
 * @date 2021-03-01 0:13
 */
public class IsPowerOfTwo {

    /**
     * 解法：n>0且 二进制数中只有一个1即清零最后一个一之后等于0
     *
     * @param n 整数
     * @return 是否为2的幂次方
     */
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}
