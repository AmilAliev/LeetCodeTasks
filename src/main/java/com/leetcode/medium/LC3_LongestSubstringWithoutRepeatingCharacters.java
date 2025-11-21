package com.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class LC3_LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {

        int maxLength = 0;

        Map<Character, Integer> map = new HashMap<>();

        for (int right = 0, left = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            if (map.containsKey(currentChar) && map.get(currentChar) >= left) {
                left = map.get(currentChar) + 1;
            }

            maxLength = Math.max(maxLength, right - left + 1);
            map.put(currentChar, right);
        }
        return maxLength;
    }
}
