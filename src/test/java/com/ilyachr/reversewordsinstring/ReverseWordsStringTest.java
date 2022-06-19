package com.ilyachr.reversewordsinstring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseWordsStringTest {

    @Test
    void reverseWords() {

        ReverseWordsString reverseWordsString = new ReverseWordsString();

        assertEquals("s'teL ekat edoCteeL tsetnoc", reverseWordsString.reverseWords("Let's take LeetCode contest"));

        assertEquals("God Ding", reverseWordsString.reverseWords("doG gniD"));
    }
}