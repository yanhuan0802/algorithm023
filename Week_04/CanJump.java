/**
 * 跳跃游戏
 *
 * @author YanHuan
 * @date 2021-01-24 16:51
 */
public class CanJump {
    /**
     * 解法1. 贪心算法
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     *
     * @param nums 数组
     * @return 能否达到最后一步
     */
    public boolean canJump(int[] nums) {
        if (nums == null) {
            return false;
        }
        //初始化能达到最后一步的位置
        int enableEnd = nums.length - 1;
        //倒序遍历  能跳到最后一步的位置
        for (int i = nums.length - 1; i >= 0; i--) {
            //判断当前点能否跳到enableEnd
            if (i + nums[i] >= enableEnd) {
                //能跳到的位置前移
                enableEnd = i;
            }
        }
        return enableEnd == 0;
    }

    /**
     * 解法2. 贪心算法
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     *
     * @param nums 数组
     * @return 能否达到最后一步
     */
    public boolean canJump1(int[] nums) {
        if (nums == null) {
            return false;
        }
        //能跳到的最大位置
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > max) {
                //跳不到
                return false;
            }
            max = Math.max(max, nums[i] + i);
        }
        return true;
    }
}
