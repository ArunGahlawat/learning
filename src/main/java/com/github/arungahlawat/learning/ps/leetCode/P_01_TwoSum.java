package com.github.arungahlawat.learning.ps.leetCode;

import com.github.arungahlawat.learning.sorting.QuickSort;

import java.util.HashMap;
import java.util.Map;

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
Example 1:
    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:
    Input: nums = [3,2,4], target = 6
    Output: [1,2]
Example 3:
    Input: nums = [3,3], target = 6
    Output: [0,1]

Constraints:
    * 2 <= nums.length <= 10^4
    * -10^9 <= nums[i] <= 10^9
    * -10^9 <= target <= 10^9
    * Only one valid answer exists.
Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
*/
public class P_01_TwoSum {
    public int[] findTwoSumUsingBruitForce(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target)
                    return new int[]{i, j};
            }
        }
        System.out.print("Not found");
        return new int[]{-1};
    }

    // This method can't be used if we need indices. because after sorting indices will change
    public int[] findTwoSumUsingTwoPointersOnSortedArray(int[] nums, int target) {
        QuickSort quickSort = new QuickSort(nums);
        quickSort.sort();
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target)
                return new int[]{nums[left], nums[right]};
            else if (sum < target)
                left++;
            else
                right--;
        }
        System.out.print("Not found");
        return new int[]{-1};
    }

    public int[] findTwoSumUsingHashTable(int[] nums, int target) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numsMap.containsKey(target - nums[i]))
                return new int[]{numsMap.get(target - nums[i]), i};
            numsMap.put(nums[i], i);
        }
        return new int[]{-1};
    }
}
