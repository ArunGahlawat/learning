package com.github.arungahlawat.learning.tests.ps;

import com.github.arungahlawat.learning.ps.ArrayProblems;
import org.testng.annotations.Test;

public class ArrayProblemTests {

    @Test(description = "Verify moving all 0's to end of array")
    public void verifyMovingAll0ToEnd() {
        ArrayProblems arrayProblems = new ArrayProblems(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 1, 0, 1, 9, 2, 3, 4);
        arrayProblems.moveAllKsToEndOfArray(1);
        arrayProblems.print();
    }

    @Test(description = "Verify finding two sum")
    public void verifyFindingTwoSum() {
        ArrayProblems arrayProblems = new ArrayProblems(4, 1, 9, 1, 3, 2, 2, 1);
        int target = 12;
        int[] indices = arrayProblems.findTwoSum(target);
        System.out.printf("Two sum indices for %d are %d, %d", target, indices[0], indices[1]);
    }

    @Test(description = "Verify finding median of 2 sorted arrays")
    public void verifyFindingMedianOfTwoSortedArrays() {
        ArrayProblems arrayProblems = new ArrayProblems(1, 4, 9, 11, 13, 21, 22, 31);
        double median = arrayProblems.findMedianOfTwoSortedArrays(4, 9, 15, 19, 24);
        System.out.printf("Median is %2f", median);
    }

    @Test(description = "Verify merging two sorted arrays")
    public void verifyMergingTwoSortedArrays() {
        ArrayProblems arrayProblems = new ArrayProblems(1, 4, 9, 11, 13, 21, 22, 31);
        int[] mergedArray = arrayProblems.mergeTwoSortedArrays(4, 9, 15, 19, 24);
        arrayProblems.print(mergedArray);
    }

    @Test(description = "Verify finding container with max water")
    public void verifyFindingContainerWithMaxWater() {
        ArrayProblems arrayProblems = new ArrayProblems(4, 1, 9, 1, 3, 2, 2, 1);
        int containerArea = arrayProblems.findContainerWithMostWater();
        System.out.println(containerArea);
    }
}
