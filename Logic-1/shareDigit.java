/**
 *
 Given two ints, each in the range 10..99, return true if there is a digit that appears in both numbers, such as the 2 in 12 and 23.
 (Note: division, e.g. n/10, gives the left digit while the % "mod" n%10 gives the right digit.)


 shareDigit(12, 23) → true
 shareDigit(12, 43) → false
 shareDigit(12, 44) → false
 * **/

public class shareDigit {
    public boolean shareDigit(int a, int b) {
        int f_a = a / 10;
        int f_b = b / 10;
        int b_a = a % 10;
        int b_b = b % 10;

        if (f_a == f_b || b_a == b_b || f_a == b_b || f_b == b_a) return true;
        return false;

    }

}
