package com.ilyachr.reversewordsinstring;

import java.util.Arrays;

public class ReverseWordsString {

    public String reverseWords(String s) {

        String[] words = s.split(" ");

        return Arrays.stream(words).map(StringBuilder::new).map(StringBuilder::reverse).reduce((str1, str2) -> {
            if (str1.isEmpty()) {
                return str2;
            } else {
                return str1.append(" ").append(str2);
            }
        }).orElse(new StringBuilder("")).toString();
    }
}
