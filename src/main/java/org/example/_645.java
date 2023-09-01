package org.example;

import java.util.Arrays;

public class _645 {

    public static int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int[] result = new int[2];
        int i = 0;
        int flag = 0;
        for (int j = 0; j < nums.length-1; j++) {
            if(j< nums.length -1 && nums[j+1] == nums[j]) {
                result[0] = nums[j];
                for (int k = j+1; k < nums.length-1; k++) {
                    nums[k]= nums[k+1];
                }
                nums[nums.length-1] = -1;
            }
        }
        while (flag == 0) {
            if (nums[i] != i + 1) {
                result[1] = i + 1;
                flag = 1;
            }
            i++;
        }

        return result;
    }

    public static void main(String[] args) {
//        int[] nums = {3, 2, 2};
//        int[] nums = {3, 2, 3,4,6,5};
//        int[] nums = {1,5,3,2,2,7,6,4,8,9};
        int[] nums = {1,1};
//        int[] nums = {3, 2, 2};
        for (int i = 0; i <findErrorNums(nums).length ; i++) {
            System.out.println(findErrorNums(nums)[i]);
        }
    }

}
