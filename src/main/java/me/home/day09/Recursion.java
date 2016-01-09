package me.home.day09;

import java.util.Scanner;

/**
 * Created by before30 on 2016. 1. 9..
 */
public class Recursion {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //Take Input
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd=find_gcd(a,b);
        System.out.println(gcd);
    }
    static  int find_gcd(int a,int b){
        //Write the base condition
        if ( a == b ) {
            return a;
        }
        return find_gcd(Math.max(a,b) - Math.min(a,b), Math.min(a, b));
    }
}
