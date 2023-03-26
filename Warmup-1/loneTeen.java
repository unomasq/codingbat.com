package Warmup1;

/**
 We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int values, return true if one or the other is teen, but not both.


 loneTeen(13, 99) → true
 loneTeen(21, 19) → true
 loneTeen(13, 13) → false
 **/

public class loneTeen {
    public boolean loneTeen(int a, int b) {

        boolean at = (a >= 13 && a <= 19);
        boolean bt = (b >= 13 && b <= 19);

        return ((at && !bt) || (!at && bt));

    }
}
