package me.home.algo;

import java.util.Scanner;

/**
 * Created by before30 on 16. 2. 15..
 */
public class PlusMinus {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int np = 0;
		int nn = 0;
		int nz = 0;

		for (int i=0; i<n; i++) {
			int x = sc.nextInt();
			if (x > 0) {
				np++;
			} else if (x < 0) {
				nn++;
			} else {
				nz++;
			}
		}

		System.out.printf("%f\n", (double)np/n);
		System.out.printf("%f\n", (double)nn/n);
		System.out.printf("%f\n", (double)nz/n);
	}
}
