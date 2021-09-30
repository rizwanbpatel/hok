package com.company.graph;

public class ConnectedComponent3 {
    public static void main(String[] args) {
        char[][] grid = new char[][]{{'0', '1', '1'}, {'1', '1', '0'}, {'0', '0', '1'}};
        ConnectedComponent3 cc = new ConnectedComponent3();
        System.out.println("Number of Island : " + cc.numIslands(grid));
    }

    private int numIslands(char[][] grid) {
        int count = 0;
        int row = grid.length;
        int col = grid[0].length;
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

    private void DFS(char[][] grid, int r, int c, boolean[][] visited) {
        int[] rNbr = new int[]{-1, 0, 0, 1};
        int[] cNbr = new int[]{0, -1, 1, 0};
        visited[r][c] = true;
        for (int k = 0; k < 4; k++) {
            if (isSafe(grid, r + rNbr[k], c + cNbr[k], visited)) {
                DFS(grid, r + rNbr[k], c + cNbr[k], visited);
            }
        }
    }

    private boolean isSafe(char[][] grid, int i, int j, boolean[][] visited) {
        return (i >= 0) && (j >= 0) && (i < grid.length) && (j < grid[0].length) && (grid[i][j] == '1' && !visited[i][j]);
    }

}
