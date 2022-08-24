package com.example.rclack.leetcode.day2022.day04.day0626;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    int m, n;
    boolean[][] visited;

    public int numIslands(char[][] grid) {
        this.m = grid.length;
        this.n = grid[0].length;
        this.visited = new boolean[m][n];
        int ans = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {
                    bfs(grid, i, j, m, n);
                    ans++;
                }
            }
        }
        return ans;
    }

    public void bfs(char[][] grid, int row, int col, int m, int n) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{row, col});
        visited[row][col] = true;
        while (!queue.isEmpty()) {
            int[] tmp = queue.poll();
            int x = tmp[0];
            int y = tmp[1];
            for (int[] dir : dirs) {
                int nx = x + dir[0], ny = y + dir[1];
                if (nx >= 0 && ny >= 0 && nx < m && ny < n && grid[nx][nx] == '1' && !visited[nx][ny]) {
                    bfs(grid, nx, ny, m, n);
                }
            }
        }
    }

}
