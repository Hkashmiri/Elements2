package edu.dsu.codingchallenges;

import java.util.HashMap;
import java.util.Map;

public class Problem {
    public int countDuplicates(String data){
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char c : data.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        int duplicateCount = 0;
        for (int count : charCountMap.values()) {
            if (count > 1) {
                duplicateCount++;
    }
}
        return duplicateCount;
    }
    public static void main(String[] args) {
        Problem problem = new Problem();
    }}
