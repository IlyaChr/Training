package com.ilyachr.tinkoff;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void countPaths() {

        Main main = new Main();

        /*Assertions.assertEquals(0,main.countPaths(0));
        Assertions.assertEquals(1,main.countPaths(1));
        Assertions.assertEquals(2,main.countPaths(2));
        Assertions.assertEquals(3,main.countPaths(3));
        Assertions.assertEquals(16,main.countPaths(1597));
        Assertions.assertEquals(34,main.countPaths(8));
        Assertions.assertEquals(9227465,main.countPaths(34));*/
        Assertions.assertEquals(433494437,main.countPaths(42));
        Assertions.assertEquals(701408733,main.countPaths(43));

    }
}