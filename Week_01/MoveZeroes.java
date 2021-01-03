/**
 * 移动0
 *
 * @author YanHuan
 * @date 2021-01-03 20:54
 */
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        if (nums == null) {
            return;
        }
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                //起始位置有差异  赋值
                if (i > j) {
                    nums[j] = nums[i];
                    nums[i] = 0;
                }
                j++;
            }
        }
    }
}
