import java.util.HashMap;

/**
 * 两数之和
 *
 * @author YanHuan
 * @date 2021-01-10 21:29
 */
public class TwoSum {

    /**
     * map缓存
     * 时间复杂度O(n) -- 一次遍历
     * 空间复杂度O(n) ---map开销
     *
     * @param nums   数组
     * @param target 目标值
     * @return 结果
     */
    public int[] twoSum(int[] nums, int target) {
        if (nums == null) {
            return null;
        }
        //map缓存  降低时间复杂度
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{i, map.get(complement)};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }
}
