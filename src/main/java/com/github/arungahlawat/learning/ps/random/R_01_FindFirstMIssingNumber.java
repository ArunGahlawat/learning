package com.github.arungahlawat.learning.ps.random;

import java.util.Arrays;

public class R_01_FindFirstMIssingNumber {
    public static void main(String[] args) {
        R_01_FindFirstMIssingNumber r01FindFirstMIssingNumber = new R_01_FindFirstMIssingNumber();
        int missingElement = r01FindFirstMIssingNumber.solution(new int[]{-5, -4, -3, -2, -1, -1, 0, 0, 1, 1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 7, 8, 10});
        System.out.println(missingElement);
    }

    private int binarySearch(int[] array, int left, int right, int num) {
        int mid = (left + right) / 2;
        if (array[mid] == num)
            return mid;
        if (mid == 0)
            return left;
        else if (array[mid] > num) {
            right = mid - 1;
            if (array[right] < num)
                return mid;
            return binarySearch(array, left, right, num);
        } else {
            left = mid + 1;
            if (array[left] > num) {
                return mid;
            }
            return binarySearch(array, left, right, num);
        }
    }

    public int solution(int[] array) {
        Arrays.sort(array);
        int smallIndex = binarySearch(array, 0, array.length - 1, 0);
        int missingElement = 0;
        while (smallIndex < array.length - 1) {
            if (array[smallIndex + 1] - array[smallIndex] > 1) {
                missingElement = array[smallIndex] + 1;
                break;
            }
            smallIndex++;
        }
        return missingElement;
    }
}
