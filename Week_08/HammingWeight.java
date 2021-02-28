/**
 * 位1的个数
 *
 * @author YanHuan
 * @date 2021-03-01 0:06
 */
public class HammingWeight {

    /**
     * 解法1：清零最低位的1
     * 时间复杂度：O(1)
     * 空间复杂度：O(1)
     *
     * @param n 整数n
     * @return 位1的个数
     */
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            //清零最低位的1
            n = n & (n - 1);
            count++;
        }
        return count;
    }

    /**
     * 解法2：移位
     * 时间复杂度：O(1)
     * 空间复杂度：O(1)
     *
     * @param n 整数n
     * @return 位1的个数
     */
    public int hammingWeight1(int n) {
        int count = 0;
        for (int i = 0; i < 32; i++) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }
}
