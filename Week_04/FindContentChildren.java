import java.util.Arrays;

/**
 * 分发饼干
 *
 * @author YanHuan
 * @date 2021-01-24 15:30
 */
public class FindContentChildren {
    /**
     * 贪心算法：寻找最优解
     * 时间复杂度：O(nlogn+mlogm) 排序+遍历
     * 空间复杂度：O(logn+logm) 排序
     *
     * @param g 孩子胃口
     * @param s 饼干大小
     * @return 满足数量
     */
    public int findContentChildren(int[] g, int[] s) {
        //1.排序
        Arrays.sort(g);
        Arrays.sort(s);
        //2. 遍历比较
        int i = 0;
        int j = 0;
        while (i < g.length && j < s.length) {
            //判断条件
            if (g[i] < s[j]) {
                i++;
            }
            j++;
        }
        return i;
    }
}
