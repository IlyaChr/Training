package com.ilyachr.validanagram;

import java.util.HashMap;
import java.util.Map;


/**
 * 242. Valid Anagram
 */
public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        return wordCount(s).equals(wordCount(t));
    }

    private Map<String, Integer> wordCount(String s) {
        Map<String, Integer> wordCount = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            wordCount.compute(String.valueOf(s.charAt(i)), (key, value) -> {
                if (value == null) {
                    return 1;
                }
                return ++value;
            });
        }
        return wordCount;
    }

}
