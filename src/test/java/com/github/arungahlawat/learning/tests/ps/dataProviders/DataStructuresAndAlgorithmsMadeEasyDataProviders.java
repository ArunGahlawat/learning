package com.github.arungahlawat.learning.tests.ps.dataProviders;

import org.testng.annotations.DataProvider;

public class DataStructuresAndAlgorithmsMadeEasyDataProviders {
    @DataProvider(name = "OnePositiveNumberTestData")
    public Object[] getOnePositiveNumberTestData() {
        return new Object[]{
                0,
                1,
                2,
                3,
                4,
                5
        };
    }

    @DataProvider(name = "TwoPositiveNumbersTestData")
    public Object[] getTwoPositiveNumbersTestData() {
        return new Object[][]{
                {2, 10},
                {0, 1},
                {1, 0},
                {0, 2},
                {2, 0},
                {1, 2},
                {2, 1},
                {2, 2},
        };
    }

    @DataProvider(name = "OneIntegerArrayTestData")
    public Object[] getOneIntegerArrayTestData() {
        return new Object[]{
                new int[]{1, 2, 3, 4, 5, 6},
                new int[]{1, 1, 1, 1, 1},
                new int[]{1},
                new int[]{-1, 1},
                new int[]{0, 0},
                new int[]{1, 0, 1},
                new int[]{6, 5, 4, 3, 2, 1},
                new int[]{1, 2, 2, 1, 1, 2, 2, 1},
        };
    }

    @DataProvider(name = "IntegerArrayWithBooleanTestData")
    public Object[] getIntegerArrayWithBooleanTestData() {
        return new Object[][]{
                {new int[]{1, 2, 3, 4, 5, 6}, true},
                {new int[]{1, 2, 3, 4, 5, 6}, false},
                {new int[]{1, 1, 1, 1, 1}, true},
                {new int[]{1, 1, 1, 1, 1}, false},
                {new int[]{1}, true},
                {new int[]{1}, false},
                {new int[]{-1, 1}, true},
                {new int[]{-1, 1}, false},
                {new int[]{0, 0}, true},
                {new int[]{0, 0}, false},
                {new int[]{1, 0, 1}, true},
                {new int[]{1, 0, 1}, false},
                {new int[]{6, 5, 4, 3, 2, 1}, true},
                {new int[]{6, 5, 4, 3, 2, 1}, false},
                {new int[]{1, 2, 2, 1, 1, 2, 2, 1}, true},
                {new int[]{1, 2, 2, 1, 1, 2, 2, 1}, false},
        };
    }

    @DataProvider(name = "IntegerArrayWithIntegerValueTestData")
    public Object[] getIntegerArrayWithIntegerValueTestData() {
        return new Object[][]{
                {new int[]{1, 2, 3, 4, 5, 6}, 2},
                {new int[]{1, 1, 1, 1, 1}, 1},
                {new int[]{1}, 1},
                {new int[]{-1, 1}, 2},
                {new int[]{0, 0}, 1},
                {new int[]{1, 0, 1}, 2},
                {new int[]{6, 5, 4, 3, 2, 1}, 5},
                {new int[]{1, 2, 2, 1, 1, 2, 2, 1}, 2},
                {new int[]{1, 2, 2, 1, 1, 2, 2, 1}, 8},
                {new int[]{1, 2, 2, 1, 1, 2, 2, 1}, 9},
                {new int[]{}, 0},
                {new int[]{}, 1}
        };
    }

    @DataProvider(name = "OneIntegerArrayWithMaxOneDuplicateTestData")
    public Object[] getOneIntegerArrayWithMaxOneDuplicateTestData() {
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

    @DataProvider(name = "OneSortedIntegerArrayInAscendingOrderWithOneIntegerValueTestData")
    public Object[] getOneSortedIntegerArrayInAscendingOrderWithOneIntegerValueTestData() {
        return new Object[][]{
                {new int[]{1, 2, 3, 4, 5, 6}, 6},
                {new int[]{1, 2, 2, 3, 3, 3, 4, 4, 4, 4}, 3},
                {new int[]{1, 1, 1, 1}, 2},
                {new int[]{1}, 1},
                {new int[]{}, -1},
                {new int[]{1, 2, 3}, 4},
                {new int[]{-9, -8, -7, -6, -5, -4, 0}, -10},
                {new int[]{0, 0}, 0}
        };
    }
}
