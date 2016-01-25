package me.home.ds.arrays;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by before30 on 2016. 1. 24..
 */

class DA {
    private final int n;
    private ArrayList<Integer>[]  sequences;

    private int lastans = 0;
    public DA(int n) {
        this.n = n;
        sequences = new ArrayList[n];
        for (int i=0; i<n; i++) {
            sequences[i] = new ArrayList<Integer>();
        }

    }

    public void insert(int x, int y) {
        if (n==0) return;
        int idx = (x ^ lastans) % n;
        sequences[idx].add(y);
    }

    public void print(int x, int y) {
        if (n==0) return;
        int idx = (x ^ lastans) % n;
        ArrayList<Integer> list = sequences[idx];
        System.out.println(list.get(y % list.size()));
        lastans = list.size();
    }
}

public class DynamicArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();

        DA da = new DA(n);

        for (int i=0; i<q; i++) {
            int command = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (command == 1) {
                da.insert(x, y);
            } else {
                da.print(x, y);
            }
        }
    }
}
