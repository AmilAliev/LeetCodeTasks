package com.leetcode.easy;

public class LC3190_MinimumOperationsToMakeAllElementsDivisibleByThree {
    public int minimumOperations(int[] nums) {
        int res = 0;
        for (int num : nums) {
            if (num % 3 != 0) res++;
        }
        return res;
    }
}
