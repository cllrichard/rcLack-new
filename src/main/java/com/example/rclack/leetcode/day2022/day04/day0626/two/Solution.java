package com.example.rclack.leetcode.day2022.day04.day0626.two;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    private final static int[][] DIRECTIONS = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public static void main(String[] args) {
        new Solution().maxAreaOfIsland(new int[][]{ {0, 0, 0, 1, 0, 1, 0, 0}});
    }

    public int maxAreaOfIsland(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        boolean[][] visited = new boolean[rows][cols];

        int maxArea = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1 && !visited[i][j]) {
                    maxArea = Math.max(maxArea, bfs(grid, i, j, rows, cols, visited));
                }
            }
        }
        return maxArea;
    }

    /**
     *
     * @param grid
     * @param i
     * @param j
     * @param rows
     * @param cols
     * @param visited
     * @return
     */
    private int bfs(int[][] grid, int i, int j, int rows, int cols, boolean[][] visited) {
        int count = 0;
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{i, j});
        visited[i][j] = true;
        while (!queue.isEmpty()) {
            int[] front = queue.poll();
            int curX = front[0];
            int curY = front[1];
            count++;
            for (int[] direction : DIRECTIONS) {
                int newX = curX + direction[0];
                int newY = curY + direction[1];
                if (inArea(newX, newY, rows, cols) && grid[newX][newY] == 1 && !visited[newX][newY]) {
                    queue.offer(new int[]{newX, newY});
                    visited[newX][newY] = true;
                }
            }
        }
        return count;
    }

    private boolean inArea(int i, int j, int rows, int cols) {
        return i >= 0 && i < rows && j >= 0 && j < cols;
    }

}
