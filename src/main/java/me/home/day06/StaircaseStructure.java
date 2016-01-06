package me.home.day06;

import java.util.Scanner;

/**
 * Created by before30 on 2016. 1. 6..
 */
public class StaircaseStructure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();

        for (int i=1; i<=height; i++) {
            for (int j=1; j<=height; j++) {
                int x = height - i;
                if (x >= j)  System.out.print(" ");
                else System.out.print("#");

            }
            System.out.println();
        }
    }
}
