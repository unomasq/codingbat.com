package String1;

/**
 Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and otherwise return the string unchanged.


 withoutX("xHix") → "Hi"
 withoutX("xHi") → "Hi"
 withoutX("Hxix") → "Hxi"
 **/
public class withoutX {
    public String withoutX(String str) {
        if (str.length() > 0 && str.charAt(0) == 'x') str = str.substring(1, str.length());
        if (str.length() > 0 && str.charAt(str.length() - 1) == 'x') str = str.substring(0, str.length() - 1);

        return str;
    }
}
