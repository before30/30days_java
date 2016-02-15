package me.home.algo;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by before30 on 16. 2. 15..
 */
public class BigSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int frontSum = 0;
		int rearSum = 0;
		for (int i=0; i<n; i++) {
			String input = sc.next();
			int front = 0;
			int rear = 0;

			if (input.length() > 9) {
				front = Integer.parseInt(input.substring(0, input.length() - 9));
				rear = Integer.parseInt(input.substring(input.length() -9));
			} else {
				rear = Integer.parseInt(input);
			}

			frontSum += front;
			rearSum += rear;
		}

		String result;
		if (frontSum > 0) {
			result = String.format("%d%09d", frontSum, rearSum);
		} else {
			result = String.format("%d", rearSum);
		}

		System.out.println(result);
	}
}
