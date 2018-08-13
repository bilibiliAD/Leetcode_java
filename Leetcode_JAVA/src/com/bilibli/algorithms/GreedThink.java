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
        Arrays.sort(points,(a,b) -> (a[1] - b[1]));
        int ret = 1;
        int point = points[0][1];
        for(int i = 1;i<points.length;i++){
            if(points[i][0]<=point){
                continue;
            }
            point = points[i][1];
            ret++;
        }
        return ret;

    }


}
