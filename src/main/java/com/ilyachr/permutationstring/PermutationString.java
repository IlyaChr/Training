package com.ilyachr.permutationstring;

import java.util.HashMap;
import java.util.Map;


/**
 * 567. Permutation in String
 */
public class PermutationString {

    public boolean checkInclusion(String s1, String s2) {

        Map<String, Integer> s1WordCounter = getWordCounter(s1);

        for (int i = 0; i < s1.length(); i++) {
            char symbol = s1.charAt(i);

            int index = 0;

            while ((index = s2.indexOf(symbol, index)) != -1) {
                if (index + s1.length() <= s2.length()) {
                    boolean isAnagram = isAnagram(s2.substring(index, index + s1.length()), s1, s1WordCounter);
                    if (isAnagram) {
                        return true;
                    }
                }
                index++;
            }
        }

        return false;
    }

    public boolean isAnagram(String s2, String s1, Map<String, Integer> s1WordCounter) {
        return s1.equals(s2) || getWordCounter(s2).equals(s1WordCounter);
    }

    private Map<String, Integer> getWordCounter(String str) {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            map.compute(String.valueOf(str.charAt(i)), (key, value) ->
                    value == null ? 1 : value + 1
            );
        }
        return map;
    }

}
