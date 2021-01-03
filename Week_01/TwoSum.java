import java.util.HashMap;

/**
 * 两数之和
 *
 * @author YanHuan
 * @date 2021-01-03 20:48
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        //map 缓存    时间复杂度O(N)  空间复杂度O(N)
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{i, map.get(target - nums[i])};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }
}
