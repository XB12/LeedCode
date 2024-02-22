package org.example;

import java.util.Arrays;

public class _31 {
    public static void nextPermutation(int[] nums) {

        int i = nums.length-1;
        while(i-1>= 0 && nums[i] <= nums[i-1]){
            i--;
        }
        int j = nums.length-1;
        if(i-1 >= 0){
        while (j>0 && nums[j] <= nums[i-1]){
            j--;
        }
        swap(nums, i-1, j);
        }
        reverse(nums,i,nums.length-1);

    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {5,1,1};
        nextPermutation(nums);
    }
}
