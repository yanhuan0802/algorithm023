import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 字母异位词分组
 *
 * @author YanHuan
 * @date 2021-01-10 21:40
 */
public class GroupAnagrams {

    /**
     * 按照排序后的结果分组
     * <p>
     * n是数组长度  k是字符串长度
     * 时间复杂度: O(nklogK) :字符串排序的时间复杂度是O(klogK),排序n个就是O(nklogk),分组时间复杂度为O(n)
     * 空间复杂度：O(nk)
     *
     * @param strs 字符串数组
     * @return 结果
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        return new ArrayList<>(Arrays.stream(strs)
                .collect(Collectors.groupingBy(s -> {
                    char[] chars = s.toCharArray();
                    Arrays.sort(chars);
                    return new String(chars);
                })).values());
    }
}
