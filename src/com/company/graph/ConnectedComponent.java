package com.company.graph;

/**
 * Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water),
 * return the number of islands.
 * <p>
 * An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically.
 * You may assume all four edges of the grid are all surrounded by water.
 */
public class ConnectedComponent {

    public static void main(String[] args) {
        char[][] grid = new char[][]{{'0', '1', '0'}, {'1', '0', '1'}, {'0', '1', '0'}};
        ConnectedComponent cc = new ConnectedComponent();
        System.out.println(cc.numIslands(grid));
    }

    public int numIslands(char[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int count = 0;

        boolean[][] visited = new boolean[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {
                    DFS(grid, i, j, visited);
                    ++count;
                }
            }
        }

        return count;
    }

    private void DFS(char[][] grid, int i, int j, boolean[][] visited) {
        int[] rNbr = new int[]{-1, 0, 0, 1};
        int[] cNbr = new int[]{0, -1, 1, 0};

        visited[i][j] = true;
        for (int k = 0; k < 4; k++) {
            if (isSafe(grid, i + rNbr[k], j + cNbr[k], visited)) {
                DFS(grid, i + rNbr[k], j + cNbr[k], visited);
            }
        }
    }

    private boolean isSafe(char[][] grid, int r, int c, boolean[][] visited) {
        return (r >= 0) && (r < grid.length) && (c >= 0) && (c < grid[0].length) && (grid[r][c] == '1' && !visited[r][c]);
    }
}


