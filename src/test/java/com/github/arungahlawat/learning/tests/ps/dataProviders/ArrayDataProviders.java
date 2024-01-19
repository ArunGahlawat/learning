package com.github.arungahlawat.learning.tests.ps.dataProviders;

import org.testng.annotations.DataProvider;

public class ArrayDataProviders {
    @DataProvider(name = "TwoSumTestData")
    public Object[][] getTwoSumTestData() {
        return new Object[][]{
                {new int[]{1, 2, 3}, 3},
                {new int[]{2, 2, 6}, 4},
                {new int[]{0, 2, 6}, 6},
                {new int[]{0, 2, 6, 9, 1, 13}, 14},
                {new int[]{0, 2, 6, 9, 1, 13}, 16},
        };
    }

    @DataProvider(name = "AddTwoNumbersTestData")
    public Object[][] getAddTwoNumbersTestData() {
        return new Object[][]{
                {new int[]{1, 2, 3}, new int[]{9, 7, 9}}
        };
    }

    @DataProvider(name = "LongestSubstringTestData")
    public Object[] getLongestSubstringTestData() {
        return new Object[]{
                "aabbcd",
                "abcabcbb",
                "bbbbb",
                "pwwkew",
                "",
                " ",
                "au",
                "tmmzuxt"
        };
    }

    @DataProvider(name = "MedianOfSortedArraysTestData")
    public Object[][] getMedianOfSortedArraysTestData() {
        return new Object[][]{
                {new int[]{}, new int[]{2, 3}},
                {new int[]{1, 3}, new int[]{2}},
                {new int[]{1, 2}, new int[]{3, 4}},
                {new int[]{1, 2, 3, 4, 5, 6, 7, 8}, new int[]{4}}
        };
    }

    @DataProvider(name = "LongestPalindromeSubstringTestData")
    public Object[] getLongestPalindromeSubstringTestData() {
        return new Object[]{
                "heahaehxtxheahhzo",
                "hi naman",
                "oh hi naman ih!",
                "",
                " ",
                "a"
        };
    }

    @DataProvider(name = "ZigzagConversionTestData")
    public Object[][] getZigzagConversionTestData() {
        return new Object[][]{
                {"PAYPALISHIRING", 3},
                {"PAYPALISHIRING", 4},
                {"A", 1},
        };
    }

    @DataProvider(name = "RansomNoteTestData")
    public Object[][] getRansomNoteTestData() {
        return new Object[][]{
                {"a", "b"},
                {"aa", "ab"},
                {"aa", "aab"},
                {"hello", "helloworld"},
                {"hi", "ohhibuddy"},
        };
    }

    @DataProvider(name = "ReverseIntegerTestData")
    public Object[] getReverseIntegerTestData() {
        return new Object[]{
                1,
                123456789,
                1999999999,
                1999999990,
                -2147483648,
                2147483647,
                -846384741,
                -1,
                0,
                -121,
                121
        };
    }

    @DataProvider(name = "StringToIntegerTestData")
    public Object[] getStringToIntegerTestData() {
        return new Object[]{
                "42",
                "   -42",
                "4193 with words",
                "words and 987",
                "+1",
                "+-1",
                "++1",
                "--1",
                "  --1",
                "  - 1",
                "2147483648",
                "2147483647",
                "-2147483648",
                "-2147483649",
                "-2147483647",
                "-6147483648"
        };
    }

    @DataProvider(name = "PalindromeNumberTestData")
    public Object[] getPalindromeNumberTestData() {
        return new Object[]{
                1,
                123456789,
                1999999999,
                1999999990,
                -2147483648,
                2147483647,
                -846384741,
                -1,
                0,
                -121,
                121,
                1234554321,
                123454321,
        };
    }

