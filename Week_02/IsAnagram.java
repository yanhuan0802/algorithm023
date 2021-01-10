import java.util.Arrays;

/**
 * 有效的字母异位词
 *
 * @author YanHuan
 * @date 2021-01-10 21:25
 */
public class IsAnagram {
    /**
     * 排序  比较
     * <p>
     * 时间复杂度O(nlogN)
     * 空间复杂度O(logN)
     *
     * @param s 字符串1
     * @param t 字符串2
     * @return 判断结果
     */
    public boolean isAnagram(String s, String t) {
        char[] chars1 = s.toCharArray();
        char[] chars2 = t.toCharArray();
        //排序比较
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        return Arrays.equals(chars1, chars2);
    }
}
