package me.home.ds.simplearraysum;

import java.util.Scanner;

/**
 * Created by before30 on 16. 2. 3..
 */
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum =0;
		for (int i=0; i<n; i++) {
			sum += sc.nextInt();
		}

		System.out.println(sum);
	}
}
