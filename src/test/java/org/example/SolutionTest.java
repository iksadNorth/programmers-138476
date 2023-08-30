package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SolutionTest {
    private final Solution solution = new Solution();

    public void assertAnswer(int k, int[] tangerine, int answer) {
        // when
        int result = solution.solution(k, tangerine);

        // then
        Assertions.assertEquals(result, answer);
    }

    @Test
    void testcase1() {
        // given
        int k=6;
        int[] tangerine={1, 3, 2, 5, 4, 5, 2, 3};
        int answer = 3;

        // when & then
        assertAnswer(k, tangerine, answer);
    }

    @Test
    void testcase2() {
        // given
        int k=4;
        int[] tangerine={1, 3, 2, 5, 4, 5, 2, 3};
        int answer = 2;

        // when & then
        assertAnswer(k, tangerine, answer);
    }

    @Test
    void testcase3() {
        // given
        int k=2;
        int[] tangerine={1, 1, 1, 1, 2, 2, 2, 3};
        int answer = 1;

        // when & then
        assertAnswer(k, tangerine, answer);
    }
}