package com.example.rclack.leetcode.day2022.day09.day0915;

public class UnionFind {

    int root[];

    public UnionFind(int size) {   // O(N)
        root = new int[size];
        for (int i = 0; i < size; i++) {
            root[i] = i;
        }
    }

    public int find(int x) {  // O(1)
        return root[x];
    }

    public void union(int x, int y) {  //O(N)

        int rootX = find(x);
        int rootY = find(y);
        if (rootX != rootY) {
            for (int i = 0; i < root.length; i++) {
                if (root[i] == rootY) {
                    root[i] = rootX;
                }
            }
        }
    }


    public boolean connected(int x, int y) {
        return find(x) == find(y);
    }


    public static void main(String[] args) {
        UnionFind uf = new UnionFind(10);
        uf.union(1, 2);
        uf.union(2, 5);

    }
}
