package com.ilyachr.reversestring;


/**
 * 344. Reverse String
 */
public class ReverseString {

    public void reverseString(char[] s) {

        if (s.length < 1) {
            return;
        }

        char temp;

        for (int i = 0, k = s.length - 1; i < s.length/2; i++, k--) {
            temp = s[i];
            s[i] = s[k];
            s[k] = temp;
        }

    }

}
