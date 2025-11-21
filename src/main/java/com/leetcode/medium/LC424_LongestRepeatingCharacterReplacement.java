package com.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class LC424_LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {

        int maxLength = 0, left = 0, maxFreq = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {

            char c = s.charAt(right);
            map.put(c, map.getOrDefault(c, 0) + 1);

            maxFreq = Math.max(maxFreq, map.get(c));

            // If we need more than k changes → shrink the window
            while ((right - left + 1) - maxFreq > k) {
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                left++;
            }

            // Update result with the size of the current valid window
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
