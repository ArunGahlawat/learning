package com.github.arungahlawat.learning.ps.leetCode;

import java.util.HashMap;
import java.util.Map;

/*
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
    Symbol       Value
    I             1
    V             5
    X             10
    L             50
    C             100
    D             500
    M             1000
For example, 2 is written as II in Roman numeral, just two ones added together.
12 is written as XII, which is simply X + II.
The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right.
However, the numeral for four is not IIII.
Instead, the number four is written as IV.
Because the one is before the five we subtract it making four.
The same principle applies to the number nine, which is written as IX.
There are six instances where subtraction is used:
    I can be placed before V (5) and X (10) to make 4 and 9.
    X can be placed before L (50) and C (100) to make 40 and 90.
    C can be placed before D (500) and M (1000) to make 400 and 900.

Given a roman numeral, convert it to an integer.
Example 1:
    Input: s = "III"
    Output: 3
    Explanation: III = 3.

Example 2:
    Input: s = "LVIII"
    Output: 58
    Explanation: L = 50, V= 5, III = 3.

Example 3:
    Input: s = "MCMXCIV"
    Output: 1994
    Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

Constraints:
    * 1 <= s.length <= 15
    * s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
    * It is guaranteed that s is a valid roman numeral in the range [1, 3999].
 */
public class P_13_RomanToInteger {
    Map<Character, Integer> romanMap = new HashMap<Character, Integer>() {{
        put('M', 1000);
        put('D', 500);
        put('C', 100);
        put('L', 50);
        put('X', 10);
        put('V', 5);
        put('I', 1);
    }};

    public int romanToInt(String s) {
        int number = 0;
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (i != s.length() - 1 && (romanMap.get(currentChar) < romanMap.get(s.charAt(i + 1)))) {
                number += romanMap.get(s.charAt(i + 1)) - romanMap.get(currentChar);
                i++;
            } else
                number += romanMap.get(currentChar);
        }
        return number;
    }

    public int romanToIntBetter(String s) {
        short[] romanHashtable = new short[26];
        romanHashtable['I' - 'A'] = 1;
        romanHashtable['V' - 'A'] = 5;
        romanHashtable['X' - 'A'] = 10;
        romanHashtable['L' - 'A'] = 50;
        romanHashtable['C' - 'A'] = 100;
        romanHashtable['D' - 'A'] = 500;
        romanHashtable['M' - 'A'] = 1000;
        int number = 0;
        int index = 0;
        while (index < s.length()) {
            short currentIndexValue = romanHashtable[s.charAt(index) - 'A'];
            if (index < s.length() - 1 && currentIndexValue < romanHashtable[s.charAt(index + 1) - 'A'])
                number -= currentIndexValue;
            else
                number += currentIndexValue;
            index++;
        }
        return number;
    }
}
