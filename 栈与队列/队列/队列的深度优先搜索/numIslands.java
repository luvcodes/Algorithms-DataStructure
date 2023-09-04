// 岛屿问题的广度优先搜索实现
// LeetCode 200
/**
 * 最简单的一种方式就是遍历数组中的每一个值，如果是1就说明是岛屿，然后把它置为0或者其他的字符都可以，只要不是1就行，
 * 然后再遍历他的上下左右4个位置。如果是1，说明这两个岛屿是连着的，只能算是一个岛屿，我们还要把它置为0，
 * 然后再以它为中心遍历他的上下左右4个位置。如果是0，就说明不是岛屿，就不在往他的上下左右4个位置遍历了。
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
                //然后通过dfs把当前格子的上下左右4
                //个位置为1的都要置为0，因为他们是连着
                //一起的算一个岛屿，
                dfs(grid, i, j);
            }
        }
    //最后返回岛屿的数量
    return count;
}

//这个方法会把当前格子以及他邻近的为1的格子都会置为1
public void dfs(char[][] grid, int i, int j) {
    //边界条件判断，不能越界
    if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0')
        return;
    //把当前格子置为0，然后再从他的上下左右4个方向继续遍历
    grid[i][j] = '0';
    dfs(grid, i - 1, j);//上
    dfs(grid, i + 1, j);//下
    dfs(grid, i, j + 1);//左
    dfs(grid, i, j - 1);//右
}