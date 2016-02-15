package me.home.day26;

import java.util.Scanner;

/**
 * Created by before30 on 2016. 1. 27..
 */
class LibraryDate {
    private final int date;
    private final int month;
    private final int year;

    public LibraryDate(int date, int month, int year) {
        this.date = date;
        this.month = month;
        this.year = year;
    }

    public int getDate() {
        return date;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public int getFine(LibraryDate expectedDate) {
        if (year < expectedDate.getYear() ||
                (year == expectedDate.getYear() && month < expectedDate.getMonth()) ||
                (year == expectedDate.getYear() && month == expectedDate.getMonth() && date < expectedDate.getDate())) {
            return 0;
        }

        if (year > expectedDate.getYear()) {
            return 10000;
        }
        if (month > expectedDate.getMonth()) {
            return (month - expectedDate.getMonth()) * 500;
        }
        if (date > expectedDate.getDate()) {
            return (date - expectedDate.getDate()) * 15;
        }
        return 0;
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LibraryDate returnDate = new LibraryDate(sc.nextInt(), sc.nextInt(), sc.nextInt());
        LibraryDate expectedDate = new LibraryDate(sc.nextInt(), sc.nextInt(), sc.nextInt());

        System.out.println(returnDate.getFine(expectedDate));
    }
}
