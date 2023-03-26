package String1;

/**
 Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.


 lastChars("last", "chars") → "ls"
 lastChars("yo", "java") → "ya"
 lastChars("hi", "") → "h@"
 **/
public class lastChars {
    public String lastChars(String a, String b) {
        String a_first;
        String b_last;

        if (a.length() != 0) a_first = a.substring(0, 1);
        else a_first = "@";

        if (b.length() != 0) b_last = b.substring(b.length() - 1, b.length());
        else b_last = "@";

        return a_first + b_last;

    }
}
