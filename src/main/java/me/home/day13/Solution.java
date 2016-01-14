package me.home.day13;

import java.util.Scanner;

/**
 * Created by before30 on 2016. 1. 13..
 */
public class Solution {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        String title=sc.nextLine();
        String author=sc.nextLine();
        int price=sc.nextInt();
        Book new_novel=new MyBook(title,author,price);
        new_novel.display();

    }
}
