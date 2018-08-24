package com.bilibli.algorithms;

/*
 *   双指针
 * */
public class DoublePointer {

    /*
     * Input: numbers={2, 7, 11, 15}, target=9
     *从一个已经排序的数组中查找出两个数，使它们的和为 0
      *  Two Sum II - Input array is sorted (Easy)
      *  day 13  2018年8月24日 10:54:43
       * */
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        while (i < j) {
            int sum = numbers[i] + numbers[j];
            if (sum == target) {
                return new int[]{i + 1, j + 1};
//            } else if (sum < target) {
//            和比较目标大，应该移动较大的元素,使sum变小
            } else if (sum > target) {
                j--;
            } else {
                i++;
            }
        }
        return null;
    }

}
