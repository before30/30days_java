package me.home.day07;

import java.util.Scanner;

/**
 * Created by before30 on 2016. 1. 7..
 */
public class ReverseOrder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }

        for (int i=n-1; i>=0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
