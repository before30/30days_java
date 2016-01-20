package me.home.day18;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by before30 on 2016. 1. 18..
 */
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // read the string s.
        String s = sc.nextLine();

        // create the Palindrome class object p.
        Palindrome p = new Palindrome();
        char arr[]=s.toCharArray();//Converting string to a character array
        // push all the characters of string s to stack.
        for (char c : arr) {
            p.pushCharacter(c);
        }

        // enqueue all the characters of string s to queue.
        for (char c : arr) {
            p.enqueueCharacter(c);
        }

        boolean f = true;

        // pop the top character from stack.
        // dequeue the first character from queue.
        // compare both the characters.
        for (int i = 0; i < s.length(); i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                f = false;

                break;
            }
        }

        // finally print whether string s is palindrome or not.
        if (f) {
            System.out.println("The word, "+s+", is a palindrome.");
        } else {
            System.out.println("The word, "+s+", is not a palindrome.");
        }
    }

    private char dequeueCharacter() {
        return queue.poll();
    }

    private char popCharacter() {
        return stack.pop();
    }

    private Stack<Character> stack = new Stack<>();
    private Queue<Character> queue = new ArrayDeque<>();

    private void enqueueCharacter(char c) {
        queue.add(c);
    }

    private void pushCharacter(char c) {
        stack.push(c);
    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String line = sc.nextLine();
//        Stack<Character> stack = new Stack<>();
//        boolean flag = true;
//
//        for (int i=0; i<line.length()/2; i++) {
//            stack.push(line.charAt(i));
//        }
//
//        for (int i=(line.length()+1)/2; i<line.length(); i++) {
//            if (stack.pop() != line.charAt(i)) {
//                flag = false;
//                break;
//            }
//        }
//
//        if (flag) {
//            System.out.println("The word, " + line + ", is a palindrome.");
//        } else {
//            System.out.println("The word, " + line + ", is not a palindrome.");
//        }
//    }
}
