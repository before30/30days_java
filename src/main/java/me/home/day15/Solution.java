package me.home.day15;

import java.util.Scanner;

/**
 * Created by before30 on 2016. 1. 16..
 */
public class Solution {
    public static  Node insert(Node head,int data)
    {
        if (head == null) {
            head = new Node(data);
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = new Node(data);
        }
        return head;
    }

    public static void display(Node head)
    {
        Node start=head;
        while(start!=null)
        {
            System.out.print(start.data+" ");
            start=start.next;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Node head=null;
        int N=sc.nextInt();
        while(N-->0){
            int ele=sc.nextInt();
            head=insert(head,ele);
        }
        display(head);

    }
}
