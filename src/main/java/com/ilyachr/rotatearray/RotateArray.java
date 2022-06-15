package com.ilyachr.rotatearray;


import java.util.Set;
import java.util.TreeSet;

/**
 * 189. Rotate Array
 */
public class RotateArray {

    public void rotate(int[] nums, int k) {

        if (nums.length == 0 || k == 0) {
            return;
        }

        int currentPos = 0;
        int value = nums[getShiftLeftPosition(nums, k, currentPos)];

        Set<Integer> placed = new TreeSet<>();

        for (int i = 0; i < nums.length; i++) {

            int temp = nums[currentPos];

            nums[currentPos] = value;

            placed.add(currentPos);

            value = temp;

            currentPos = getShiftRightPosition(nums, k, currentPos);

            //если элемент массива на месте переходим к следующему элементу
            if (placed.contains(currentPos)) {
                currentPos = (currentPos == nums.length - 1) ? 0 : ++currentPos;
                value = nums[getShiftLeftPosition(nums, k, currentPos)];
            }
        }
    }


    /**
     * Возвращает позицию числа смещенного от currentPos на k элементов массива влево
     */
    public int getShiftLeftPosition(int[] nums, int k, int currentPos) {
        int shiftPos = currentPos - k;

        if (shiftPos >= 0) {
            return shiftPos;
        } else {
            return getShiftLeftPosition(nums, Math.abs(shiftPos), nums.length);
        }
    }

    /**
     * Возвращает позицию числа смещенного от currentPos на k элементов массива вправо
     */
    public int getShiftRightPosition(int[] nums, int k, int currentPos) {
        int shiftPos = currentPos + k;

        if (shiftPos < nums.length) {
            return shiftPos;
        } else {
            return getShiftRightPosition(nums, shiftPos - nums.length, 0);
        }
    }


}