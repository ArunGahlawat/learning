package com.github.arungahlawat.learning.ps;

import java.util.HashMap;
import java.util.Map;

public class ArrayProblems {
    int[] data;

    public ArrayProblems(int... data) {
        this.data = data;
    }

    public void print() {
        for (int datum : data)
            System.out.printf("%2d\t", datum);
        System.out.println();
    }

    public void print(int[] array) {
        for (int datum : array)
            System.out.printf("%2d\t", datum);
        System.out.println();
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private int min(int a, int b) {
        return Math.min(a, b);
    }

    private int max(int a, int b) {
        return Math.max(a, b);
    }

    public int[] mergeTwoSortedArrays(int... secondSortedArray) {
        int firstArrayIndex = 0, secondArrayIndex = 0, mergedArrayIndex = 0;
        int[] mergedArray = new int[data.length + secondSortedArray.length];
        while (mergedArrayIndex < mergedArray.length) {
            if (firstArrayIndex < data.length && secondArrayIndex < secondSortedArray.length) {
                if (data[firstArrayIndex] <= secondSortedArray[secondArrayIndex]) {
                    mergedArray[mergedArrayIndex] = data[firstArrayIndex];
                    firstArrayIndex++;
                } else {
                    mergedArray[mergedArrayIndex] = secondSortedArray[secondArrayIndex];
                    secondArrayIndex++;
                }
            } else if (firstArrayIndex < data.length) {
                mergedArray[mergedArrayIndex] = data[firstArrayIndex];
                firstArrayIndex++;
            } else if (secondArrayIndex < secondSortedArray.length) {
                mergedArray[mergedArrayIndex] = secondSortedArray[secondArrayIndex];
                secondArrayIndex++;
            }
            mergedArrayIndex++;
        }
        return mergedArray;
    }

    public void moveAllKsToEndOfArray(int k) {
        int j = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] != k && data[j] == k) {
                swap(data, i, j);
            }
            if (data[j] != k)
                j++;
        }
    }

    public int[] findTwoSum(int target) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < data.length; i++) {
            if (numsMap.containsKey(target - data[i]))
                return new int[]{numsMap.get(target - data[i]), i};
            numsMap.put(data[i], i);
        }
        return new int[]{-1, -1};
    }

    public double findMedianOfTwoSortedArrays(int... secondSortedArray) {
        int mergedArrayLength = (data.length + secondSortedArray.length) / 2 + 1;
        int[] mergedArray = new int[mergedArrayLength];
        int firstArrayIndex = 0;
        int secondArrayIndex = 0;
        for (int i = 0; i < mergedArrayLength; i++) {
            if (firstArrayIndex < data.length && secondArrayIndex < secondSortedArray.length)
                if (data[firstArrayIndex] <= secondSortedArray[secondArrayIndex]) {
                    mergedArray[i] = data[firstArrayIndex];
                    firstArrayIndex++;
                } else {
                    mergedArray[i] = secondSortedArray[secondArrayIndex];
                    secondArrayIndex++;
                }
            else if (firstArrayIndex < data.length) {
                mergedArray[i] = data[firstArrayIndex];
                firstArrayIndex++;
            } else {
                mergedArray[i] = secondSortedArray[secondArrayIndex];
                secondArrayIndex++;
            }
        }
        double median = mergedArray[mergedArrayLength - 1];
        if ((data.length + secondSortedArray.length) % 2 == 0) {
            median = (median + mergedArray[mergedArrayLength - 2]) / 2.0;
        }
        return median;
    }

    public int findContainerWithMostWater() {
        int left = 0, right = data.length - 1, maxArea = 0;
        int width, minHeight;
        while (left < right) {
            width = right - left;
            minHeight = min(data[left], data[right]);
            int currentArea = width * minHeight;
            maxArea = max(currentArea, maxArea);
            if (data[left] <= data[right])
                left++;
            else
                right--;
        }
        return maxArea;
    }
}