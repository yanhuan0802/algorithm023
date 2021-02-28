/**
 * 颠倒的二进制位
 *
 * @author YanHuan
 * @date 2021-03-01 0:17
 */
public class ReverseBits {

    /**
     * 解法1
     *
     * @param n 二进制数
     * @return 颠倒结果
     */
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            //result左移一位
            result <<= 1;
            //如果n的最后一位是1，就添加到result
            if ((n & 1) == 1) {
                result++;
            }
            //每次计算最后一位  所以n右移一位
            n >>= 1;
        }
        return result;
    }
}
