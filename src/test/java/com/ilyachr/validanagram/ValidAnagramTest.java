package com.ilyachr.validanagram;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidAnagramTest {

    @Test
    void isAnagram() {
        ValidAnagram validAnagram = new ValidAnagram();

        Assertions.assertTrue(validAnagram.isAnagram("anagram","nagaram"));

        Assertions.assertFalse(validAnagram.isAnagram("rat","cat"));
    }
}