package com.ilyachr.floodfill;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * 733. Flood Fill
 */
public class FloodFill {

    private static class Position {
        int sr;
        int sc;

        public Position(int sr, int sc) {
            this.sr = sr;
            this.sc = sc;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Position position = (Position) o;
            return sr == position.sr && sc == position.sc;
        }

        @Override
        public int hashCode() {
            return Objects.hash(sr, sc);
        }
    }

    private final Set<Position> positionSet = new HashSet<>();

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        positionSet.add(new Position(sr, sc));
        fillGrid(image, sr, sc, color);
        return image;
    }


    private void fillGrid(int[][] image, int sr, int sc, int color) {

        int colorCurrentCell = image[sr][sc];

        if (sr + 1 < image.length && !positionSet.contains(new Position(sr + 1, sc)) && image[sr + 1][sc] == colorCurrentCell) {
            positionSet.add(new Position(sr + 1, sc));
            fillGrid(image, sr + 1, sc, color);
            image[sr + 1][sc] = color;
        }

        if (sr - 1 >= 0 && !positionSet.contains(new Position(sr - 1, sc)) && image[sr - 1][sc] == colorCurrentCell) {
            positionSet.add(new Position(sr - 1, sc));
            fillGrid(image, sr - 1, sc, color);
            image[sr - 1][sc] = color;
        }

        if (sc + 1 < image[0].length && !positionSet.contains(new Position(sr, sc + 1)) && image[sr][sc + 1] == colorCurrentCell) {
            positionSet.add(new Position(sr, sc + 1));
            fillGrid(image, sr, sc + 1, color);
            image[sr][sc + 1] = color;
        }

        if (sc - 1 >= 0 && !positionSet.contains(new Position(sr, sc - 1)) && image[sr][sc - 1] == colorCurrentCell) {
            positionSet.add(new Position(sr, sc - 1));
            fillGrid(image, sr, sc - 1, color);
            image[sr][sc - 1] = color;
        }

        image[sr][sc] = color;
    }
}
