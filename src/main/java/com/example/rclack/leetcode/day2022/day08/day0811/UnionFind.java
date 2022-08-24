package com.example.rclack.leetcode.day2022.day08.day0811;

public class UnionFind {
    int root[];

    public UnionFind(int size) {
        root = new int[size];
        for (int i = 0; i < size; i++) {
            root[i] = i;
        }
    }

    public int find(int x) {
        return root[x];
    }

    public void union(int x, int y) {

    }
}
