import java.util.HashMap;
import java.util.Map;

/**
 * 字符串中第一个唯一字符
 *
 * @author YanHuan
 * @date 2021-03-07 22:10
 */
public class FirstUniqChar {
    /**
     * 解法1：map
     * 时间复杂度：O(n)
     * 空间复杂度：O(|Σ|)  |Σ|<=26
     *
     * @param s 字符串
     * @return 唯一字符索引
     */
    public int firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        //缓存
        for (char c : chars) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        //遍历
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
