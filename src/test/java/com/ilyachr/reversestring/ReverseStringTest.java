package com.ilyachr.reversestring;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseStringTest {

    @Test
    void reverseString() {

        ReverseString reverseString = new ReverseString();


        char[] str = {'h', 'e', 'l', 'l', 'o'};

        reverseString.reverseString(str);

        assertEquals(Stream.of("o", "l", "l", "e", "h").reduce(String::concat).get(), new String(str));

    }
}