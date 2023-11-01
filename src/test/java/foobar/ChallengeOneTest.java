package foobar;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ChallengeOneTest {
    @Test
    public void test_case_1() {
        assertEquals(2, ChallengeOne.solution("abccbaabccba"));
    }

    @Test
    public void test_case_2() {
        assertEquals(4, ChallengeOne.solution("abcabcabcabc"));
    }
}
