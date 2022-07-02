package com.ilyachr.permutationstring;

import java.util.HashMap;
import java.util.Map;


/**
 * 567. Permutation in String
 */
public class PermutationString {

    /*public boolean checkInclusion(String s1, String s2) {

        char temp;
        StringBuilder stringBuilder;

        if (s2.contains(s1)){
            return true;
        }

        for (int i = 0; i < s1.length(); i++) {
            stringBuilder = new StringBuilder(s1);
            for (int j = 0; j < s1.length(); j++) {
                if (i != j){
                    temp = s1.charAt(i);
                    stringBuilder.setCharAt(i,s1.charAt(j));
                    stringBuilder.setCharAt(j,temp);
                    if (s2.contains(stringBuilder)){
                        return true;
                    }
                }
            }
        }
        return false;
    }*/

    public boolean checkInclusion(String s1, String s2) {

        for (int i = 0; i < s1.length(); i++) {
            char symbol = s1.charAt(i);

            int index = 0;

            while ((index = s2.indexOf(symbol, index)) != -1) {
                if (index + s1.length() <= s2.length()) {
                    boolean isAnagram = isAnagram(s2.substring(index, index + s1.length()), s1);
                    if (isAnagram) {
                        return true;
                    }
                }
                index++;
            }
        }

        return false;
    }

    public boolean isAnagram(String s1, String s2) {
        return s1.equals(s2) || getWordCounter(s1).equals(getWordCounter(s2));
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
