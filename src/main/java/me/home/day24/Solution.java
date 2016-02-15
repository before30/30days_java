package me.home.day24;

import java.util.Scanner;

/**
 * Created by before30 on 2016. 1. 24..
 */
class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }

}

public class Solution {
    public static Node removeDuplicates(Node head) {
        Node newHead = null;

        Node now = head;
        Node prev = null;
        while(now!=null) {
            if (prev == null || (prev != null && prev.data != now.data)) {
                newHead = insert(newHead, now.data);
            }
            prev = now;
            now=now.next;
        }

        return newHead;
    }

    public static  Node insert(Node head,int data)
    {
        Node p=new Node(data);
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else
        {
            Node start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;

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
        int T=sc.nextInt();
        while(T-->0){
            int ele=sc.nextInt();
            head=insert(head,ele);
        }
        head=removeDuplicates(head);
        display(head);

    }
}
