package me.home.day25;

import java.util.Scanner;

/**
 * Created by before30 on 2016. 1. 25..
 */
public class Solution {
    public static boolean isPrime(int n) {

        if (n==1) return false;
        for(int i=2;i<= Math.sqrt(n);i++) {
            if(n%i==0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i=0; i<n; i++) {

            if (isPrime(sc.nextInt())) {
                System.out.println("Prime");
            } else {
                System.out.println("Not prime");
            }
        }
    }
}
