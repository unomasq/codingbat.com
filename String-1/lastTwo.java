package String1;

/**Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding" yields "codign".


 lastTwo("coding") → "codign"
 lastTwo("cat") → "cta"
 lastTwo("ab") → "ba"
 **/
public class lastTwo {
    public String lastTwo(String str) {
        if (str.length() <= 1) return str;
        String back = str.substring(str.length() - 1, str.length());

        String front = str.substring(str.length() - 2, str.length() - 1);

        return (str.substring(0, str.length() - 2) + back + front);

    }
}

