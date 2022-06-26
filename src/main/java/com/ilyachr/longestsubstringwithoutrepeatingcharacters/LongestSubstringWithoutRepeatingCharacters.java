package com.ilyachr.longestsubstringwithoutrepeatingcharacters;


/**
 * 3. Longest Substring Without Repeating Characters
 */
public class LongestSubstringWithoutRepeatingCharacters {


    public int lengthOfLongestSubstring(String s) {

        StringBuilder currentWord;
        String currentChar;
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            currentWord = new StringBuilder();

            for (int j = i; j < s.length(); j++) {
                currentChar = String.valueOf(s.charAt(j));
                if (currentWord.indexOf(currentChar) == -1) {
                    currentWord.append(currentChar);
                } else {
                    break;
                }
            }
            if (currentWord.length() > maxLength) {
                maxLength = currentWord.length();
            }
        }

        return maxLength;
    }

}
