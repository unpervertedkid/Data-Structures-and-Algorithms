package foobar;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ChallengeThreeTest {

    @Test
    public void test_case_1() {
        assertEquals(1, ChallengeThree.solution("1211", 10));
    }

    @Test
    public void test_case_2() {
        assertEquals(3, ChallengeThree.solution("210022", 3));
    }
}