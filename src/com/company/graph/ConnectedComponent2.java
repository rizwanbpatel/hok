package com.company.graph;

public class ConnectedComponent2 {
    public static void main(String[] args) {
        char[][] grid = new char[][]{{'1', '0', '1'}, {'1', '1', '1'}, {'0', '0', '1'}};
        System.out.println(numIslands(grid));
    }

    private static int numIslands(char[][] grid) {
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

    private static void DFS(char[][] grid, int i, int j, boolean[][] visited) {
        int[] rNbr = new int[]{-1, 0, 0, 1};
        int[] cNbr = new int[]{0, -1, 1, 0};
        visited[i][j] = true;
        for (int k = 0; k < 4; k++) {
            if (isSafe(grid, i + rNbr[k], j + cNbr[k], visited)) {
                DFS(grid, i + rNbr[k], j + cNbr[k], visited);
            }
        }
    }

    private static boolean isSafe(char[][] grid, int i, int j, boolean[][] visited) {
        return (i >= 0) && (j >= 0) && (i < grid.length) && (j < grid[0].length) && (grid[i][j] == '1' && !visited[i][j]);
    }


}
