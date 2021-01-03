/**
 * 删除排序数组中的重复项
 *
 * @author YanHuan
 * @date 2021-01-03 22:23
 */
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        //快慢指针  0-slow 即不重复的项
        int slow = 0;
        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[slow] != nums[fast]) {
                slow++;
                nums[slow] = nums[fast];
            }
        }
        //返回个数：index+1
        return slow + 1;
    }
}
