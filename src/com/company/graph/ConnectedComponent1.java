package com.company.graph;

public class ConnectedComponent1 {
    public static void main(String[] args) {
        char[][] grid = new char[][]{{'0', '1', '0'}, {'1', '0', '1'}, {'0', '1', '0'}};
        ConnectedComponent1 cc = new ConnectedComponent1();
        System.out.println(cc.numIslands(grid));
    }

    private int numIslands(char[][] grid) {
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

    private boolean isSafe(char[][] grid, int i, int j, boolean[][] visited) {
        return (i >= 0) && (i < grid.length) && (j >= 0) && (j < grid[0].length) && (grid[i][j] == '1' && !visited[i][j]);
    }


}
