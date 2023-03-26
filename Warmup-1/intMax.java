package Warmup1;

/**
 Given three int values, a b c, return the largest.


 intMax(1, 2, 3) → 3
 intMax(1, 3, 2) → 3
 intMax(3, 2, 1) → 3
 **/

public class intMax {
    public int intMax(int a, int b, int c) {
        int[] age = {a, b, c};
        int max = age[0];
        for (int i = 1; i < age.length; i++) max = Math.max(max, age[i]);

        return max;
    }
}
