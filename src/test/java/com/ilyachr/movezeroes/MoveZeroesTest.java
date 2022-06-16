package com.ilyachr.movezeroes;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class MoveZeroesTest {

    @Test
    void moveZeroes() {

        MoveZeroes moveZeroes = new MoveZeroes();

        int[] array = {0,1,0,3,12};

        moveZeroes.moveZeroes(array);

        assertEquals(Arrays.asList(1,3,13,0,0), Arrays.stream(array).boxed().collect(Collectors.toList()));

    }
}