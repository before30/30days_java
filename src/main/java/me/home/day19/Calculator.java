package me.home.day19;

/**
 * Created by before30 on 2016. 1. 20..
 */
public class Calculator implements AdvancedArithmetic {
	@Override public int divisorSum(int n) {
		int sum = 0;

		for (int i=1; i<=n; i++) {
			if (n % i == 0) sum += i;
		}
		return sum;
	}
}
