package com.github.arungahlawat.learning.tests.ps;

import com.github.arungahlawat.learning.ps.dataStructuresAndAlgorithmsMadeEasy.DSAME_02_01_TowersOfHanoiPuzzle;
import com.github.arungahlawat.learning.ps.dataStructuresAndAlgorithmsMadeEasy.DSAME_02_02_CheckWhetherArrayIsSorted;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DataStructuresAndAlgorithmsMadeEasyTests {
    @BeforeMethod()
    public void beforeMethod() {
        System.out.println("===============================================");
    }

    @Test(description = "02.01 Print moves for moving disks from Tower 'A' to tower 'B' using Towers of Hanoi puzzle",
            dataProvider = "OnePositiveNumberTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.DataStructuresAndAlgorithmsMadeEasyDataProviders.class,
            threadPoolSize = 10,
            groups = {"DSAME0201", "Recursion", "Towers of Hanoi", "Backtracking"})
    public void printMovesForMovingNDisksInTowersOfHanoiPuzzle(int towerHeight) {
        DSAME_02_01_TowersOfHanoiPuzzle dsame0201TowersOfHanoiPuzzle = new DSAME_02_01_TowersOfHanoiPuzzle();
        System.out.printf("Tower height: %d", towerHeight);
        dsame0201TowersOfHanoiPuzzle.printTowersOfHanoiPuzzleMovesForNDisks(towerHeight);
    }

    @Test(description = "02.02 Check whether the input array is sorted",
            dataProvider = "IntegerArrayWithBooleanTestData",
            dataProviderClass = com.github.arungahlawat.learning.tests.ps.dataProviders.DataStructuresAndAlgorithmsMadeEasyDataProviders.class,
            threadPoolSize = 10,
            groups = {"DSAME0202", "Recursion", "Arrays", "Check Sorted Array"})
    public void checkWhetherTheInputArrayIsSorted(int[] input, boolean isAscending) {
        DSAME_02_02_CheckWhetherArrayIsSorted dsame0202CheckWhetherArrayIsSorted = new DSAME_02_02_CheckWhetherArrayIsSorted();
        dsame0202CheckWhetherArrayIsSorted.checkWhetherTheArrayIsSorted(input, isAscending);
    }
}
