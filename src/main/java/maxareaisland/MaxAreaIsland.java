package maxareaisland;

/**
 * 695. Max Area of Island
 */
public class MaxAreaIsland {

    public int maxAreaOfIsland(int[][] grid) {

        int maxSize = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                int cell = grid[i][j];
                if (cell == 1) {
                    int sizeOfIsland = sizeOfIsland(grid, i, j);
                    maxSize = Math.max(maxSize, sizeOfIsland);
                }
                grid[i][j] = 2;
            }
        }
        return maxSize;
    }


    private int sizeOfIsland(int[][] grid, int rowInd, int colInd) {

        int cell = grid[rowInd][colInd];

        if (cell == 1) {
            grid[rowInd][colInd] = 2;

            int size1 = 0;
            int size2 = 0;
            int size3 = 0;
            int size4 = 0;

            if (rowInd + 1 < grid.length) {
                size1 = sizeOfIsland(grid, rowInd + 1, colInd);
            }

            if (rowInd - 1 >= 0) {
                size2 = sizeOfIsland(grid, rowInd - 1, colInd);
            }

            if (colInd + 1 < grid[0].length) {
                size3 = sizeOfIsland(grid, rowInd, colInd + 1);
            }

            if (colInd - 1 >= 0) {
                size4 = sizeOfIsland(grid, rowInd, colInd - 1);
            }
            return 1 + size1 + size2 + size3 + size4;
        }
        return 0;
    }


}
