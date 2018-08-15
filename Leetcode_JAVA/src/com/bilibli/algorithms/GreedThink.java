package com.bilibli.algorithms;

import java.util.Arrays;

/*
 *       贪心思想
 * */
public class GreedThink {
    /*
    * 分配饼干
      Assign Cookies (Easy)
     day4
    * */
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0;
        int j = 0;
        if (i < g.length && j < s.length) {
            // if (g[i] > s[j])    孩子的需求要小于饼干的大小，被满足
            if (g[i] <= s[j]) {
                //  j++;  孩子被满足，故移动到下一个孩子
                i++;
            }
            j++;     //不管孩子有没有被满足，饼干总要向后走
        }
//        return j;    应该返回i（孩子的个数）。而不是饼干的个数
        return i;
    }


    /*
    * 投飞镖刺破气球
     Minimum Number of Arrows to Burst Balloons
      day6
    * */
    public int findMinArrowShots(int[][] points) {
        if (points.length == 0) {
            return 0;
        }
        Arrays.sort(points, (a, b) -> (a[1] - b[1]));
        int ret = 1;
        int point = points[0][1];
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] <= point) {
                continue;
            }
            point = points[i][1];
            ret++;
        }
        return ret;

    }

    /*
    *股票的最大收益
     Best Time to Buy and Sell Stock II (Easy)
    day7
    * */
    public int maxProfit(int[] prices) {
        //假设数组是有序的，prices[i] <= prices[i+1]
        int profit = 0;
//        for (int i = 0; i < prices.length; i++) {
        //后面的减去前面的如果大于0
        for (int i = 1; i < prices.length; i++) {
//            if (prices[i +1 ] - prices[i] > 0) {
            if (prices[i] - prices[i - 1] > 0) {
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }

    /*
       *种植花朵
        Can Place Flowers (Easy)
       day8
       * */
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int cnt = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            //  if (i == 0) { //如果已经种花，则跳过当前这株
            if (flowerbed[i] == 1) {
                continue;
            }
            //判断花朵前后是不是0（有空位）
            int pre = i == 0 ? 0 : flowerbed[i - 1];
//            int next = i == flowerbed.length - 1 ? flowerbed[i + 1] : 0;
//            如果i到达尾端则next设置为0
            int next = i == flowerbed.length - 1 ? 0 : flowerbed[i + 1];
            //如果有空位，则可以插入花朵
            if (pre == 0 && next == 0) {
                cnt++;
                flowerbed[i] = 1;
            }
        }
        return cnt >= n;
    }


}

