package com.ilyachr.permutationstring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermutationStringTest {

    @Test
    void checkInclusion() {
        PermutationString permutationString = new PermutationString();
        //assertTrue(permutationString.checkInclusion("ab","eidbaooo"));
        assertFalse(permutationString.checkInclusion("ab","eidboaoo"));
        assertTrue(permutationString.checkInclusion("abo","eidbaooo"));
    }

    @Test
    void checkInclusion2() {
        PermutationString permutationString = new PermutationString();
        assertTrue(permutationString.checkInclusion("a","ab"));
    }

    @Test
    void checkInclusion3() {
        PermutationString permutationString = new PermutationString();
        assertTrue(permutationString.checkInclusion("abc","bbbca"));
    }

}