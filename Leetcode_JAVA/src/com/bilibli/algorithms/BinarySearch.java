package com.bilibli.algorithms;

/**
 * 二分查找
 */
public class BinarySearch {


    public int search(int key, int[] array) {
        int l = 0, h = array.length - 1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (key == array[mid]) {
                return mid;
            }
            if (key < array[mid]) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }


    public int mySqrt(int x) {
        if (x <= 1) {
            return x;
        }
        int l = 1, h = x;
        /*while (l < h) {
         * h应该等于mid;
         * 否则会跳过要查的数
         * */
        while (l <= h) {
            int mid = l + (h - l) / 2;
            int sqrt = x / mid;

            if (sqrt == mid) {
                return sqrt;
            }
            if (sqrt < mid) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return h;
    }


    /*
     * Arranging Coins (Easy)
     * 摆硬币
     * */
    public int arrangeCoins(int n) {
        int level = 1;
        if (n == 1) {
            return n;
        }
        while (0 < n) {
            n -= level;
            level++;
        }
        return n == 0 ? level - 1 : level - 2;
    }

    /*
    * Single Element in a Sorted Array (Medium)
    * 一个有序数组只有一个数不出现两次，找出这个数。
    1 1 2 3 3 4 4
    * */
    public int singleNonDuplicate(int[] nums) {
        int l = 0;
        int h = nums.length - 1;
        while (l < h) {
            int mid = l + (h - l) / 2;
            if (mid % 2 == 1) {
                mid--;
            }
            if(nums[mid]==nums[mid+1]){
                l = mid+2;
            }else {
                h = mid;
            }
        }
        return nums[l];
    }
}


