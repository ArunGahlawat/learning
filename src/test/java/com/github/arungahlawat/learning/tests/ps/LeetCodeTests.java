package com.github.arungahlawat.learning.tests.ps;

import com.github.arungahlawat.learning.dataStructures.LinkedList;
import com.github.arungahlawat.learning.dataStructures.Node;
import com.github.arungahlawat.learning.ps.ArrayProblems;
import com.github.arungahlawat.learning.ps.leetCode.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LeetCodeTests {
    @BeforeMethod()
    public void beforeMethod() {
        System.out.println("===============================================");
    }

    @Test(description = "01 Two Sum : Using bruit force",
            dataProvider = "TwoSumTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            threadPoolSize = 10,
            groups = {"LC01", "Arrays", "Two Sum"})
    public void findTwoSumUsingBruitForce(int[] nums, int target) {
        ArrayProblems arrayProblems = new ArrayProblems();
        System.out.print("Input array: ");
        arrayProblems.print(nums);
        System.out.printf("Target: %d\n", target);
        P_01_TwoSum p01TwoSum = new P_01_TwoSum();
        int[] twoSum = p01TwoSum.findTwoSumUsingBruitForce(nums, target);
        if (twoSum.length == 2) {
            System.out.print("Result indices: ");
            arrayProblems.print(twoSum);
        }
    }

    @Test(description = "01 Two Sum : Using two pointers on sorted array",
            dataProvider = "TwoSumTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            threadPoolSize = 10,
            groups = {"LC01", "Arrays", "Two Sum"})
    public void findTwoSumUsingTwoPointersInSortedArray(int[] nums, int target) {
        ArrayProblems arrayProblems = new ArrayProblems();
        System.out.print("Input array: ");
        arrayProblems.print(nums);
        System.out.printf("Target: %d\n", target);
        P_01_TwoSum p01TwoSum = new P_01_TwoSum();
        int[] twoSum = p01TwoSum.findTwoSumUsingTwoPointersOnSortedArray(nums, target);
        if (twoSum.length == 2) {
            System.out.print("Result : ");
            arrayProblems.print(twoSum);
        }
    }

    @Test(description = "01 Two Sum : Using hashtable",
            dataProvider = "TwoSumTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            threadPoolSize = 10,
            groups = {"LC01", "Arrays", "Two Sum"})
    public void findTwoSumUsingHashtable(int[] nums, int target) {
        ArrayProblems arrayProblems = new ArrayProblems();
        System.out.print("Input array: ");
        arrayProblems.print(nums);
        System.out.printf("Target: %d\n", target);
        P_01_TwoSum p01TwoSum = new P_01_TwoSum();
        int[] twoSum = p01TwoSum.findTwoSumUsingHashTable(nums, target);
        if (twoSum.length == 2) {
            System.out.print("Result indices: ");
            arrayProblems.print(twoSum);
        }
    }

    @Test(description = "02 Add Two Numbers : Find sum of two numbers represented in linked list in reverse order",
            dataProvider = "AddTwoNumbersTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            threadPoolSize = 10,
            groups = {"LC02", "Linked Lists", "Add Two Numbers"})
    public void addTwoNumbers(int[] first, int[] second) {
        LinkedList firstLinkedList = new LinkedList(first);
        System.out.print("First list: ");
        firstLinkedList.print();
        LinkedList secondLinkedList = new LinkedList(second);
        System.out.print("Second list: ");
        secondLinkedList.print();
        P_02_AddTwoNumbers p02AddTwoNumbers = new P_02_AddTwoNumbers();
        LinkedList result = p02AddTwoNumbers.addTwoNumbers(firstLinkedList, secondLinkedList);
        System.out.print("Result list: ");
        result.print();
    }

    @Test(description = "02 Add Two Numbers : 04 Find sum of two numbers represented in linkedlist in reverse order",
            dataProvider = "AddTwoNumbersTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            threadPoolSize = 10,
            groups = {"LC02", "Linked Lists", "Add Two Numbers"})
    public void addTwoNumbersUsingNodes(int[] first, int[] second) {
        LinkedList firstLinkedList = new LinkedList(first);
        System.out.print("First list: ");
        firstLinkedList.print();
        LinkedList secondLinkedList = new LinkedList(second);
        System.out.print("Second list: ");
        secondLinkedList.print();
        P_02_AddTwoNumbers p02AddTwoNumbers = new P_02_AddTwoNumbers();
        Node result = p02AddTwoNumbers.addTwoNumbers(firstLinkedList.getHead(), secondLinkedList.getHead());
        System.out.print("Result list: ");
        LinkedList resultList = new LinkedList();
        resultList.setHead(result);
        resultList.print();
    }

    @Test(description = "03 Longest Substring Without Repeating Characters : Find length of longest substring without duplicate chars",
            dataProvider = "LongestSubstringTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            threadPoolSize = 10,
            groups = {"LC03", "Strings", "Longest Substring Without Repeating Characters"})
    public void findLengthOfLongestSubstring(String input) {
        P_03_LongestSubstringWithoutRepeatingChars p03LongestSubstringWithoutRepeatingChars = new P_03_LongestSubstringWithoutRepeatingChars();
        int length = p03LongestSubstringWithoutRepeatingChars.lengthOfLongestSubstring(input);
        System.out.printf("Input: %s\n", input);
        System.out.printf("Length of longest substring: %s\n", length);
    }

    @Test(description = "03 Longest Substring Without Repeating Characters : Find length of longest substring without duplicate chars",
            dataProvider = "LongestSubstringTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            threadPoolSize = 10,
            groups = {"LC03", "Strings", "Longest Substring Without Repeating Characters"})
    public void findLengthOfLongestSubstringUsingCharTable(String input) {
        P_03_LongestSubstringWithoutRepeatingChars p03LongestSubstringWithoutRepeatingChars = new P_03_LongestSubstringWithoutRepeatingChars();
        int length = p03LongestSubstringWithoutRepeatingChars.lengthOfLongestSubstring2(input);
        System.out.printf("Input: %s\n", input);
        System.out.printf("Length of longest substring: %s\n", length);
    }

    @Test(description = "04 Median of Two Sorted Arrays : Find median of 2 sorted arrays",
            dataProvider = "MedianOfSortedArraysTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            threadPoolSize = 10,
            groups = {"LC04", "Strings", "Median of Two Sorted Arrays"})
    public void findMedianOfTwoSortedArrays(int[] nums1, int[] nums2) {
        P_04_MedianOfTwoSortedArrays p_04_medianOfTwoSortedArrays = new P_04_MedianOfTwoSortedArrays();
        ArrayProblems arrayProblems = new ArrayProblems();
        System.out.print("First array:");
        arrayProblems.print(nums1);
        System.out.print("Second array:");
        arrayProblems.print(nums2);
        double median = p_04_medianOfTwoSortedArrays.findMedianSortedArrays(nums1, nums2);
        System.out.printf("Median: %2f\n", median);
    }

    @Test(description = "05 Longest Palindromic Substring : Find longest palindromic substring",
            dataProvider = "LongestPalindromeSubstringTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            threadPoolSize = 10,
            groups = {"LC05", "Strings", "Longest Palindromic Substring"})
    public void findLongestPalindromicSubstring(String input) {
        P_05_LongestPalindromicSubstring p05LongestPalindromicSubstring = new P_05_LongestPalindromicSubstring();
        System.out.printf("Input: %s\n", input);
        String longestPalindromicSubstring = p05LongestPalindromicSubstring.longestPalindrome(input);
        System.out.printf("Longest palindromic substring: %s\n", longestPalindromicSubstring);
    }

    @Test(description = "06 Zigzag Conversion : Get string in zigzag conversion",
            dataProvider = "ZigzagConversionTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            threadPoolSize = 10,
            groups = {"LC06", "Strings", "Zigzag Conversion"})
    public void convertStringInZigZag(String s, int numRows) {
        P_06_ZigzagConversion p06ZigzagConversion = new P_06_ZigzagConversion();
        System.out.printf("Input string: '%s' rows: %d\n", s, numRows);

        String convertedString = p06ZigzagConversion.convert(s, numRows);
        System.out.printf("Converted string: '%s'\n", convertedString);
    }

    @Test(description = "07 Reverse Integer : Reverse the given integer",
            dataProvider = "ReverseIntegerTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.ArrayDataProviders.class,
            threadPoolSize = 10,
            groups = {"LC07", "Numbers", "Reverse Integer"})
    public void reverseInteger(int x) {
        P_07_ReverseInteger p07ReverseInteger = new P_07_ReverseInteger();
        System.out.printf("Input number: %d\n", x);
        int convertedNumber = p07ReverseInteger.reverse(x);
        System.out.printf("Reverted number: %d\n", convertedNumber);
    }
}
