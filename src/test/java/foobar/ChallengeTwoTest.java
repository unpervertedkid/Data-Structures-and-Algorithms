package foobar;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ChallengeTwoTest {
    @Test
    public void test_case_1() {
        assertEquals(1, ChallengeTwo.solution(19, 36));
    }

    @Test
    public void test_case_2() {
        assertEquals(3, ChallengeTwo.solution(0, 1));
    }
}
