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
}
