package com.example.rclack.leetcode.day2022.day03.day0416.tow;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {

    public static void main(String[] args) {
//        Assert.notNull(null, "Registry must not be null");
//        Assert.notNull(null, "Registry must not be null");

        new Solution().countComponents(5, new int[][]{{0, 1}, {1, 2}, {3, 4}});
    }

    public int countComponents(int n, int[][] edges) {
        //第 1 步：构建图
        List<Integer>[] adj = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
        }
        // 无向图，所以需要添加双向引用
        for (int[] edge : edges) {
            adj[edge[0]].add(edge[1]);
            adj[edge[1]].add(edge[0]);
        }

        // 开始广度优先遍历
        int res = 0;
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                bfs(adj, i, visited);
                res++;
            }
        }
        return res;
    }

    private void bfs(List<Integer>[] adj, int u, boolean[] visited) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(u);
        visited[u] = true;

        while (!queue.isEmpty()) {
            Integer front = queue.poll();
            // 获得队首结点的所有后继结点
            List<Integer> successors = adj[front];
            for (int successor : successors) {
                if (!visited[successor]) {
                    queue.offer(successor);
                    visited[successor] = true;
                }
            }
        }
    }
}
