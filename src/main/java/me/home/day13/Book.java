package me.home.day13;

/**
 * Created by before30 on 2016. 1. 13..
 */
public abstract class Book {
    String title;
    String author;
    Book(String t,String a){
        title=t;
        author=a;
    }
    abstract void display();
}
