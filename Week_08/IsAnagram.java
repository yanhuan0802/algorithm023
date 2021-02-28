import java.util.Arrays;

/**
 * 有效的字母异位词
 *
 * @author YanHuan
 * @date 2021-03-01 0:22
 */
public class IsAnagram {

    /**
     * 解法  排序比较
     * 时间复杂度：O(logN)
     * 空间复杂度：O(logN)
     *
     * @param s 字符串1
     * @param t 字符串2
     * @return 结果
     */
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] chars = s.toCharArray();
        char[] chars1 = t.toCharArray();

        Arrays.sort(chars);
        Arrays.sort(chars1);

        return Arrays.equals(chars, chars1);
    }
}
