package com.example.rclack.leetcode.day2022.day11.day1107.two;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int countComponents(int n, int[][] edges) {
        // 构建图
        var adj = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList();
        }
        //无向图 ， 所以需要添加双向引用
        for (int[] edge : edges) {
            adj[edge[0]].add(edge[1]);
            adj[edge[1]].add(edge[0]);
        }
        int count = 0;
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(adj, i, visited);
                count++;
            }
        }
        return count;
    }

    private void dfs(List<Integer>[] adj, int u, boolean[] visited) {
        visited[u] = true;
        List<Integer> successors = adj[u];
        for (int successor : successors) {
            if (!visited[successor]) {
                dfs(adj, successor, visited);
            }
        }
    }
}






















