package me.home.day14;

/**
 * Created by before30 on 2016. 1. 14..
 */
public class Difference {
    private int[] elements;
    public int maximumDifference;

    public Difference(int[] elements) {
        this.elements = elements;
    }

    public void computeDifference() {
        int max = Math.abs(elements[0] - elements[elements.length  - 1]);
        for (int x = 0; x < elements.length - 1; x++) {
            for (int y = x + 1; y < elements.length; y++) {
                int temp = Math.abs(elements[x] - elements[y]);
                if (temp > max) {
                    max = temp;
                }
            }
        }

        this.maximumDifference = max;
    }
}

