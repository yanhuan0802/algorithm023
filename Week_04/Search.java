/**
 * 搜索并旋转数组
 *
 * @author YanHuan
 * @date 2021-01-24 23:56
 */
public class Search {
    /**
     * 解法 二分查找
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     *
     * @param nums   数组
     * @param target 目标
     * @return 查找结果
     */
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            //判断什么时候在左半部分 什么时候在右半部分
            // 先根据 nums[mid] 与 nums[lo] 的关系判断 mid 是在左段还是右段
            if (nums[mid] >= nums[left]) {
                // 再判断 target 是在 mid 的左边还是右边，从而调整左右边界 lo 和 hi
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}
