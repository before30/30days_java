package me.home.day22;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by before30 on 2016. 1. 24..
 */
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}

public class Solution {

    public static int getHeight(Node root){
        //Write your code here
        List<Node> list = new ArrayList<>();
        list.add(root);
        for (int i=1; ;i++) {
            List<Node> tempList = new ArrayList<>();
            for (Node node: list) {
                if (node.left != null) {
                    tempList.add(node.left);
                }

                if (node.right != null) {
                    tempList.add(node.right);
                }
            }
            list.clear();
            list.addAll(tempList);
            if (list.size() == 0) {
                return i;
            }
        }
    }

    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        int height=getHeight(root);
        System.out.println(height);
    }
}
