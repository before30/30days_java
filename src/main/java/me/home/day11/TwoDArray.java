package me.home.day11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by before30 on 2016. 1. 11..
 */
public class TwoDArray {
    public static int getHourglasse(int arr[][], int startX, int startY) {
        return
                arr[startX][startY] +
                arr[startX][startY+1] +
                arr[startX][startY+2] +
                arr[startX+1][startY+1] +
                arr[startX+2][startY] +
                arr[startX+2][startY+1] +
                arr[startX+2][startY+2];
    }

    public static int getHourglases(int arr[][]) {
        List<Integer> hourglasses = new ArrayList<Integer>();
        for (int i=0; i<4; i++) {
            for (int j=0; j<4; j++) {
                hourglasses.add(getHourglasse(arr, i, j));
            }
        }

        return hourglasses.stream().max(Integer::compare).get();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }

        System.out.println(getHourglases(arr));
    }
}