    @DataProvider(name = "ContainerWithMaxWaterTestData")
    public Object[] getContainerWithMaxWaterTestData() {
        return new Object[]{
                new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7},
                new int[]{1, 1},
        };
    }

    @DataProvider(name = "IntegerToRomanTestData")
    public Object[] getIntegerToRomanTestData() {
        return new Object[]{
                9913,
                3,
                58,
                1994,
                20000
        };
    }

    @DataProvider(name = "RomanToIntegerTestData")
    public Object[] getRomanToIntegerTestData() {
        return new Object[]{
                "III",
                "LVIII",
                "MCMXCIV"
        };
    }


    @DataProvider(name = "LetterCombinationOfANumberTestData")
    public Object[] getLetterCombinationOfANumberTestData() {
        return new Object[]{
                "234",
                "23",
                "2",
                "",
                "2345",
                "79",
                "798",
                "7985"
        };
    }

    @DataProvider(name = "LongestCommonPrefixTestData")
    public Object[] getLongestCommonPrefixTestDataTestData() {
        return new Object[][]{
                {"arun", "aru", "arunk", "arunkum"},
                {"flower", "flow", "flight"},
                {"dog", "racecar", "car"},
        };
    }

    @DataProvider(name = "ThreeSumTestData")
    public Object[] getThreeSumTestDataTestData() {
        return new Object[]{
                new int[]{-1, 0, 1, 2, -1, -4},
                new int[]{0, 1, 1},
                new int[]{0, 0, 0},
                new int[]{0, 0, 0, 0},
        };
    }

    @DataProvider(name = "ThreeSumClosestTestData")
    public Object[] getThreeSumClosestTestData() {
        return new Object[][]{
                {new int[]{-1, 2, 1, -4}, 1},
                {new int[]{-12, -2, 10, -4, -18, 20, 2, 0}, 1},
                {new int[]{0, 0, 0}, 0},
        };
    }

    @DataProvider(name = "FourSumTestData")
    public Object[] getFourSumTestData() {
        return new Object[][]{
                {new int[]{1, 0, -1, 0, -2, 2}, 0},
                {new int[]{2, 2, 2, 2, 2}, 8},
                {new int[]{0, 0, 0}, 0},
                {new int[]{0, 0, 0, 0}, 0},
                {new int[]{-2, -5, -6, 0, 2, 4, 6, 1, 12, 3, 9, 2, 8, 1}, 8},
                {new int[]{1000000000, 1000000000, 1000000000, 1000000000}, -294967296},
        };
    }

    @DataProvider(name = "RemoveNthNodeTestData")
    public Object[][] getRemoveNthNodeTestData() {
        return new Object[][]{
                {new int[]{1, 2, 3, 4, 5}, 2},
                {new int[]{1, 2, 3, 4, 5}, 1},
                {new int[]{1, 2, 3, 4, 5}, 5},
                {new int[]{1}, 1},
                {new int[]{1, 2}, 1},
                {new int[]{1, 2}, 2},
        };
    }

    @DataProvider(name = "MiddleOfTheLinkedListTestData")
    public Object[] getMiddleOfTheLinkedListTestData() {
        return new Object[]{
                new int[]{1, 2, 3, 4},
                new int[]{},
                new int[]{1},
                new int[]{1, 2, 3, 4, 5},
                new int[]{1, 2, 3, 4, 5, 6},
                new int[]{1, 2},
        };
    }

    @DataProvider(name = "LinkedListCycleTestData")
    public Object[] getLinkedListCycleTestData() {
        return new Object[]{
                new int[]{1, 2, 3, 4, 5, 6},
                new int[]{1, 2, 3, 4, 5, 5},
                new int[]{1, 2, 3, 4, 5, 4},
                new int[]{1, 2, 3, 4, 5, 3},
                new int[]{1, 1},
                new int[]{1},
                new int[]{-1, 1},
                new int[]{0, 0},
                new int[]{1, 0, 1},
                new int[]{6, 5, 4, 3, 2, 1},
                new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 3},
                new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 9},
                new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 1},
        };
    }

    @DataProvider(name = "ValidParenthesesTestData")
    public Object[] getValidParenthesesTestData() {
        return new Object[]{
                "()",
                "()[]{}",
                "(]",
                "{[()]}",
                "]",
                "(",
        };
    }

    @DataProvider(name = "MergeTwoSortedListsTestData")
    public Object[][] getMergeTwoSortedListsTestData() {
        return new Object[][]{
                {new int[]{1, 2, 4}, new int[]{1, 3, 4}},
                {new int[]{}, new int[]{}},
                {new int[]{}, new int[]{0}},
                {new int[]{1, 2, 3}, new int[]{4}},
                {new int[]{1, 2, 3}, new int[]{4, 5, 6, 7, 8}},
        };
    }

    @DataProvider(name = "MergeKSortedListsTestData")
    public Object[][] getMergeKSortedListsTestData() {
        return new Object[][]{
                {new int[]{1, 2, 3}, new int[]{3, 4}, new int[]{5}, new int[]{6, 7, 8}, new int[]{9, 10, 11}},
                {new int[]{1, 4, 5}, new int[]{1, 3, 4}, new int[]{2, 6}},
                {new int[]{1, 2, 3}},
                {new int[]{}},
        };
    }

    @DataProvider(name = "SwapNodesInPairsTestData")
    public Object[] getSwapNodesInPairsTestData() {
        return new Object[]{
                new int[]{1, 2, 3, 4},
                new int[]{},
                new int[]{1},
                new int[]{1, 2, 3, 4, 5},
                new int[]{1, 2, 3, 4, 5, 6},
                new int[]{1, 2},
        };
    }

    @DataProvider(name = "RemoveDuplicatesFromSortedArrayTestData")
    public Object[][] getRemoveDuplicatesFromSortedArrayTestData() {
        return new Object[][]{
                {new int[]{}},
                {new int[]{1}},
                {new int[]{1, 1, 2}},
                {new int[]{1, 2, 3}},
                {new int[]{1, 2, 2, 3}},
                {new int[]{1, 2, 2, 3, 3}},
                {new int[]{1, 1, 1, 1}},
                {new int[]{-100, -100, -100, -100, -99, -98, -97, 97, 98, 99, 100, 100, 100}},
        };
    }

    @DataProvider(name = "RemoveElementTestData")
    public Object[][] getRemoveElementTestData() {
        return new Object[][]{
                {new int[]{}, 0},
                {new int[]{1}, 1},
                {new int[]{1}, 2},
                {new int[]{1, 1, 2}, 1},
                {new int[]{1, 2, 3}, 0},
                {new int[]{1, 2, 2, 3}, 1},
                {new int[]{1, 2, 2, 3, 3}, 2},
                {new int[]{1, 1, 1, 1}, 1},
                {new int[]{-100, -100, -100, -100, -99, -98, -97, 97, 98, 99, 100, 100, 100}, -97},
        };
    }

    @DataProvider(name = "MergeSortedArrayTestData")
    public Object[][] getMergeSortedArrayTestData() {
        return new Object[][]{
                {new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3},
                {new int[]{1, 0, 0, 0}, 1, new int[]{2, 5, 6}, 3},
                {new int[]{1}, 1, new int[]{}, 0},
                {new int[]{0}, 0, new int[]{1}, 1},
        };
    }

    @DataProvider(name = "MaxConsecutiveOnesTestData")
    public Object[] getMaxConsecutiveOnesTestData() {
        return new Object[]{
                new int[]{1, 1, 0, 1, 1, 1},
                new int[]{1, 0, 1, 1, 0, 1},
                new int[]{0, 0, 0, 0},
                new int[]{1, 0, 0, 1},
                new int[]{0, 1, 1, 0, 0, 1, 1},
                new int[]{1},
                new int[]{1, 1, 1, 1},
        };
    }

    @DataProvider(name = "NumbersWithEvenNumberOfDigitsTestData")
    public Object[] getNumbersWithEvenNumberOfDigitsTestData() {
        return new Object[]{
                new int[]{12, 345, 2, 6, 7896},
                new int[]{555, 901, 482, 1771},
                new int[]{0, 0, 0, 0},
                new int[]{1},
        };
    }

    @DataProvider(name = "SortedSquaresTestData")
    public Object[] getSortedSquaresTestData() {
        return new Object[]{
                new int[]{-4, -1, 0, 3, 10},
                new int[]{-7, -3, 2, 3, 11},
                new int[]{-7, -3, -2, -1},
                new int[]{0, 1, 2, 3, 4, 5},
                new int[]{-2, 2},
                new int[]{-10000, -9999, -7, -5, 0, 0, 10000},
        };
    }

    @DataProvider(name = "DuplicateZerosTestData")
    public Object[] getDuplicateZerosTestData() {
        return new Object[]{
                new int[]{1, 0, 2, 3, 0, 4, 5, 0},
                new int[]{1, 2, 3},
                new int[]{1, 2, 3, 0},
                new int[]{0, 1, 2, 3},
                new int[]{0},
        };
    }

    @DataProvider(name = "CheckNAndDoubleTestData")
    public Object[] getCheckNAndDoubleTestData() {
        return new Object[]{
                new int[]{10, 2, 5, 3},
                new int[]{3, 1, 7, 11},
                new int[]{-10, 5, 4},
        };
    }

    @DataProvider(name = "CheckMountainArrayTestData")
    public Object[] getCheckMountainArrayTestData() {
        return new Object[]{
                new int[]{0, 2, 3, 4, 5, 2, 1, 0},
                new int[]{0, 2, 3, 3, 5, 2, 1, 0},
                new int[]{2, 1},
                new int[]{3, 5, 5},
                new int[]{0, 3, 2, 1},
                new int[]{0, 3, 2, 3, 5, 3, 2, 1, 0},
                new int[]{0, 3, 2},
                new int[]{0, 1, 0},
        };
    }

    @DataProvider(name = "ReplaceWithGreatestTestData")
    public Object[] getReplaceWithGreatestTestData() {
        return new Object[]{
                new int[]{17, 18, 5, 4, 6, 1},
                new int[]{400},
                new int[]{17, 18},
                new int[]{17, 16},
                new int[]{0, 0, 0, 0},
                new int[]{17, 17, 17, 17, 17},
                new int[]{0, 3, 0},
                new int[]{-10, 1, 10},
        };
    }

    @DataProvider(name = "MoveZerosTestData")
    public Object[] getMoveZerosTestData() {
        return new Object[]{
                new int[]{0, 1, 0, 3, 12},
                new int[]{0},
                new int[]{-15, 0, -18, 0, 0, 14, 12, 9, 0, 2},
        };
    }

    @DataProvider(name = "SortArrayByParityTestData")
    public Object[] getSortArrayByParityTestData() {
        return new Object[]{
                new int[]{3, 1, 2, 4},
                new int[]{0},
                new int[]{0, 2, 4, 6, 8, 10, 12, 14},
                new int[]{1, 3, 5, 7, 9, 11},
                new int[]{1, 3, 5, 7, 9, 11, 2},
                new int[]{1, 0, 2, 4, 6, 8, 10, 12, 14},
                new int[]{1, 0, 3, 2, 5, 4, 7, 6, 9, 8, 10, 12, 14},
        };
    }

    @DataProvider(name = "HeightCheckerTestData")
    public Object[] getHeightCheckerTestData() {
        return new Object[]{
                new int[]{1, 1, 4, 2, 1, 3},
                new int[]{5, 1, 2, 3, 4},
                new int[]{1, 2, 3, 4, 5},
                new int[]{1, 1, 2, 3, 3, 4, 4, 6, 6},
        };
    }

    @DataProvider(name = "ThirdMaxNumberTestData")
    public Object[] getThirdMaxNumberTestData() {
        return new Object[]{
                new int[]{1, -2147483648, 2},
                new int[]{3, 2, 1},
                new int[]{1, 2, 3, 4, 5, 6, 7, 7, 6, 5, 4, 8, 9, 8, 11, 2},
                new int[]{1, 2},
                new int[]{2, 2, 3, 1},
                new int[]{Integer.MIN_VALUE, -1800, 0, 1800, Integer.MAX_VALUE},
                new int[]{1, 2, Integer.MIN_VALUE},
                new int[]{1, Integer.MIN_VALUE, 2},
                new int[]{1, Integer.MIN_VALUE, Integer.MIN_VALUE},
                new int[]{1, Integer.MIN_VALUE, Integer.MIN_VALUE, 0},
                new int[]{1, Integer.MIN_VALUE, Integer.MIN_VALUE, 0, 2},
                new int[]{Integer.MIN_VALUE, 1, Integer.MIN_VALUE},
                new int[]{Integer.MIN_VALUE, 1, 0, Integer.MIN_VALUE, -2},
                new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE},
                new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, 0, 1, -2, 4},
                new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE, 1},
                new int[]{Integer.MIN_VALUE, 1, 1},
        };
    }

    @DataProvider(name = "FindMissingNumbersTestData")
    public Object[] getFindMissingNumbersTestData() {
        return new Object[]{
                new int[]{1, 1, 1, 1, 1},
                new int[]{1},
                new int[]{4, 3, 2, 7, 8, 2, 3, 1},
                new int[]{1, 1},
                new int[]{1, 2, 3, 4, 5, 6, 7, 8, 10, 10},
                new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1},
                new int[]{10, 9, 9, 7, 7, 7, 6, 3, 2, 2},
        };
    }

    @DataProvider(name = "RunningSumOfOneDArrayTestData")
    public Object[] getRunningSumOfOneDArrayTestData() {
        return new Object[]{
                new int[]{1, 1, 1, 1, 1},
                new int[]{1},
                new int[]{4, 3, 2, 7, 8, 2, 3, 1},
                new int[]{1, 1},
                new int[]{1, 2, 3, 4, 5, 6, 7, 8, 10, 10},
                new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1},
                new int[]{10, 9, 9, 7, 7, 7, 6, 3, 2, 2},
        };
    }

    @DataProvider(name = "MinimumNumberGameTestData")
    public Object[] getMinimumNumberGameTestData() {
        return new Object[]{
                new int[]{5, 4, 2, 3},
                new int[]{2, 5},
        };
    }

    @DataProvider(name = "AddTwoNumberTestData")
    public Object[][] getAddTwoNumberTestData() {
        return new Object[][]{
                {3, 3},
                {1, 2},
        };
    }

    @DataProvider(name = "FizzBuzzTestData")
    public Object[] getFizzBuzzTestData() {
        return new Object[]{
                3,
                5,
                15,
                23
        };
    }

    @DataProvider(name = "NumberOfStepsToReduceANumberToZeroTestData")
    public Object[] getNumberOfStepsToReduceANumberToZeroTestData() {
        return new Object[]{
                14,
                8,
                123,
                0
        };
    }

    @DataProvider(name = "RichestCustomerWealthTestData")
    public Object[][] getRichestCustomerWealthTestData() {
        return new Object[][]{
                {new int[]{1, 2, 4}, new int[]{1, 3, 4}},
                {new int[]{}, new int[]{}},
                {new int[]{0}, new int[]{0}},
                {new int[]{1, 2, 3}, new int[]{4, 3, 1}},
                {new int[]{1, 2, 3, 4, 5}, new int[]{4, 5, 6, 7, 8}},
        };
    }

    @DataProvider(name = "OddEvenLinkedListTestData")
    public Object[] getOddEvenLinkedListTestData() {
        return new Object[]{
                new int[]{1, 2, 3, 4, 5},
                new int[]{1, 2},
                new int[]{1, 2, 3},
                new int[]{1, 2, 3, 4},
                new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12},
                new int[]{1},
                new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26},
        };
    }

    @DataProvider(name = "PalindromeLinkedListTestData")
    public Object[] getPalindromeLinkedListTestData() {
        return new Object[]{
                new int[]{1},
                new int[]{1, 2},
                new int[]{1, 2, 1},
                new int[]{1, 2, 2},
                new int[]{1, 2, 2, 1},
                new int[]{},
                new int[]{1, 2, 3, 3, 2, 1},
                new int[]{1, 2, 3, 2, 1},
                new int[]{1, 1, 1, 2, 1, 1},
                new int[]{1, 1, 1, 1, 1, 1, 1, 1},
                new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 10, 9, 8, 8, 7, 6, 5, 4, 3, 2, 1},
                new int[]{-1, -2, -3, -4, -5, -6, -7, 8, 9, 10, 11, 10, 9, 8, -7, -6, -5, -4, -3, -2, -1},
        };
    }

    @DataProvider(name = "RotateListTestData")
    public Object[][] getRotateListTestData() {
        return new Object[][]{
                {new int[]{1, 2, 3,4,5}, 3},
                {new int[]{1, 2, 3,4,5}, 1},
                {new int[]{1, 2, 3,4,5}, 5},
                {new int[]{1, 2, 3,4,5}, 7},
        };
    }
}
