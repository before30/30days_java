package me.home.day16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by before30 on 2016. 1. 16..
 */
public class Solution {
    public int a;
    public int b;

    public Solution(int a, int b) {
        if ( a > b ) {
            this.a = b;
            this.b = a;
        } else {
            this.a = a;
            this.b = b;
        }
    }

    public int diff() {
        return Math.abs(a - b);
    }

    public void print() {
        System.out.print(a + " " + b);
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> input = new ArrayList<>();
        for (int i=0; i<n; i++) {
            input.add(sc.nextInt());
        }

        input.sort((x, y) -> x>y?1:-1);

        int min = Integer.MAX_VALUE;
        List<Solution> minList = new ArrayList<>();

        for (int i=0; i<input.size() - 1; i++) {
                Solution pair = new Solution(input.get(i).intValue(), input.get(i+1).intValue());
                if (min > pair.diff()) {
                    minList.clear();
                    minList.add(pair);
                    min = pair.diff();
                } else if (min == pair.diff()) {
                    minList.add(pair);
                }

        }


//        minList.sort((pairA, pairB) -> {
//            if (pairA.a > pairB.a) {
//                return 1;
//            } else {
//                return -1;
//            }
//        });

        minList.forEach(x -> {
            x.print();
            System.out.print(" ");
        });

    }
}
