package me.home.day19;

import java.util.Scanner;

/**
 * Created by before30 on 2016. 1. 20..
 */
public class Solution {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		AdvancedArithmetic myCalculator=new Calculator();
		int sum=myCalculator.divisorSum(n);
		System.out.println("I implemented: AdvancedArithmetic\n"+sum);
	}
}
