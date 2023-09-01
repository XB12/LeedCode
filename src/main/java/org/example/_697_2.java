package org.example;

import java.util.HashMap;

public class _697_2 {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, int[]> map = new HashMap();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (!map.containsKey(nums[i])) { //新出现的数据添加到map中
                map.put(nums[i], new int[]{1, i, i});//nums[i] 值 1（出现次数） i(起始位置) i（终止位置）
            } else {//原本有的数据更改信息
                map.get(nums[i])[0]++; //出现次数加一
                map.get(nums[i])[2] = i;//终止位置改变

            }
        }
        int degree = 0;
        int res = 0;
        for (int[] value : map.values()) {
            if (value[0] > degree) {//valeue[0]出现的次数
                degree = value[0];
                res = value[2] - value[1] + 1;
            } else if (value[0] == degree) {
                res = Math.min(value[2] - value[1] + 1, res);
            }
        }


        return res;
    }


}