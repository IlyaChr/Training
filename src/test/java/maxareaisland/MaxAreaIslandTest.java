package maxareaisland;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

class MaxAreaIslandTest {

    @Test
    @Order(value = 1)
    void maxAreaOfIsland() {

        MaxAreaIsland maxAreaIsland = new MaxAreaIsland();

        int[][] array = {
                {0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}};

        Assertions.assertEquals(6,maxAreaIsland.maxAreaOfIsland(array));
    }


    @Test
    @Order(value = 2)
    void maxAreaOfIsland2() {

        MaxAreaIsland maxAreaIsland = new MaxAreaIsland();

        int[][] array = {{1}};

        Assertions.assertEquals(1,maxAreaIsland.maxAreaOfIsland(array));
    }

    @Test
    @Order(value = 3)
    void maxAreaOfIsland3() {

        MaxAreaIsland maxAreaIsland = new MaxAreaIsland();

        int[][] array = {{0}};

        Assertions.assertEquals(0,maxAreaIsland.maxAreaOfIsland(array));
    }
}