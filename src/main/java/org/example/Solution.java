package org.example;

import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> cnt = new HashMap<>();

        for(int i : tangerine) {
            int val = cnt.getOrDefault(i, 0);
            cnt.put(i, val+1);
        }

        Integer[] list = cnt.values().stream().sorted().toArray(Integer[]::new);
        int acc = 0; int answer = 0;
        for(int i=list.length-1; i>=0; i--) {
            acc += list[i]; answer++;
            if(acc >= k) break;
        }

        return answer;
    }
}