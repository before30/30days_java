package me.home.day05;

import java.util.Scanner;

/**
 * Created by before30 on 2016. 1. 5..
 */
public class Loops {
    public static int calc(int a, int b, int n) {
        int temp = 1;
        int result = 0;
        for (int i=0; i<n; i++) {
            result += temp * b;
            temp = temp * 2;
        }
        return a + result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();

            for (int j=1; j<=n; j++) {

                System.out.print(calc(a,b,j) + " ");
            }
            System.out.println();
        }
    }
}
