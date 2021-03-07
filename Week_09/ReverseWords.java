import java.util.Arrays;
import java.util.Collections;

/**
 * 翻转字符串中的单词
 *
 * @author YanHuan
 * @date 2021-03-07 22:18
 */
public class ReverseWords {

    /**
     * 解法1 split  reverse  join
     * 时间复杂度：O(n)
     * 空间复杂度：O(n)
     *
     * @param s 字符串
     * @return 翻转结果
     */
    public String reverseWords(String s) {
        String[] split = s.trim().split(" +");
        Collections.reverse(Arrays.asList(split));
        return String.join(" ", split);
    }
}
