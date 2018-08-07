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


}
