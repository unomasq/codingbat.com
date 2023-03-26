package String1;

/**
 Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.


 nonStart("Hello", "There") → "ellohere"
 nonStart("java", "code") → "avaode"
 nonStart("shotl", "java") → "hotlava"
 **/
public class nonStart {
    public String nonStart(String a, String b) {
        String c = a.substring(1, a.length());
        String d = b.substring(1, b.length());

        return c + d;
    }
}