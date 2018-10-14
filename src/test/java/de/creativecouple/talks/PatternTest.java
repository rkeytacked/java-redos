package de.creativecouple.talks;

import static junit.framework.Assert.assertTrue;

import org.junit.Test;

public class PatternTest {

    @Test
    public void testCpuBurningPatternMatching() {
        assertTrue("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                .matches("a?a?a?a?a?a?a?a?a?a?a?a?a?a?a?a?a?a?a?a?a?a?a?a?a?a?a?a?a?a?aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
    }
}
