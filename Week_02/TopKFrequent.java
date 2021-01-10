import java.util.Comparator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 前K个高频元素
 *
 * @author YanHuan
 * @date 2021-01-10 23:01
 */
public class TopKFrequent {

    /**
     * 解法1：小根堆
     * 时间复杂度：O(nlogK),n为数组长度，k为堆的大小
     * 空间复杂度:O(n)，map最大空间为n
     *
     * @param nums 数组
     * @param k    k
     * @return 高频元素数组
     */
    public int[] topKFrequent(int[] nums, int k) {
        if (nums == null) {
            return null;
        }
        //次数统计
        Map<Integer, Integer> map = IntStream.of(nums).boxed().collect(Collectors.toMap(e -> e, e -> 1, Integer::sum));
        //定义小根堆  根据数字出现的频率从小到大排序
        Queue<Integer> queue = new PriorityQueue<>(Comparator.comparingInt(map::get));
        //遍历集合  数量不够就加进去  够了就判断大小  决定拿出来放新值还是不拿出来
        map.forEach((num, count) -> {
            if (queue.size() < k) {
                queue.offer(num);
            } else if (map.get(queue.peek()) < count) {
                queue.poll();
                queue.offer(num);
            }
        });
        int[] res = new int[k];
        int index = 0;
        for (Integer num : queue) {
            res[index++] = num;
        }
        return res;
    }
}
