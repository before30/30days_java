package me.home.day27;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by before30 on 2016. 1. 28..
 */
public class Solution {
	public static List<Integer> arrivals(Scanner sc, int count) {
		List<Integer> list = new ArrayList<>();
		for (int i=0; i<count; i++) {
			list.add(sc.nextInt());
		}

		return list;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int tc = sc.nextInt();
		for (int i=0; i<tc; i++) {
			int count = sc.nextInt();
			int threshold = sc.nextInt();
			List<Integer> arrivalTimes = arrivals(sc, count);
			if (threshold <= arrivalTimes.stream().filter(time -> time > 0).count()) {
				System.out.println("No");
			} else {
				System.out.println("Yes");
			}
		}

		System.out.println("5");
		// yes
		System.out.println("4 3");
		System.out.println("-1 0 4 2");

		// no
		System.out.println("5 2");
		System.out.println("0 -1 2 1 4");

		// yes
		System.out.println("8 7");
		System.out.println("0 -5 1 -2 -3 -4 -2 -3");

		System.out.println("7 2");
		System.out.println("0 -1 2 1 4 5 -2");

		System.out.println("10 9");
		System.out.println("-5 -4 -3 -2 -1 0 1 2 3 4");

//		System.out.println("5");
//		// yes
//		System.out.println("4 3");
//		System.out.println("-1 0 4 2");
//
//		// no
//		System.out.println("5 2");
//		System.out.println("0 -1 2 1 4");
//
//		// yes
//		System.out.println("6 4");
//		System.out.println("0 -3 1 -1 -2 2");
//
//		// no
////		System.out.println("7 1");
////		System.out.println("0 -4 1 2 3 4 5");
//		System.out.println("7 2");
//		System.out.println("1 -1 2 1 4 5 -2");
//
//		// yes
//		System.out.println("8 5");
//		System.out.println("0 -5 1 -2 -3 4 2 3");

	}
}
