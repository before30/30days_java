package me.home.day17;

/**
 * Created by before30 on 2016. 1. 17..
 */
public class Calculator {
    public int power(int n, int p) throws Exception {
        if (n < 0 || p < 0) {
            throw new Exception("n and p should be non-negative");
        }

        return (int)Math.pow((double)n, (double)p);
    }
}
