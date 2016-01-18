package me.home.quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by before30 on 2016. 1. 18..
 */
public class Solution {

	public static void traversal(int[][] map, int x, int y, int prev) {
		if (y >= map.length || y < 0 || x >= map[y].length || x < 0) {
			return;
		} else if (map[y][x] < prev + 1) {
			return;
		} else {
			map[y][x] = prev + 1;
			traversal(map, x+1, y, prev + 1);
			traversal(map, x-1, y, prev + 1);
			traversal(map, x, y+1, prev + 1);
			traversal(map, x, y-1, prev + 1);

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int width = sc.nextInt();
		sc.nextLine();
		int height = sc.nextInt();
		sc.nextLine();

		String xsLine = sc.nextLine();
		String[] xsArray = xsLine.split(" ");
		String ysLine = sc.nextLine();
		String[] ysArray = ysLine.split((" "));

		List<Point> points = new ArrayList<>();
		for (int i=0; i<xsArray.length; i++) {
			points.add(new Point(Integer.parseInt(xsArray[i]), Integer.parseInt(ysArray[i])));
		}

		int[][] map = new int[height][width];

		for (int i=0; i<map.length; i++) {
			for (int j=0; j<map[i].length; j++) {
				map[i][j] = Integer.MAX_VALUE;
			}
		}

		for (Point p : points) {
			map[p.getY()][p.getX()] = 0;
		}

		for (Point p : points) {
//			traversal(map, p.getX(), p.getY(), 0);
			int x = p.getX();
			int y = p.getY();
			traversal(map, x+1, y, 0);
			traversal(map, x-1, y, 0);
			traversal(map, x, y+1, 0);
			traversal(map, x, y-1, 0);
		}
		printMap(map);
	}

	public static void printMap(int[][] map) {
		for (int i=0; i<map.length; i++) {
			for (int j=0; j<map[i].length; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
	}
}
