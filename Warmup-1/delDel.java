package Warmup1;

/**
 Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. Otherwise, return the string unchanged.


 delDel("adelbc") → "abc"
 delDel("adelHello") → "aHello"
 delDel("adedbc") → "adedbc"
 **/

public class delDel {
    public String delDel(String str) {
        if (str.length() > 1 && str.charAt(1) == 'd') return (str.replace("del", ""));

        return str;

    }
}
