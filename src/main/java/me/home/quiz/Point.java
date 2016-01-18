package me.home.quiz;

/**
 * Created by before30 on 2016. 1. 18..
 */
public class Point {
	private int x;
	private int y;


	public Point(int x, int y) {
		this.x = x - 1;
		this.y = y - 1;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	@Override public String toString() {
		return String.format("X(%d), Y(%d)", x, y);
	}
}
