package com.ilyachr.longestsubstringwithoutrepeatingcharacters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    void lengthOfLongestSubstring() {

        LongestSubstringWithoutRepeatingCharacters repeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();

        assertEquals(3,repeatingCharacters.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1,repeatingCharacters.lengthOfLongestSubstring("bbbbb"));
        assertEquals(3,repeatingCharacters.lengthOfLongestSubstring("pwwkew"));
        assertEquals(6,repeatingCharacters.lengthOfLongestSubstring("abcdiff"));

    }
}