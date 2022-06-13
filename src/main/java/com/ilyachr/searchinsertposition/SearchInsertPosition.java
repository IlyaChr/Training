package com.ilyachr.searchinsertposition;

public class SearchInsertPosition {


    public int searchInsert(int[] nums, int target) {

        if (nums.length == 0) {
            return 0;
        }

        return nums[nums.length - 1] < target ? nums.length : binarySearch(nums, 0, nums.length - 1, target);
    }


    private int binarySearch(int[] nums, int a, int b, int target) {

        int pos = b - (b - a) / 2;

        if (a == b || target == nums[pos]) {
            return pos;
        }

        if (b - a == 1) {
            if (target <= nums[a]) {
                return a;
            }
            if (target >= nums[b]) {
                return b;
            }
            return pos;
        }

        return (target > nums[pos]) ? binarySearch(nums, pos, b, target) : binarySearch(nums, a, pos, target);
    }


}
