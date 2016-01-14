package me.home.day13;

/**
 * Created by before30 on 2016. 1. 13..
 */
public class MyBook extends Book {
    private int price;

    public MyBook(String title, String author, int price) {
        super(title, author);
        this.price = price;
    }

    @Override
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}
