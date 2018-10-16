package de.creativecouple.talks;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PatternTest {

    @Test
    public void testCpuBurningPatternMatching() {
        assertTrue("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                .matches("a?a?a?a?a?a?a?a?a?a?a?a?a?a?a?a?a?a?a?a?a?a?a?a?a?a?a?a?a?a?aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
    }

    @Test
    public void testLinearPatternMatching() throws Exception {
        assertTrue(com.google.re2j.Pattern
                .compile("a?a?a?a?a?a?a?a?a?a?a?a?a?a?a?a?a?a?a?a?a?a?a?a?a?a?a?a?a?a?aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa")
                .matches("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
    }
}
