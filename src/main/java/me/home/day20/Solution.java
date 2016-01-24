package me.home.day20;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * Created by before30 on 2016. 1. 21..
 */
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        // ' ', '.', '?', '@', '\'', ',', '[', ']', '\\', '+', '/', '!', '_'


        String[] strings = line.split("[\\s!,?.\\\\_'@\\[\\]]+");
        List<String> list = new ArrayList<>();
        Stream.of(strings).filter(x->!"".equals(x)).forEach(x -> list.add(x));
        System.out.println(list.size());
        list.forEach(x -> {
            if (!"".equals(x))
                System.out.println(x);
        });

    }
}
