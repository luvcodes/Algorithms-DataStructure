// 岛屿问题
// LeetCode 200

/**
 * DFS就是沿着一条路径一直走下去，当遇到终止条件的时候才会返回，
 * 而BFS就是先把当前位置附近的访问一遍，
 * 就像下面这样先访问圈内的，然后再把圈放大继续访问。
 * 
 * 这题使用BFS和DFS都能解决，如果遇到位置为1的格子，只要能把他们挨着的为1的全部置为0，
 * 然后挨着的挨着的为1的位置也置为0，然后……一直这样循环下去
 * */

public int numIslands(char[][] grid) {
    //边界条件判断
    if (grid == null || grid.length == 0)
        return 0;
    //统计岛屿的个数
    int count = 0;
    //两个for循环遍历每一个格子
    for (int i = 0; i < grid.length; i++)
        for (int j = 0; j < grid[0].length; j++) {
            //只有当前格子是1才开始计算
            if (grid[i][j] == '1') {
                //如果当前格子是1，岛屿的数量加1
                count++;
                //然后通过bfs把当前格子的上下左右4
                //个位置为1的都要置为0，因为他们是连着
                //一起的算一个岛屿，
                bfs(grid, i, j);
            }
        }
    return count;
}

private void bfs(char[][] grid, int x, int y) {
    //把当前格子先置为0
    grid[x][y] = '0';
    int n = grid.length;
    int m = grid[0].length;
    //使用队列，存储的是格子坐标转化的值
    Queue<Integer> queue = new LinkedList<>();
    //我们知道平面坐标是两位数字，但队列中存储的是一位数字，
    //所以这里是把两位数字转化为一位数字
    int code = x * m + y;
    //坐标转化的值存放到队列中
    queue.add(code);
    while (!queue.isEmpty()) {
        //出队
        code = queue.poll();
        //在反转成坐标值（i，j）
        int i = code / m;
        int j = code % m;
        if (i > 0 && grid[i - 1][j] == '1') {//上
            //如果上边格子为1，把它置为0，然后加入到队列中
            //下面同理
            grid[i - 1][j] = '0';
            queue.add((i - 1) * m + j);
        }
        if (i < n - 1 && grid[i + 1][j] == '1') {//下
            grid[i + 1][j] = '0';
            queue.add((i + 1) * m + j);
        }
        if (j > 0 && grid[i][j - 1] == '1') { //左
            grid[i][j - 1] = '0';
            queue.add(i * m + j - 1);
        }
        if (j < m - 1 && grid[i][j + 1] == '1') {//右
            grid[i][j + 1] = '0';
            queue.add(i * m + j + 1);
        }
    }
}