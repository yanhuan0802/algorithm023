/**
 * 扫雷
 *
 * @author YanHuan
 * @date 2021-01-24 1:25
 */
public class UpdateBoard {
    //初始化8个方位
    int[] dx = {-1, 1, 0, 0, -1, 1, -1, 1};
    int[] dy = {0, 0, -1, 1, 1, 1, -1, -1};

    /**
     * 解法1. 深度优先
     * 时间复杂度：O(mn)
     * 空间复杂度：O(mn)
     *
     * @param board 二维数组
     * @param click 点
     * @return 点击结果
     */
    public char[][] updateBoard(char[][] board, int[] click) {
        int x = click[0], y = click[1];
        if (board[x][y] == 'M') {
            //1.找到雷
            board[x][y] = 'X';
        } else {
            //没找到雷，dfs处理当前节点
            dfs(board, x, y);
        }
        return board;
    }

    private void dfs(char[][] board, int x, int y) {
        int cnt = 0;
        for (int i = 0; i < 8; i++) {
            //判断周围元素的值
            int tx = x + dx[i];
            int ty = y + dy[i];
            if (tx < 0 || ty < 0 || tx >= board.length || ty >= board[0].length) {
                //越界 不作处理
                continue;
            }
            if (board[x][y] == 'M') {
                //有雷  +1
                cnt++;
            }
        }
        if (cnt > 0) {
            //2.周围有雷
            board[x][y] = (char) (cnt + '0');
        } else {
            //3.周围没有雷
            board[x][y] = 'B';
            //处理周围元素
            for (int i = 0; i < 8; i++) {
                int tx = x + dx[i];
                int ty = y + dy[i];
                //保证不越界且没有扫过
                if (tx < 0 || ty < 0 || tx >= board.length || ty >= board[0].length || board[tx][ty] != 'E') {
                    continue;
                }
                //处理递归处理周围的这个节点
                dfs(board, x, y);
            }
        }
    }
}
