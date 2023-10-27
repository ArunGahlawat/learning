package com.github.arungahlawat.learning.ps.leetCode;

import java.util.*;

/*
Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:
    0 <= a, b, c, d < n
    a, b, c, and d are distinct.
    nums[a] + nums[b] + nums[c] + nums[d] == target
You may return the answer in any order.

Example 1:
    Input: nums = [1,0,-1,0,-2,2], target = 0
    Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]

Example 2:
    Input: nums = [2,2,2,2,2], target = 8
    Output: [[2,2,2,2]]

Constraints:
    * 1 <= nums.length <= 200
    * -10^9 <= nums[i] <= 10^9
    * -10^9 <= target <= 10^9
 */
public class P_18_FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i++) {
            for (int j = i + 1; j < nums.length - 2; j++) {
                int k = j + 1, l = nums.length - 1;
                while (k < l) {
                    long currentSum = (long) nums[i] + (long) nums[j] + (long) nums[k] + (long) nums[l];
                    if (currentSum == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                        k++;
                        l--;
                    } else if (currentSum < target)
                        k++;
                    else
                        l--;
                }
            }
        }
        return new ArrayList<>(result);
    }
}
