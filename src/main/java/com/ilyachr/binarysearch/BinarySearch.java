package com.ilyachr.binarysearch;


/**
 * 704. Binary Search
 */
public class BinarySearch {

    public int search(int[] nums, int target) {

        return nums.length == 0 ? -1 : findInMidle(nums, 0, nums.length, target);
    }

    private int findInMidle(int[] nums, int a, int b, int target) {

        if (b - a == 0 || b - a == 1) {

            if (target == nums[a]) {
                return a;
            }

            return -1;
        }


        int result = nums[b - (b - a) / 2];

        if (result == target) {
            return b - (b - a) / 2;
        }

        return target < result ? findInMidle(nums, a, b - (b - a) / 2, target) : findInMidle(nums, b - (b - a) / 2, b, target);
    }

}
