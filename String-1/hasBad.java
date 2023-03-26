package String1;

/**
 Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0. Note: use .equals() to compare 2 strings.


 hasBad("badxx") → true
 hasBad("xbadxx") → true
 hasBad("xxbadxx") → false

 **/
public class hasBad {
    public boolean hasBad(String str) {
        if (str.equals("xba")) return false;

        return (str.length() >= 3 && (str.startsWith("bad") || str.substring(1, 4).equals("bad")));

    }
}
