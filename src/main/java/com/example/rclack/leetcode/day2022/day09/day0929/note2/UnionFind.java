package com.example.rclack.leetcode.day2022.day09.day0929.note2;

public class UnionFind {

    int root[];
    int rank[];

    public UnionFind(int size) {
        root = new int[size];
        rank = new int[size];
        for (int i = 0; i < size; i++) {
            root[i] = i;
            rank[i] = 1;
        }
    }

    public int find(int x) {
        while (x != root[x]) {
            x = root[x];
        }
        return x;
    }

    public void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
        if (rootX != rootY) {
            if (rank[rootX] > rank[rootY]) {
                root[rootY] = rootX;
            } else if (rank[rootX] < rank[rootY]) {
                root[rootX] = rootY;
            }else {
                root[rootY] = rootX;
            }
        }
    }

    public boolean connected(int x, int y) {
        return find(x) == find(y);
    }
}
