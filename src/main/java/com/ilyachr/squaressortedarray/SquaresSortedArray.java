package com.ilyachr.squaressortedarray;


import java.util.LinkedList;
import java.util.List;

/**
 * 977. Squares of a Sorted Array
 */
public class SquaresSortedArray {

    public int[] sortedSquares(int[] nums) {

        List<Integer> negativeNumbers = new LinkedList<>();

        List<Integer> positiveNumbers = new LinkedList<>();

        for (int num : nums) {
            if (num < 0) {
                negativeNumbers.add(0, num * num);
            } else {
                positiveNumbers.add(num * num);
            }
        }

        return mergeSortedArrays(negativeNumbers.stream().mapToInt(i -> i).toArray(), positiveNumbers.stream().mapToInt(i -> i).toArray());
    }


    public int[] mergeSortedArrays(int[] arrayOne, int[] arrayTwo) {

        if (arrayTwo.length == 0) {
            return arrayOne;
        }

        if (arrayOne.length == 0) {
            return arrayTwo;
        }


        int[] result = new int[arrayOne.length + arrayTwo.length];

        for (int i = 0, j = 0, k = 0; i < result.length; i++) {

            if (k == arrayTwo.length || (j != arrayOne.length && arrayOne[j] < arrayTwo[k])) {
                result[i] = arrayOne[j++];
            } else if (j == arrayOne.length || arrayOne[j] >= arrayTwo[k]) {
                result[i] = arrayTwo[k++];
            }

        }
        return result;
    }

}
