package com.ilyachr.floodfill;

/**
 * 733. Flood Fill
 */
public class FloodFill {


    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int color = image[sr][sc];
        if (color != newColor)
            fillGrid(image, sr, sc, color, newColor);
        return image;
    }


    private void fillGrid(int[][] image, int sr, int sc, int color, int newColor) {
        if (image[sr][sc] == color) {
            image[sr][sc] = newColor;

            if (sr + 1 < image.length) {
                fillGrid(image, sr + 1, sc, color, newColor);
            }

            if (sr - 1 >= 0) {
                fillGrid(image, sr - 1, sc, color, newColor);
            }

            if (sc + 1 < image[0].length) {
                fillGrid(image, sr, sc + 1, color, newColor);
            }

            if (sc - 1 >= 0) {
                fillGrid(image, sr, sc - 1, color, newColor);
            }
        }
    }
}
