package me.home.day08;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by before30 on 2016. 1. 8..
 */
public class Dict {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        Map<String, Integer> dic = new HashMap();

        for (int i=0; i<n; i++) {
            String key = in.nextLine();
            int value = Integer.parseInt(in.nextLine());

            dic.put(key, value);
        }

        while (in.hasNextLine()) {
            String query = in.nextLine();
            if (dic.containsKey(query)) {
                System.out.println(query + "=" + dic.get(query));
            } else {
                System.out.println("Not found");
            }
        }
    }
}
