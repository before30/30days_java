package me.home.algo;

import java.util.Scanner;

/**
 * Created by before30 on 16. 2. 15..
 */
public class DiagonalDifference {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] matrix = new int[n][n];

		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				int x = sc.nextInt();
				matrix[i][j] = x;
			}
		}

		int sum1 = 0;
		int sum2 = 0;
		for (int i=0; i<n; i++) {
			sum1 += matrix[i][i];
			sum2 += matrix[i][n-i-1];
		}

		System.out.println(Math.abs(sum1 - sum2));
	}

}
