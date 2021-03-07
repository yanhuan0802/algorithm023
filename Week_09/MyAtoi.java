/**
 * 字符串转为整数
 *
 * @author YanHuan
 * @date 2021-03-07 22:28
 */
public class MyAtoi {

    /**
     * 时间复杂度 O(n)
     *
     * @param s 字符串
     * @return 整数
     */
    public int myAtoi(String s) {
        //特判
        if (s == null || s.isEmpty()) {
            return 0;
        }
        int index = 0, sign = 1, total = 0;
        //去除空格
        while (s.charAt(index) == ' ') {
            index++;
        }
        //判断正负号
        if (s.charAt(index) == '-' || s.charAt(index) == '+') {
            sign = s.charAt(index++) == '+' ? 1 : -1;
        }
        //数组转换
        while (index < s.length()) {
            //计算
            int digit = s.charAt(index) - '0';
            //判断不是数字忽略
            if (digit < 0 || digit > 9) {
                break;
            }
            if (Integer.MAX_VALUE / 10 < total || Integer.MAX_VALUE / 10 == total && Integer.MAX_VALUE % 10 < digit) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            total = 10 * total + digit;
            index++;
        }
        return total * sign;
    }
}
