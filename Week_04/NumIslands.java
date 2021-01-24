/**
 * 岛屿数量
 *
 * @author YanHuan
 * @date 2021-01-23 23:32
 */
public class NumIslands {
    /**
     * 解法1. DFS深度优先
     * 时间复杂度O(MN)
     * 空间复杂度O(MN)
     *
     * @param grid 二维数组
     * @return 岛屿数量
     */
    public int numIslands(char[][] grid) {
        //特判
        int n = grid.length;
        if (n == 0) {
            return 0;
        }
        int m = grid[0].length;
        int count = 0;
        //遍历
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '1') {
                    //找到岛屿1，将它上下左右元素全部标记为0
                    dfsMarking(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    private void dfsMarking(char[][] grid, int i, int j) {
        //中止条件
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] != '1') {
            return;
        }
        //当前层处理
        grid[i][j] = '0';
        //递归
        dfsMarking(grid, i - 1, j);
        dfsMarking(grid, i + 1, j);
        dfsMarking(grid, i, j - 1);
        dfsMarking(grid, i, j + 1);
    }
}
