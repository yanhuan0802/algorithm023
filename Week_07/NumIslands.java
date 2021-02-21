/**
 * 岛屿数量
 *
 * @author YanHuan
 * @date 2021-02-21 23:41
 */
public class NumIslands {

    /**
     * DFS
     * 时间复杂度：O(MN)
     * 空间复杂度：O(MN)
     *
     * @param grid 二维网格
     * @return 岛屿数量
     */
    public int numIslands(char[][] grid) {
        //特判
        int n = grid.length;
        if (n == 0) {
            return 0;
        }
        int count = 0;
        int m = grid[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '1') {
                    //找到岛屿  标记它上下左右的值为0
                    dfsMarking(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    private void dfsMarking(char[][] grid, int i, int j) {
        //中止
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] != '1') {
            return;
        }
        //标记
        grid[i][j] = '0';
        //递归
        dfsMarking(grid, i - 1, j);
        dfsMarking(grid, i + 1, j);
        dfsMarking(grid, i, j - 1);
        dfsMarking(grid, i, j + 1);
    }
}
