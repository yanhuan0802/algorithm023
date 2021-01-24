/**
 * 柠檬水找零
 *
 * @author YanHuan
 * @date 2021-01-24 17:47
 */
public class LemonadeChange {
    /**
     * 解法：模拟+贪心
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     *
     * @param bills 付款顺序
     * @return 能否找零
     */
    public boolean lemonadeChange(int[] bills) {
        //五块和十块用于找零  所以只需要记录五块和十块的数目
        int five = 0, ten = 0;
        for (int bill : bills) {
            if (bill == 5) {
                five++;
            } else if (bill == 10) {
                if (five < 0) {
                    return false;
                }
                five--;
                ten++;
            } else {
                //面额为20的情况
                if (five > 0 && ten > 0) {
                    five--;
                    ten--;
                } else if (five >= 3) {
                    five -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
